FROM eclipse-temurin:21-alpine

ARG GIT_BRANCH
ARG GIT_COMMIT_ID
ARG GIT_DIRTY
ARG GIT_BUILD_TIME
ARG CI_BUILD_NUMBER
ARG CI_BUILD_WEB_URL

LABEL git.branch=${GIT_BRANCH}
LABEL git.commit.id=${GIT_COMMIT_ID}
LABEL git.dirty=${GIT_DIRTY}
LABEL git.build.time=${GIT_BUILD_TIME}
LABEL ci.build.number=${CI_BUILD_NUMBER}
LABEL ci.build.web.url=${CI_BUILD_WEB_URL}

ADD target/dependency/lib /opt/nuvla/server/lib
ADD src/scripts/start.sh /opt/nuvla/server/bin/start.sh
ADD src/scripts/log4j.properties /opt/nuvla/server/resources/log4j.properties

RUN mkdir -p /opt/nuvla/server/lib.d/example
RUN chmod 0755 /opt/nuvla/server/bin/start.sh

RUN addgroup -S nuvla && adduser -S nuvla -G nuvla
USER nuvla

ENV NUVLA_SERVER_INIT=sixsq.nuvla.server.example/init

EXPOSE 8200

WORKDIR /opt/nuvla/server
ENTRYPOINT ["/opt/nuvla/server/bin/start.sh"]
