#!/bin/bash -eux
id
ls -la /usr/local/app
mvn install
mvn exec:java  -Dexec.mainClass=HelloWorld
