package com.example.demo.application;

import com.example.demo.domain.entities.Moto;
import com.example.demo.domain.services.MotSaveService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MotSave {

  private final MotSaveService motSaveService;

  public Moto saveMot(Moto moto) {
    return motSaveService.save(moto);
  }
}
