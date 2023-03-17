package com.example.demo.application;

import com.example.demo.domain.services.CarDeleteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarDelete {

  private final CarDeleteService carDeleteService;

  public void deleteCar(String placa) {
    carDeleteService.deleteCar(placa);
  }

}
