package com.example.demo.infrastructure.adapter;

import com.example.demo.domain.entities.Moto;
import com.example.demo.domain.services.MotGetService;
import com.example.demo.infrastructure.dto.MotDto;
import com.example.demo.infrastructure.mapper.MotMapper;
import com.example.demo.infrastructure.repository.MotRepository;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class MotGetAdapter implements MotGetService {

  private final MotRepository motRepository;
  private final MotMapper motMapper;

  @Override
  public Moto getMoto(String placa) {
    Optional<MotDto> motDtoOptional = motRepository.findById(placa);
    if (motDtoOptional.isEmpty() ){
      return null;
    }
    return motMapper.toEntity(motDtoOptional.get());
  }




}
