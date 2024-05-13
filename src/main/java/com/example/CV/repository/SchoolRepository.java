package com.example.CV.repository;

import com.example.CV.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {
}