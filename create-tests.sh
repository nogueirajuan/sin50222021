#!/usr/bin/env bash

#build project jar file
docker run -it --rm --name SIN50222021 -v "$(pwd)":/usr/src/mymaven -w /usr/src/mymaven maven:3.8.1-jdk-11 mvn clean install

#gen tests and put in src/test/java/codigo
java -classpath target/SIN5022-2021-AUTOMACAO-1.0-SNAPSHOT.jar:randoop-all-4.2.6.jar randoop.main.Main gentests --classlist=myclasses.txt --junit-output-dir="src/test/java/codigos/"

#build project again and generate reports
docker run -it --rm --name SIN50222021 -v "$(pwd)":/usr/src/mymaven -w /usr/src/mymaven maven:3.8.1-jdk-11 mvn clean install org.pitest:pitest-maven:mutationCoverage

#open jacoco report
google-chrome target/site/jacoco/index.html

#open pitest report
google-chrome target/pit-reports/*/index.html