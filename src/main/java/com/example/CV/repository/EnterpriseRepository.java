package com.example.CV.repository;


import com.example.CV.entity.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EnterpriseRepository extends JpaRepository<Enterprise, Long> {
}
