# A sample maven multi module project using Java 9 / Jigsaw

[![wercker status](https://app.wercker.com/status/dc456049b9fa96a5bcb8b40fc06fff69/m/master "wercker status")](https://app.wercker.com/project/byKey/dc456049b9fa96a5bcb8b40fc06fff69)

Demonstrate Java 9 Module related features
* How to invoke test module internals using JUnit
* How to use `ServiceLoader` to discover services provided by modules
* How to use jlink to build a custom runtime using maven (See jigsaw-jlink project)

## Usage

### Windows
Clean build
```shell
.\mvnw.cmd clean install
```

Run example
```shell
.\run.cmd
```


### *nix
Clean build
```shell
./mvnw clean install
```

Run example
```shell
./run.sh
```

## Originally Based on [ConSol/java9-modules-maven-junit-example]
Read more in their blog post: [Getting Started with Java 9 Modules]

[Getting Started with Java 9 Modules]: https://labs.consol.de/development/2017/02/13/getting-started-with-java9-modules.html
[ConSol/java9-modules-maven-junit-example]: https://github.com/ConSol/java9-modules-maven-junit-example/