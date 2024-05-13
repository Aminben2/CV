package com.example.CV.repository;

import com.example.CV.entity.Annex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnexRepository extends JpaRepository<Annex, Long> {
}
