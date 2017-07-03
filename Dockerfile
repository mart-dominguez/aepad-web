FROM payara/server-full:latest
MAINTAINER AEPAD "martdominguez"
# despliego el war
COPY aepad-cliente01.war $DEPLOY_DIR
USER root
RUN apt-get update && apt-get install atsar