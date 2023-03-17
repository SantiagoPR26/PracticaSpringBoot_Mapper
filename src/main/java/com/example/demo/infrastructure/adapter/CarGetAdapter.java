package com.example.demo.infrastructure.adapter;

import com.example.demo.domain.entities.Carro;
import com.example.demo.domain.services.CarGetService;
import com.example.demo.infrastructure.dto.CarroDto;
import com.example.demo.infrastructure.repository.CarRepository;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarGetAdapter implements CarGetService {

  private final CarRepository carRepository;

  public Carro getCarro(String placa) {
    Optional<CarroDto> carroDto = carRepository.findById(placa);

    return carroDto.map(this::buildCarro).orElse(null);
  }


  private Carro buildCarro(CarroDto carro) {

    return new Carro(carro.getMarca(), carro.getPlaca(), carro.getModelo(), carro.getPrecio(),
        carro.getColor());
  }
}
