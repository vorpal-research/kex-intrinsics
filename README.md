# Kex Intrinsics

Library of intrinsics to guide [Kex](https://github.com/vorpal-research/kex) tool

## Build

```
mvn clean package
```

## Usage

The latest release is available through [Vorpal GitHub Packages repository](https://github.com/orgs/vorpal-research/packages).
To have access to the repository, you should be [authenticated to GitHub Packages](https://docs.github.com/en/packages/guides/configuring-apache-maven-for-use-with-github-packages#authenticating-to-github-packages)
with following configuration:
```xml
<server>
  <id>github-vorpal-research-kotlin-maven</id>
  <username>USERNAME</username>
  <password>TOKEN</password>
</server>
``` 

Add the link to the repository to your `pom.xml`:
```xml
<repository>
    <id>github-vorpal-research-kotlin-maven</id>
    <url>https://maven.pkg.github.com/vorpal-research/kotlin-maven</url>
</repository>
```

Include:
```xml
<dependency>
	<groupId>org.jetbrains.research</groupId>
	<artifactId>kex-intrinsics</artifactId>
	<version>${kex-intrinsics.version}</version>
	<type>pom</type>
</dependency>
```