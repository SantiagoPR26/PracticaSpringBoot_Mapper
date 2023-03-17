package com.example.demo.application;

import com.example.demo.domain.entities.Carro;
import com.example.demo.domain.services.CarEditService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarEdit {

  private final CarEditService carEditService;

  public void editCar(Carro carro) {
    carEditService.editCar(carro);
  }
}
