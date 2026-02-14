# translation.simpson.services

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

Add the dependency to your Maven project:

```xml
<dependency>
    <groupId>services.simpson.translation</groupId>
    <artifactId>messaging-types</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```

## Requirements

- Java 21+
- Maven 3.9+
