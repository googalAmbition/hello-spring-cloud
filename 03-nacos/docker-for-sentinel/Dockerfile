FROM openjdk:8

ENV SENTINEL_HOME /opt/sentinel-dashboard

RUN mkdir -p ${SENTINEL_HOME}

COPY sentinel-dashboard-1.8.5.jar ${SENTINEL_HOME}

RUN chmod -R +x ${SENTINEL_HOME}/*jar

WORKDIR ${SENTINEL_HOME}

ENV JAVA_OPTS -Dserver.port=8858 -Dcsp.sentinel.dashboard.server=127.0.0.1:8858  -Dproject.name=sentinel-dashboard
CMD java ${JAVA_OPTS} -jar sentinel-dashboard-1.8.5.jar


