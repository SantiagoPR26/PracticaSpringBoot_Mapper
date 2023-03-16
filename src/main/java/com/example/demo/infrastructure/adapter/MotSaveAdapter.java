package com.example.demo.infrastructure.adapter;

import com.example.demo.application.MotSave;
import com.example.demo.domain.entities.Moto;
import com.example.demo.domain.services.MotSaveService;
import com.example.demo.infrastructure.mapper.MotMapper;
import com.example.demo.infrastructure.repository.MotRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class MotSaveAdapter implements MotSaveService {

  private final MotRepository motRepository;

  private final MotMapper motMapper;

  @Override
  public Moto save(Moto moto){
    return motMapper.toEntity(motRepository.save(motMapper.toDto(moto)));
  }


}
