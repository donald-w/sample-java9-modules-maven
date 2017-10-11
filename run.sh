#!/bin/sh
java \
--module-path \
jigsaw-service/target/jigsaw-service-0.0.1-SNAPSHOT.jar:\
jigsaw-app/target/jigsaw-app-0.0.1-SNAPSHOT.jar:\
jigsaw-animals-service/target/jigsaw-animals-service-0.0.1-SNAPSHOT.jar:\
jigsaw-numbers-service/target/jigsaw-numbers-service-0.0.1-SNAPSHOT.jar \
-m \
com.donaldw.jigsaw.app/com.donaldw.jigsaw.Jigsaw
