#!/bin/sh
java \
--module-path \
jigsaw-service/target/jigsaw-service-0.0.1-SNAPSHOT.jar:\
jigsaw-app/target/jigsaw-app-0.0.1-SNAPSHOT.jar:\
jigsaw-service-animals/target/jigsaw-service-animals-0.0.1-SNAPSHOT.jar:\
jigsaw-service-numbers/target/jigsaw-service-numbers-0.0.1-SNAPSHOT.jar \
-m \
com.donaldw.jigsaw.app/com.donaldw.jigsaw.Jigsaw
