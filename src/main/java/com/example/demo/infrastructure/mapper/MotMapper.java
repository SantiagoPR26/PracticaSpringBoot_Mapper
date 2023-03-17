package com.example.demo.infrastructure.mapper;

import com.example.demo.domain.entities.Moto;
import com.example.demo.infrastructure.dto.MotDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MotMapper {

  @Mapping(target = "marca", source = "marca")
  @Mapping(target = "placa", source = "placa")
  @Mapping(target = "modelo", source = "modelo")
  @Mapping(target = "precio", source = "precio")
  @Mapping(target = "cilindraje", source = "cilindraje")
  @Mapping(target = "electrica", source = "electrica")
  MotDto toDto(Moto moto);

  Moto toEntity(MotDto motDto);
}
