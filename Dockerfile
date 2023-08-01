ARG VERSION=1.0.0
FROM sbtscala/scala-sbt:eclipse-temurin-17.0.4_1.7.1_3.2.0 as build
RUN apt update && apt install -y python3 git curl bash zip
RUN ln -sf python3 /usr/bin/python

WORKDIR /home/appcd-trait-finder
COPY . .
ARG VERSION=dev
ARG JAR_VERSION=dev

RUN mkdir -p src/main/resources && echo $VERSION > src/main/resources/version.txt

RUN export BUILD_VERSION=$JAR_VERSION && sbt test clean  universal:packageBin

RUN mkdir -p /tmp/traitfinder && ls target/universal/traitfinder-*.zip && unzip target/universal/traitfinder-*.zip -d /tmp/traitfinder 

FROM eclipse-temurin:17.0.4.1_1-jre

WORKDIR /home

COPY --from=build /tmp/traitfinder/* /home

ENTRYPOINT [ "/home/bin/traitfinder" ]