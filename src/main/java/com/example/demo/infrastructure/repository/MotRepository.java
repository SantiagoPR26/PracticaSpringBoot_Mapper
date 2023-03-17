package com.example.demo.infrastructure.repository;

import com.example.demo.infrastructure.dto.MotDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MotRepository extends JpaRepository<MotDto, String> {

  @Query(nativeQuery = true,
      value = "update mot_dto set marca = :marca, modelo = :modelo, "
          + "precio = :precio, cilindraje = :cilindraje, electrica = :electrica where placa = :placa")
  @Modifying
  void updateMot(@Param("marca") String marca,
      @Param("placa") String placa,
      @Param("modelo") String modelo,
      @Param("precio") Double precio,
      @Param("cilindraje") Integer cilindraje,
      @Param("electrica") Boolean electrica);

}
