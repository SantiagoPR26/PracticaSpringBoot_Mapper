package com.example.demo.infrastructure.adapter;

import com.example.demo.domain.entities.Carro;
import com.example.demo.domain.services.CarEditService;
import com.example.demo.infrastructure.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class CarEditAdapter implements CarEditService {

    private final CarRepository carRepository;

    @Transactional
    public void editCar(Carro carro){
        carRepository.updateCar(carro.getMarca(),carro.getPlaca(),carro.getModelo(),carro.getPrecio(),carro.getColor());
    }


}
