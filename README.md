# CiMS/VAS Interface [![Build Status](https://secure.travis-ci.org/thenewmotion/vas.png)](http://travis-ci.org/thenewmotion/vas)

You can find more details in [pdf](http://github.com/thenewmotion/vas/blob/master/010.030.006_Logica.CiMS.EID.VAS_C1137.pdf)

## Distribution includes

* vas-publisher-service
* vas-subscriber-client

## Setup

1. Add this repository to your pom.xml:
```xml
    <repository>
        <id>thenewmotion</id>
        <name>The New Motion Repository</name>
        <url>http://nexus.thenewmotion.com/content/repositories/releases-public</url>
    </repository>
```

2. Add dependency to your pom.xml:
```xml
    <dependency>
        <groupId>com.thenewmotion.chargenetwork.vas</groupId>
        <artifactId>vas-publisher-service</artifactId>
        <version>1.1</version>
    </dependency>
```
```xml
    <dependency>
        <groupId>com.thenewmotion.chargenetwork.vas</groupId>
        <artifactId>vas-subscriber-client_2.10</artifactId>
        <version>1.1</version>
    </dependency>
```