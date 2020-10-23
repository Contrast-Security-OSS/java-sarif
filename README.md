# Java SARIF

Contains POJOs generated from the [Static Analysis Results Interchange Format 
(SARIF)](https://docs.oasis-open.org/sarif/sarif/v2.1.0/sarif-v2.1.0.html) JSON schema.

It uses Jackson for serialising/deserialing from JSON.

## Usage

<!-- TODO: Release and uncomment
### Add as a dependency

```xml
<dependency>
    <groupId>com.contrastsecurity</groupId>
    <artifactId>java-sarif</artifactId>
    <version>${java-sarif.version}</version>
</dependency>
```
-->

### Developing with Java SARIF

All classes reside in the `com.contrastsecurity.sarif` package. The JSON schema used to generate 
them is located in `src/main/resources/schema`.

#### Building Objects

Building is provided with method chaining, e.g. for Message

```java
import com.contrastsecurity.sarif.Message;
// ...
Message message = new Message()
    .withText("SQL Injection")
    .withMarkdown("# SQL Injection");
```

Public Getters & Setters are provided.

#### Jackson

Classes are decorated with `@JsonInclude(JsonInclude.Include.NON_NULL)` and `@JsonPropertyOrder`
which dictates the order from the JSON schema.

```java
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
// ...
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "text",
    "markdown",
    "id",
    "arguments",
    "properties"
})
public class Message {
    // ...
}
```

<br/>
<hr/>
<br/>

This library uses [jsonschema2pojo](https://github.com/joelittlejohn/jsonschema2pojo) for 
generation.