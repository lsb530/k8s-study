#!/bin/bash

./gradlew clean build

docker build -t kube-ecr .