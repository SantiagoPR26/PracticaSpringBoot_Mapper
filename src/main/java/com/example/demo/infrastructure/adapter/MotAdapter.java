package com.example.demo.infrastructure.adapter;

import com.example.demo.domain.entities.Moto;
import com.example.demo.domain.services.MotServices;
import com.example.demo.infrastructure.mapper.MotMapper;
import com.example.demo.infrastructure.repository.MotRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MotAdapter implements MotServices {

    private final MotRepository motRepository;
    private final MotMapper motMapper;

    @Override
    public Moto save(Moto moto){
        return motMapper.toEntity(motRepository.save(motMapper.toDto(moto)));
    }

    @Override
    public Moto getMoto(String placa) {
        return null;
    }

    @Override
    public void editMot(Moto moto) {

    }

    @Override
    public void deleteMot(String placa) {

    }

}
