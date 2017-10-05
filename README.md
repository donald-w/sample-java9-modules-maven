
# A canonical maven multi module project using Java 9 / Jigsaw

## Originally Based on [ConSol/java9-modules-maven-junit-example]

Read more in their blog post: [Getting Started with Java 9 Modules]

Demonstrates a few things:
* How to invoke test module internals using JUnit
* How to use `ServiceLoader` to discover services provided by modules

## Build / Run

### Windows
* `.\mvnw.cmd clean install`
* `.\run.cmd`

### *nix
* `./mvnw clean install`
* `./run.sh`

## TODO

* Figure out an alternative to run.cmd / run.sh !

[Getting Started with Java 9 Modules]: https://labs.consol.de/development/2017/02/13/getting-started-with-java9-modules.html
[ConSol/java9-modules-maven-junit-example]: https://github.com/ConSol/java9-modules-maven-junit-example/