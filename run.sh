#!/bin/bash -eux
mvn install
mvn exec:java  -Dexec.mainClass=HelloWorld