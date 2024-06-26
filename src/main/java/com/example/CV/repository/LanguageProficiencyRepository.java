package com.example.CV.repository;

import com.example.CV.entity.LanguageProficiency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageProficiencyRepository extends JpaRepository<LanguageProficiency, Long> {
}
