FROM mcr.microsoft.com/vscode/devcontainers/java:21-jdk-bullseye

RUN apt-get update && apt-get -y install git zip unzip curl default-mysql-client  && \
    curl -s "https://get.sdkman.io" | bash

WORKDIR /work/backend

ENV TZ=Asia/Tokyo
