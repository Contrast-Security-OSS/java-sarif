package com.contrastsecurity.sarif;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import java.io.IOException;
import java.io.StringWriter;

public class SerializationTests {
  @Test
  void it_serializes_without_junk() throws IOException {
   Result result = new Result()
       .withMessage(new Message().withText("hi"))
       .withLevel(Result.Level.ERROR);

    StringWriter writer = new StringWriter();
    ObjectMapper mapper = new ObjectMapper();
    JsonGenerator generator = mapper.writerWithDefaultPrettyPrinter().createGenerator(writer);

    generator.writeObject(result);
    JsonNode actual =  new ObjectMapper().readTree(writer.toString());
    JsonNode expected = new ObjectMapper().readTree("{\"level\" : \"error\", \"message\" : { \"text\" : \"hi\" } }");

    assertThat(actual).isEqualTo(expected);
  }
}
