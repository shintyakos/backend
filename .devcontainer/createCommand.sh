#!/bin/bash

# 一時的にSDKのパスを通す
source "/usr/local/sdkman/bin/sdkman-init.sh"

# spring/gradleのインストール
sdk install springboot
sdk install gradle
