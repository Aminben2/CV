package com.example.CV.repository;

import com.example.CV.entity.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResumeRepository extends JpaRepository<Resume, Long> {
    Resume findByPersonalInformation_Email(String email);
}
