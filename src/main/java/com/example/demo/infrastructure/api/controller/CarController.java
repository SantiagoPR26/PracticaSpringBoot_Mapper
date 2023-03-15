package com.example.demo.infrastructure.api.controller;


import com.example.demo.application.CarGet;
import com.example.demo.application.CarSave;
import com.example.demo.domain.entities.Carro;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/car")
public class CarController {
    private final CarSave carSave;
    private final CarGet carGet;

    //Buscar por placa
    @GetMapping
    public ResponseEntity<Carro> getCar(@RequestParam String placa){

        return ResponseEntity.ok(carGet.getCar(placa));
    }

    //Guardar
      @PostMapping
      public ResponseEntity<Carro> createCarro(@RequestBody Carro car){
        return new ResponseEntity<>(carSave.saveCar(car), HttpStatus.CREATED);
      }

      //Actualizar
      //@PutMapping





}
