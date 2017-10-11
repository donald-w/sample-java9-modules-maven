jlink --module-path ^
%JAVA_HOME%\jmods;^
jigsaw-service\target\jigsaw-service-0.0.1-SNAPSHOT.jar;^
jigsaw\target\jigsaw-0.0.1-SNAPSHOT.jar;^
jigsaw-animals-service\target\jigsaw-animals-service-0.0.1-SNAPSHOT.jar;^
jigsaw-numbers-service\target\jigsaw-numbers-service-0.0.1-SNAPSHOT.jar ^
--add-modules ^
com.donaldw.jigsaw.app,^
com.donaldw.jigsaw.service,^
com.donaldw.jigsaw.numbers.service,^
com.donaldw.jigsaw.animals.service ^
--no-header-files ^
--no-man-pages ^
--strip-debug ^
--compress=2 ^
--launcher command=com.donaldw.jigsaw.app/com.donaldw.jigsaw.Jigsaw ^
--output target

REM target\bin\java -m com.donaldw.jigsaw.app/com.donaldw.jigsaw.Jigsaw

target\bin\command