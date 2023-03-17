package com.example.demo.application;

import com.example.demo.domain.entities.Moto;
import com.example.demo.domain.services.MotGetService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MotGet {

  private final MotGetService motGetService;

  public Moto getMot(String placa) {
    return motGetService.getMoto(placa);
  }

}
