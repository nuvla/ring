FROM openjdk:8-jre-slim

ARG GIT_BRANCH
ARG GIT_COMMIT_ID
ARG GIT_DIRTY
ARG GIT_BUILD_TIME
ARG GIT_BUILD_NUMBER_UNIQUE

LABEL git.branch=${GIT_BRANCH}
LABEL git.commit.id=${GIT_COMMIT_ID}
LABEL git.dirty=${GIT_DIRTY}
LABEL git.build.time=${GIT_BUILD_TIME}
LABEL git.build.number.unique=${GIT_BUILD_NUMBER_UNIQUE}

ADD target/dependency/lib /opt/nuvla/server/lib
ADD src/scripts/start.sh /opt/nuvla/server/bin/start.sh
ADD src/scripts/log4j.properties /opt/nuvla/server/resources/log4j.properties

RUN /usr/sbin/groupadd -r nuvla
RUN /usr/sbin/useradd -r -d /opt/nuvla/server -g nuvla nuvla
RUN mkdir -p /opt/nuvla/server/lib.d/example
RUN chmod 0755 /opt/nuvla/server/bin/start.sh

ENV NUVLA_SERVER_INIT=sixsq.nuvla.server.example/init

EXPOSE 8200

WORKDIR /opt/nuvla/server
ENTRYPOINT ["/opt/nuvla/server/bin/start.sh"]
