package com.example.CV.repository;

import com.example.CV.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
