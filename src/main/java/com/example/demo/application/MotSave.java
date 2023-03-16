package com.example.demo.application;

import com.example.demo.domain.entities.Moto;
import com.example.demo.domain.services.MotServices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MotSave {
    private final MotServices motServices;

    public Moto saveMot(Moto moto){
        return motServices.save(moto);
    }
}
