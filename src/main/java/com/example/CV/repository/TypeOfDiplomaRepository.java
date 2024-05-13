package com.example.CV.repository;

import com.example.CV.entity.TypeOfDiploma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeOfDiplomaRepository extends JpaRepository<TypeOfDiploma, Long> {
}