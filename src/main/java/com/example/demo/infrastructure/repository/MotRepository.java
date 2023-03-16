package com.example.demo.infrastructure.repository;

import com.example.demo.infrastructure.dto.MotDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotRepository  extends JpaRepository<MotDto, String> {
}
