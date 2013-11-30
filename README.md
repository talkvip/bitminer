
    // Use the factory to get the version 2 MtGox exchange API using default settings
    Exchange mtGox = ExchangeFactory.INSTANCE.createExchange("com.xeiam.xchange.mtgox.v2.MtGoxExchange");

    // Interested in the public polling market data feed (no authentication)
    PollingMarketDataService marketDataService = mtGox.getPollingMarketDataService();

    // Get the latest ticker data showing BTC to USD
    Ticker ticker = marketDataService.getTicker(Currencies.BTC, Currencies.USD);
    
    System.out.println(ticker.toString());
    
All exchange implementations expose the same API, but you can also directly access the raw data.

Now go ahead and [study some more examples](http://xeiam.com/xchange_examplecode.jsp), [download the thing](http://xeiam.com/xchange_changelog.jsp) and [provide feedback](https://github.com/timmolter/XChange/issues).

## Features
* MIT license
* consistent API across all implemented exchanges
* active development
* very minimal 3rd party dependencies
* modular components
* polling and streaming capability
    
## Continuous Integration
[![Build Status](https://travis-ci.org/timmolter/XChange.png?branch=develop)](https://travis-ci.org/timmolter/XChange.png)  
[Build History](https://travis-ci.org/timmolter/XChange/builds)  

## Getting Started
XChange is semantically versioned: http://semver.org  

### Non-Maven
Download XChange Release Jars: http://xeiam.com/xchange.jsp
Download XChange Snapshot Jars: https://oss.sonatype.org/content/groups/public/com/xeiam/xchange/

#### Compile Dependencies
    +- org.java-websocket:Java-WebSocket:jar:1.3.0:compile
    +- org.slf4j:slf4j-api:jar:1.7.5:compile
    +- org.joda:joda-money:jar:0.9:compile
    \- com.github.mmazi:rescu:jar:1.5.0:compile
        +- com.fasterxml.jackson.core:jackson-core:jar:2.1.1:compile
        +- com.fasterxml.jackson.core:jackson-annotations:jar:2.1.1:compile
        +- com.fasterxml.jackson.core:jackson-databind:jar:2.1.1:compile
        +- javax.ws.rs:jsr311-api:jar:1.1.1:compile
        \- com.google.code.findbugs:jsr305:jar:2.0.1:compile

#### Test Dependencies
    +- junit:junit:jar:4.11:test
    |    \- org.hamcrest:hamcrest-core:jar:1.3:test
    \- org.easytesting:fest-assert-core:jar:2.0M10:test
        \- org.easytesting:fest-util:jar:1.2.5:test
   
#### Other Dependencies for Some Examples
    +- ch.qos.logback:logback-classic:jar:1.0.13:runtime
    |    \- ch.qos.logback:logback-core:jar:1.0.13:runtime
    +- com.xeiam.xchart:xchart:jar:2.2.1:compile

### Maven
The XChange release artifacts are hosted on Maven Central. 
  
Add the following dependencies in your pom.xml file. You will need at least xchange-core. Add the additional dependencies for the exchange implementations you are interested in. There is example code for all the implementations in xchange-examples.

    <dependency>
      <groupId>com.xeiam.xchange</groupId>
      <artifactId>xchange-core</artifactId>
      <version>1.10.0</version>
    </dependency>
    <dependency>
      <groupId>com.xeiam.xchange</groupId>
      <artifactId>xchange-examples</artifactId>
      <version>1.10.0</version>
    </dependency>
    <dependency>
      <groupId>com.xeiam.xchange</groupId>
      <artifactId>xchange-bitcoincharts</artifactId>
      <version>1.10.0</version>
    </dependency>
    <dependency>
      <groupId>com.xeiam.xchange</groupId>
      <artifactId>xchange-bitcurex</artifactId>
      <version>1.10.0</version>
    </dependency>
    <dependency>
      <groupId>com.xeiam.xchange</groupId>
      <artifactId>xchange-bitstamp</artifactId>
      <version>1.10.0</version>
    </dependency>  
    <dependency>
      <groupId>com.xeiam.xchange</groupId>
      <artifactId>xchange-blockchain</artifactId>
      <version>1.10.0</version>
    </dependency>  
    <dependency>
      <groupId>com.xeiam.xchange</groupId>
      <artifactId>xchange-btcchina</artifactId>
      <version>1.10.0</version>
    </dependency> 
    <dependency>
      <groupId>com.xeiam.xchange</groupId>
      <artifactId>xchange-btce</artifactId>
      <version>1.10.0</version>
    </dependency>
    <dependency>
      <groupId>com.xeiam.xchange</groupId>
      <artifactId>xchange-campbx</artifactId>
      <version>1.10.0</version>
    </dependency>
    <dependency>
      <groupId>com.xeiam.xchange</groupId>
      <artifactId>xchange-cavirtex</artifactId>
      <version>1.10.0</version>
    </dependency>
    <dependency>
      <groupId>com.xeiam.xchange</groupId>
      <artifactId>xchange-kraken</artifactId>
      <version>1.10.0</version>
    </dependency>
    <dependency>
      <groupId>com.xeiam.xchange</groupId>
      <artifactId>xchange-mtgox</artifactId>
      <version>1.10.0</version>
    </dependency>
    <dependency>
      <groupId>com.xeiam.xchange</groupId>
      <artifactId>xchange-openexchangerates</artifactId>
      <version>1.10.0</version>
    </dependency>
    
For snapshots, add the following repository to your pom.xml file.

    <repository>
      <id>sonatype-oss-snapshot</id>
      <snapshots/>
      <url>https://oss.sonatype.org/content/repositories/snapshots</url>
    </repository>
    
The current snapshot version is: 

    2.0.0-SNAPSHOT
    
## Building with Maven

install in local Maven repo: `mvn clean install`  
create project javadocs: `mvn javadoc:aggregate`  
run integration tests: `mvn clean integration-test -P run-integration-tests`  
generate dependency tree: `mvn dependency:tree`  
create jar files with dependencies (-with-dependencies.jar): `mvn install`  
check/update all header files: `mvn license:check` and `mvn license:format`

## Bugs
Please report any bugs or submit feature requests to [XChange's Github issue tracker](https://github.com/timmolter/XChange/issues).

## Contributing
If you'd like to submit a new implementation for another exchange, please take a look at [New Implementation Best Practices](https://github.com/timmolter/XChange/wiki/New-Implementation-Best-Practices) first, as there are lots of time-saving tips! 

For more information such as a contributor list and a list of known projects depending on XChange, visit the [Main Project Wiki](https://github.com/timmolter/XChange/wiki). 

## Donations
15MvtM8e3bzepmZ5vTe8cHvrEZg6eDzw2w
