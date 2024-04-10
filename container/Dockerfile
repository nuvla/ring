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

COPY target/dependency/lib /opt/nuvla/server/lib
COPY src/scripts/log4j.properties /opt/nuvla/server/resources/
COPY src/scripts/start.sh /opt/nuvla/server/bin/
RUN chmod 0755 /opt/nuvla/server/bin/start.sh \
    && mkdir -p /opt/nuvla/server/lib.d/

RUN apk upgrade --update-cache --available && \
    apk --no-cache add openssl &&  \
    apk --no-cache add curl && \
    rm -rf /var/cache/apk/*

ENV NUVLA_SERVER_INIT=sixsq.nuvla.server.example/init

EXPOSE 8200

WORKDIR /opt/nuvla/server
ENTRYPOINT ["/opt/nuvla/server/bin/start.sh"]
