package com.example.CV.service;

import com.example.CV.dto.*;
import com.example.CV.entity.*;
import com.example.CV.mapper.ResumeMapper;
import com.example.CV.repository.ResumeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class ResumeService {
    private final ResumeRepository resumeRepository;
    private final ResumeMapper resumeMapper;

    @Transactional(readOnly = true)
    public ResumeDTO findResumeDetailsByEmail(String email) {
        Resume resume = resumeRepository.findByEmail(email);
        if (resume == null) return null;
        // Initialize collections to avoid lazy loading issues
        resume.getCountries().size();
        resume.getCertificates().size();
        resume.getEducations().size();
        resume.getSkills().size();
        resume.getExperiences().size();
        resume.getLanguageProficiencies().size();

        ResumeDTO resumeDTO = resumeMapper.resumeToDTO(resume);

        return resumeDTO;
    }}

