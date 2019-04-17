#!/bin/bash -x

TAG=NONE

VERSION=NONE

BRANCH=${1:-master}

PUSH_CHANGES=${2:-false}

if [ "${PUSH_CHANGES}" == "true" ]; then
    TARGET=deploy
else
    TARGET=install
fi

if [ `uname` == 'Darwin' ]; then
    SED_OPTS = "-i ''"
else
    SED_OPTS = "-i"
fi

do_push() {
    if [ "${PUSH_CHANGES}" == "true" ]; then
        echo "INFO: PUSHING changes."
        git push
    else
        echo "INFO: not pushing changes."
    fi
}

do_push_tag() {
    if [ "${PUSH_CHANGES}" == "true" ]; then
        echo "INFO: PUSHING tag ${TAG}."
        git push origin ${TAG}
    else
        echo "INFO: not pushing tag."
    fi
}

# set the tag
set_tag() {
  TAG="${TAG_VERSION}"
  export TAG
}

# update pom.xml files for tag and next development version
tag_release() {

  # make the release tag
  (git add . ; git commit -m "release ${TAG}"; do_push; git tag ${TAG}; do_push_tag)

}

# update pom.xml files for tag and next development version
update_to_snapshot() {

  # update to next development version
  (git add . ; git commit -m "next development version"; do_push)
}

do_tag() {
    set_tag
    echo "TAG = ${TAG}"
    echo "VERSION = ${TAG_VERSION}"
    echo "TAGGING"
    tag_release
    echo
}

do_update() {
    echo "SNAPSHOT = ${NEXT_RELEASE}"

    echo "UPDATING: ${repo}"
    update_to_snapshot
    echo
}

update_pom_versions() {
    v=$1
    if [ "${v}" == "" ]; then
        echo "missing version for pom version update"
        exit 1
    fi

    mvn -Djvmargs="-Xmx1024M" \
        -f pom.xml \
        -B \
        -DskipTests \
        versions:set -DnewVersion=${v} -DgenerateBackupPoms=false
}

update_project_versions() {
    v=$1
    if [ "${v}" == "" ]; then
        echo "missing version for project.clj version update"
        exit 1
    fi
    echo 'Updating project.clj versions to ' ${v}
    find . -name project.clj -exec sed SED_OPTS "s/^(defproject sixsq.nuvla.ring/code .*/(defproject sixsq.nuvla.ring/code "${v}\")/" {} \;
}


#
# calculate the versions
#

mvn -Djvmargs="-Xmx1024M" \
    -f pom.xml \
    -B \
    -DskipTests \
    validate

source versions.sh

export TAG_VERSION
export NEXT_VERSION

echo ${TAG_VERSION}
echo ${NEXT_VERSION}

#
# update to release version
#

update_pom_versions ${TAG_VERSION}
update_project_versions ${TAG_VERSION}

#
# tag release
#

do_tag

#
# update to next snapshot version
#

update_pom_versions ${NEXT_VERSION}
update_project_versions ${NEXT_VERSION}

#
# update master to snapshot
#
do_update
