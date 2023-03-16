package com.example.demo.domain.services;

import com.example.demo.domain.entities.Carro;
import com.example.demo.domain.entities.Moto;

public interface MotServices {

    Moto save(Moto moto);

    Moto getMoto(String placa);

    void editMot(Moto moto);

    void deleteMot(String placa);
}
