package com.example.CV.mapper;

import com.example.CV.dto.ResumeDTO;
import com.example.CV.entity.Resume;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class ResumeMapper {

    private final AddressMapper addressMapper ;
    private final LanguageMapper languageMapper;
    private final ExperienceMapper experienceMapper;
    private final SkillMapper skillMapper;
    private final LanguageProficiencyMapper languageProficiencyMapper;
    private final CertificateMapper certificateMapper;
    private final CountryMapper countryMapper;
    private  final EducationMapper educationMapper;

    public ResumeDTO resumeToDTO(Resume resume) {
        if (resume == null) return null;
        ResumeDTO resumeDTO = new ResumeDTO();
        resumeDTO.setId(resume.getId());
        resumeDTO.setGivenName(resume.getGivenName());
        resumeDTO.setFamilyName(resume.getFamilyName());
        resumeDTO.setFormattedName(resume.getFormattedName());
        resumeDTO.setBirthDate(resume.getBirthDate());
        resumeDTO.setEmail(resume.getEmail());
        resumeDTO.setPhoneNumber(resume.getPhoneNumber());
        resumeDTO.setAddress(addressMapper.addressToDTO(resume.getAddress()));
        resumeDTO.setPrimaryLanguage(languageMapper.languageToDTO(resume.getPrimaryLanguage()));
        resumeDTO.setExperiences(experienceMapper.experiencesToDTO(resume.getExperiences()));
        resumeDTO.setSkills(skillMapper.skillsToDTO(resume.getSkills()));
        resumeDTO.setLanguageProficiencies(languageProficiencyMapper.languageProficienciesToDTO(resume.getLanguageProficiencies()));
        resumeDTO.setCertificates(certificateMapper.certificatesToDTO(resume.getCertificates()));
        resumeDTO.setCountries(countryMapper.countriesToDTO(resume.getCountries()));
        resumeDTO.setEducations(educationMapper.educationsToDTO(resume.getEducations()));

        return resumeDTO;
    }

    public List<ResumeDTO> resumesToDTOs(List<Resume> resumes) {
        if (resumes == null) {
            return null;
        }
        List<ResumeDTO> resumeDTOs = new ArrayList<>();
        for (Resume resume : resumes) {
            resumeDTOs.add(resumeToDTO(resume));
        }
        return resumeDTOs;
    }
}
