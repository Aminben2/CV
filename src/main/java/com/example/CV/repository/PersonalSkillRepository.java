package com.example.CV.repository;

import com.example.CV.entity.PersonalSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalSkillRepository extends JpaRepository<PersonalSkill, Long> {
}
