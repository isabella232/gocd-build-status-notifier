#!/bin/sh
rm -rf dist/
mkdir dist

mvn clean install -DskipTests -P localytics.pr.status
cp target/localytics-pr-status*.jar dist/
