jlink --module-path ^
%JAVA_HOME%\jmods;^
jigsaw-service\target\jigsaw-service-0.0.1-SNAPSHOT.jar;^
jigsaw-app\target\jigsaw-appp-0.0.1-SNAPSHOT.jar;^
jigsaw-service-animals\target\jigsaw-service-animals-0.0.1-SNAPSHOT.jar;^
jigsaw-service-numbers\target\jigsaw-service-numbers-0.0.1-SNAPSHOT.jar ^
--add-modules ^
com.donaldw.jigsaw.app,^
com.donaldw.jigsaw.service,^
com.donaldw.jigsaw.service.numbers,^
com.donaldw.jigsaw.service.animals ^
--no-header-files ^
--no-man-pages ^
--strip-debug ^
--compress=2 ^
--launcher command=com.donaldw.jigsaw.app/com.donaldw.jigsaw.Jigsaw ^
--output target

REM target\bin\java -m com.donaldw.jigsaw.app/com.donaldw.jigsaw.Jigsaw

target\bin\command