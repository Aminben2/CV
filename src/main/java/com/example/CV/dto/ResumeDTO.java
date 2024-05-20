package com.example.CV.dto;

import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Data
public class ResumeDTO {
    private Long id;
    private String givenName;
    private String familyName;
    private String formattedName;
    private LocalDate birthDate;
    private String email;
    private String phoneNumber;
    private AddressDTO address;
    private LanguageDTO primaryLanguage;
    private List<ExperienceDTO> experiences;
    private List<SkillDTO> skills;
    private List<LanguageProficiencyDTO> languageProficiencies;
    private List<CertificateDTO> certificates;
    private List<CountryDTO> countries;
    private List<EducationDTO> educations;
}
