package com.example.demo.application;

import com.example.demo.domain.services.MotDeleteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class MotDelete {

  public final MotDeleteService motDeleteService;

  public void deleteMot(String placa){motDeleteService.deleteMot(placa);
  }

}
