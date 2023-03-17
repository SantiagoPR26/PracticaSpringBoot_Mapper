package com.example.demo.infrastructure.event.listen;

import com.example.demo.domain.entities.Carro;
import com.example.demo.domain.services.CarGetService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
@AllArgsConstructor
@Component
@Slf4j
public class Receiver {

  private final ObjectMapper objectMapper;
  private final CarGetService carGetService;


  public static String RECEIVE_METHOD_NAME = "receiveMessage";

  public void receiveMessage(byte[] message) throws JsonProcessingException {

          String recievemessage = new String(message, StandardCharsets.UTF_8);
          Carro carro = objectMapper.readValue(recievemessage, Carro.class);
    log.info("Received message [ {} ]", objectMapper.writeValueAsString(carGetService.getCarro(carro.getPlaca())));
  }



}
