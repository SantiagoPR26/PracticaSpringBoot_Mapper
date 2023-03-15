package com.example.demo.application;

import com.example.demo.domain.entities.Carro;
import com.example.demo.domain.services.CarGetService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@Service
public class CarGet {

    private final CarGetService carGetService;

    public Carro getCar(String placa){
        return carGetService.getCarro(placa);
    }
}
