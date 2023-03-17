package com.example.demo.infrastructure.adapter;

import com.example.demo.domain.services.CarDeleteService;
import com.example.demo.infrastructure.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarDeleteAdapter implements CarDeleteService {

  private final CarRepository carRepository;

  @Override
  public void deleteCar(String placa) {
    carRepository.deleteById(placa);
  }


}
