package com.example.demo.infrastructure.adapter;

import com.example.demo.domain.entities.Moto;
import com.example.demo.domain.services.MotEditService;
import com.example.demo.infrastructure.repository.MotRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class MotEditAdapter implements MotEditService {

  private final MotRepository motRepository;

  @Override
  @Transactional
  public void editMot(Moto moto) {
    motRepository.updateMot(moto.getMarca(), moto.getPlaca(), moto.getModelo(), moto.getPrecio(),
        moto.getCilindraje(), moto.getElectrica());
  }

}
