#!/bin/bash

./gradlew clean build

docker build -t k8s-spring-server .