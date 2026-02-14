# translation.simpson.services

[![](https://jitpack.io/v/bensimpson-ch/translation.simpson.services.svg)](https://jitpack.io/#bensimpson-ch/translation.simpson.services)

Shared libraries for translation messaging between services that communicate via Apache Kafka.

## Modules

### messaging-types

Plain Java records that define the structure of Kafka messages exchanged between translation producers and consumers.

- `TranslationRequestMessage` - sent by a service requesting translation of content into a target language
- `TranslationResponseMessage` - sent by the translation service with the translated content

These types have zero dependencies beyond the Java standard library.

### kafka-client

Kafka client utilities for producing and consuming translation messages. Depends on `messaging-types`.

## Usage

Add the JitPack repository and dependency to your Maven project:

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependency>
    <groupId>com.github.bensimpson-ch.translation.simpson.services</groupId>
    <artifactId>messaging-types</artifactId>
    <version>v1.0.0</version>
</dependency>
```

## Requirements

- Java 21+
- Maven 3.9+

## License

[MIT](LICENSE)
