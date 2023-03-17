package com.example.demo.infrastructure.dto;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class MotDto extends VehiculoDto {

  private Integer cilindraje;
  private Boolean electrica;

  public MotDto(String marca, String placa, String modelo, Double precio, Integer cilindraje,
      Boolean electrica) {
    super(marca, placa, modelo, precio);
    this.cilindraje = cilindraje;
    this.electrica = electrica;
  }
}
