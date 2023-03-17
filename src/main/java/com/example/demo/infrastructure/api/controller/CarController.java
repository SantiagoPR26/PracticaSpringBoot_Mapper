package com.example.demo.infrastructure.api.controller;


import com.example.demo.application.CarDelete;
import com.example.demo.application.CarEdit;
import com.example.demo.application.CarGet;
import com.example.demo.application.CarSave;
import com.example.demo.domain.entities.Carro;
import com.example.demo.infrastructure.mapper.CarMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
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
@ControllerAdvice
@RequestMapping(path = "/car")
public class CarController {

  private final CarSave carSave;
  private final CarGet carGet;
  private final CarMapper carMapper;
  private final CarDelete carDelete;
  private final CarEdit carEdit;


  //Buscar por id (placa)
  @GetMapping
  public ResponseEntity<Carro> getCar(@RequestParam String placa) {
    return new ResponseEntity<>(carMapper.toDto(carGet.getCar(placa)), HttpStatus.OK);

  }

  //Añadir
  @PostMapping
  public ResponseEntity<Carro> addCarro(@RequestBody Carro car) {
    return new ResponseEntity<>(carSave.saveCar(carMapper.toDto(car)), HttpStatus.CREATED);
  }

  //Actualizar
  @PutMapping
  public void editCar(@RequestBody Carro car) {

    carEdit.editCar(car);
  }

  //Borrar
  @DeleteMapping
  public void deleteCar(@RequestParam String placa) {
    carDelete.deleteCar(placa);

  }
}



