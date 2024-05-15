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
        if (resume == null) {
            return null; // or handle not found case
        }

        // Initialize collections
        resume.getStudies().size();
        resume.getPersonalSkills().size();
        resume.getWorkExperiences().size();
        resume.getAdditionalInformation().size();
        resume.getAnnexes().size();

        return new ResumeDetailsDTO(
                resume,
                resume.getPersonalInformation(),
                resume.getStudies(),
                resume.getPersonalSkills(),
                resume.getWorkExperiences(),
                resume.getAdditionalInformation(),
                resume.getAnnexes()
        );
    }
}