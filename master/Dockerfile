FROM jenkinsci/jenkins:lts-alpine
ENV JAVA_OPTS '-Djenkins.install.runSetupWizard=false'

COPY init.groovy.d/* /usr/share/jenkins/ref/init.groovy.d/
COPY jobs.groovy /var/jenkins_home/jobs.groovy

USER root
RUN install-plugins.sh swarm workflow-aggregator job-dsl git blueocean
USER jenkins
