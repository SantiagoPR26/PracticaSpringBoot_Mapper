package com.example.demo.infrastructure.api.controller;

import com.example.demo.application.MotSave;
import com.example.demo.domain.entities.Moto;
import com.example.demo.infrastructure.mapper.MotMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping (path = "/mot")
public class MotController {

    private final MotSave motSave;
    private final MotMapper motMapper;

    @PostMapping
    public ResponseEntity<Moto> addMot(@RequestBody Moto moto){
        return new ResponseEntity<>(motSave.saveMot(moto), HttpStatus.CREATED);
    }
}
