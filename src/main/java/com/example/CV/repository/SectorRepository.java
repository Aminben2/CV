package com.example.CV.repository;

import com.example.CV.entity.Sector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SectorRepository extends JpaRepository<Sector, Long> {
}
