package com.example.demo.infrastructure.adapter;

import com.example.demo.domain.services.MotDeleteService;
import com.example.demo.infrastructure.mapper.MotMapper;
import com.example.demo.infrastructure.repository.MotRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MotDeleteAdapter implements MotDeleteService {

  private final MotRepository motRepository;
  private final MotMapper motMapper;

  @Override
  public void deleteMot(String placa) {
    motRepository.deleteById(placa);
  }
}
