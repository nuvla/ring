FROM openjdk:8-jre-slim

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
