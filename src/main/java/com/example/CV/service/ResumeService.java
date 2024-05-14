package com.example.CV.service;

import com.example.CV.dto.ResumeDetailsDTO;
import com.example.CV.entity.Resume;
import com.example.CV.repository.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ResumeService {

    @Autowired
    private ResumeRepository resumeRepository;

    @Transactional(readOnly = true)
    public ResumeDetailsDTO findResumeDetailsByEmail(String email) {
        Resume resume = resumeRepository.findByPersonalInformation_Email(email);
        return new ResumeDetailsDTO(
                resume.getId(),
                resume.getPersonalInformation(),
                resume.getStudies(),
                resume.getPersonalSkills(),
                resume.getWorkExperiences(),
                resume.getAdditionalInformation(),
                resume.getAnnexes()
        );
    }
}