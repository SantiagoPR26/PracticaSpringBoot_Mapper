package com.example.demo.infrastructure.repository;

import com.example.demo.infrastructure.dto.CarroDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<CarroDto, String> {


}
