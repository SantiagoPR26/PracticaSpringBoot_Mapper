package com.example.demo.infrastructure.api.controller;

import com.example.demo.application.MotDelete;
import com.example.demo.application.MotEdit;
import com.example.demo.application.MotGet;
import com.example.demo.application.MotSave;
import com.example.demo.domain.entities.Moto;
import com.example.demo.infrastructure.mapper.MotMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/mot")
public class MotController {

  private final MotSave motSave;
  private final MotGet motGet;
  private final MotDelete motDelete;
  private final MotEdit motEdit;
  private final MotMapper motMapper;

  //Añadir
  @PostMapping
  public ResponseEntity<Moto> addMot(@RequestBody Moto moto) {
    return new ResponseEntity<>(motSave.saveMot(moto), HttpStatus.CREATED);
  }

  //Buscar por id (placa)
  @GetMapping
  public ResponseEntity<Moto> getMot(@RequestParam String placa) {
    return new ResponseEntity<>(motGet.getMot(placa), HttpStatus.OK);
  }

  //Borar
  @DeleteMapping
  public void deleteMot(@RequestParam String placa) {
    motDelete.deleteMot(placa);
  }

  //Editar
  @PutMapping
  public void editMot(@RequestBody Moto mot) {
    motEdit.editMot(mot);
  }

}


