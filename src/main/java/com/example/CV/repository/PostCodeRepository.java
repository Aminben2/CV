package com.example.CV.repository;

import com.example.CV.entity.PostCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostCodeRepository extends JpaRepository<PostCode, Long> {
}

