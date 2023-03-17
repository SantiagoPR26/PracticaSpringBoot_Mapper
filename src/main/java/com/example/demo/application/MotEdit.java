package com.example.demo.application;

import com.example.demo.domain.entities.Moto;
import com.example.demo.domain.services.MotEditService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MotEdit {


  private final MotEditService motEditService;

  public void editMot(Moto moto) {
    motEditService.editMot(moto);
  }

}
