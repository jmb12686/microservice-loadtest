FROM openjdk:8-jre-alpine
WORKDIR /opt/microprofile
ADD target/loadtest-service-swarm.jar loadtest-service-swarm.jar
RUN echo "#!/bin/sh" >  wildfly-swarm.sh
RUN echo "shift 2" >>  wildfly-swarm.sh
RUN echo "java -Dswarm.http.port=\$SERVER_PORT -Djava.net.preferIPv4Stack=true -jar /opt/microprofile/loadtest-service-swarm.jar \$@" >> wildfly-swarm.sh
RUN chmod +x wildfly-swarm.sh
ENV SERVER_PORT 9999
ENTRYPOINT ["/opt/microprofile/wildfly-swarm.sh"]

