package com.example.CV.service;

import com.example.CV.entity.Resume;
import com.example.CV.repository.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResumeService {

    @Autowired
    private ResumeRepository resumeRepository;

    public Resume findResumeByEmail(String email) {
        return resumeRepository.findByPersonalInformation_Email(email);
    }
}