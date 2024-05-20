package com.example.CV.service;

import com.example.CV.dto.*;
import com.example.CV.entity.*;
import com.example.CV.repository.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class ResumeService {

    @Autowired
    private ResumeRepository resumeRepository;

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

        ResumeDTO resumeDTO = resumeToDTO(resume);

        return resumeDTO;
    }

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
        resumeDTO.setAddress(addressToDTO(resume.getAddress()));
        resumeDTO.setPrimaryLanguage(languageToDTO(resume.getPrimaryLanguage()));
        resumeDTO.setExperiences(experiencesToDTO(resume.getExperiences()));
        resumeDTO.setSkills(skillsToDTO(resume.getSkills()));
        resumeDTO.setLanguageProficiencies(languageProficienciesToDTO(resume.getLanguageProficiencies()));
        resumeDTO.setCertificates(certificatesToDTO(resume.getCertificates()));
        resumeDTO.setCountries(countriesToDTO(resume.getCountries()));
        resumeDTO.setEducations(educationsToDTO(resume.getEducations()));

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

    private List<CountryDTO> countriesToDTO(List<Country> countries) {
        List<CountryDTO> countryDTOs = new ArrayList<>();
        for (Country country : countries) {
            CountryDTO countryDTO = countryToDTO(country);
            countryDTOs.add(countryDTO);
        }
        return countryDTOs;
    }

    private EducationDTO educationToDTO(Education education) {
        if (education == null) return null;

        EducationDTO educationDTO = new EducationDTO();
        educationDTO.setId(education.getId());
        educationDTO.setStartDate(education.getStartDate());
        educationDTO.setEndDate(education.getEndDate());
        educationDTO.setDegree(degreeToDTO(education.getDegree())); // Assuming you have a method to convert Degree entities to DegreeDTOs

        return educationDTO;
    }

    private List<EducationDTO> educationsToDTO(List<Education> educations) {
        List<EducationDTO> educationDTOs = new ArrayList<>();
        for (Education education : educations) {
            EducationDTO educationDTO = educationToDTO(education);
            educationDTOs.add(educationDTO);
        }
        return educationDTOs;
    }


    private DegreeDTO degreeToDTO(Degree degree) {
        if (degree == null) return null;

        DegreeDTO degreeDTO = new DegreeDTO();
        degreeDTO.setId(degree.getId());
        degreeDTO.setTitle(degree.getTitle());
        degreeDTO.setInstitution(institutionToDTO(degree.getInstitution())); // Assuming you have a method to convert Institution entities to InstitutionDTOs
        degreeDTO.setSector(sectorToDTO(degree.getSector())); // Assuming you have a method to convert Sector entities to SectorDTOs

        return degreeDTO;
    }
    private InstitutionDTO institutionToDTO(Institution institution) {
        if (institution == null) return null;

        InstitutionDTO institutionDTO = new InstitutionDTO();
        institutionDTO.setId(institution.getId());
        institutionDTO.setName(institution.getName());
        institutionDTO.setCity(cityToDTO(institution.getCity())); // Assuming you have a method to convert City entities to CityDTOs

        return institutionDTO;
    }

    private SectorDTO sectorToDTO(Sector sector) {
        if (sector == null) return null;

        SectorDTO sectorDTO = new SectorDTO();
        sectorDTO.setId(sector.getId());
        sectorDTO.setName(sector.getName());
        sectorDTO.setDescription(sector.getDescription());

        return sectorDTO;
    }


    private CityDTO cityToDTO(City city) {
        if (city == null) return null;
        CityDTO cityDTO = new CityDTO();
        cityDTO.setId(city.getId());
        cityDTO.setName(city.getName());
        cityDTO.setCountry(countryToDTO(city.getCountry()));
        return cityDTO;
    }

    private CountryDTO countryToDTO(Country country) {
        if (country == null) return null;
        CountryDTO countryDTO = new CountryDTO();
        countryDTO.setId(country.getId());
        countryDTO.setName(country.getName());
        return countryDTO;
    }

    private LanguageDTO languageToDTO(Language language) {
        if (language == null) return null;
        LanguageDTO languageDTO = new LanguageDTO();
        languageDTO.setId(language.getId());
        languageDTO.setLanguageCode(language.getLanguageCode());
        return languageDTO;
    }

    private AddressDTO addressToDTO(Address address) {
        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setId(address.getId());
        addressDTO.setAddressDescription(address.getAddressDescription());
        addressDTO.setPostalCode(address.getPostalCode());
        addressDTO.setCity(cityToDTO(address.getCity()));
        return addressDTO;
    }

    public List<AddressDTO> addressesToDTOs(List<Address> addresses) {
        List<AddressDTO> addressDTOs = new ArrayList<>();
        if (addresses != null) {
            for (Address address : addresses) {
                addressDTOs.add(addressToDTO(address));
            }
        }
        return addressDTOs;
    }
    private CertificateDTO certificateToDTO(Certificate certificate) {
        if (certificate == null) return null;

        CertificateDTO certificateDTO = new CertificateDTO();
        certificateDTO.setId(certificate.getId());
        certificateDTO.setName(certificate.getName());
        certificateDTO.setDescription(certificate.getDescription());

        return certificateDTO;
    }

    private List<CertificateDTO> certificatesToDTO(List<Certificate> certificates) {
        List<CertificateDTO> certificateDTOs = new ArrayList<>();
        for (Certificate certificate : certificates) {
            CertificateDTO certificateDTO = certificateToDTO(certificate);
            certificateDTOs.add(certificateDTO);
        }
        return certificateDTOs;
    }

    private ExperienceDTO experienceToDTO(Experience experience) {
        if (experience == null) return null;

        ExperienceDTO experienceDTO = new ExperienceDTO();
        experienceDTO.setId(experience.getId());
        experienceDTO.setTitle(experience.getTitle());
        experienceDTO.setStartDate(experience.getStarDate());
        experienceDTO.setEndDate(experience.getEndDate());
        experienceDTO.setDescription(experience.getDescription());
        experienceDTO.setCity(cityToDTO(experience.getCity())); // Assuming you have a method to convert City entities to CityDTOs
        experienceDTO.setEmployer(employerToDTO(experience.getEmployer())); // Assuming you have a method to convert Employer entities to EmployerDTOs
        experienceDTO.setExperienceType(experienceTypeToDTO(experience.getExperienceType())); // Assuming you have a method to convert ExperienceType entities to ExperienceTypeDTOs
        experienceDTO.setClient(clientToDTO(experience.getClient())); // Assuming you have a method to convert Client entities to ClientDTOs
        experienceDTO.setProject(projectToDTO(experience.getProject())); // Assuming you have a method to convert Project entities to ProjectDTOs

        return experienceDTO;
    }


    private List<ExperienceDTO> experiencesToDTO(List<Experience> experiences) {
        List<ExperienceDTO> experienceDTOs = new ArrayList<>();
        for (Experience experience : experiences) {
            ExperienceDTO experienceDTO = experienceToDTO(experience);
            experienceDTOs.add(experienceDTO);
        }
        return experienceDTOs;
    }


    private EmployerDTO employerToDTO(Employer employer) {
        if (employer == null) return null;
        EmployerDTO employerDTO = new EmployerDTO();
        employerDTO.setId(employer.getId());
        employerDTO.setName(employer.getName());
        return employerDTO;
    }

    private ExperienceTypeDTO experienceTypeToDTO(ExperienceType experienceType) {
        if (experienceType == null) return null;
        ExperienceTypeDTO experienceTypeDTO = new ExperienceTypeDTO();
        experienceTypeDTO.setId(experienceType.getId());
        experienceTypeDTO.setName(experienceType.getName());
        return experienceTypeDTO;
    }

    private ClientDTO clientToDTO(Client client) {
        if (client == null) return null;
        ClientDTO clientDTO = new ClientDTO();
        clientDTO.setId(client.getId());
        clientDTO.setName(client.getName());
        return clientDTO;
    }
    public List<CityDTO> citiesToDTOs(List<City> cities) {
        if (cities == null) return null;
        List<CityDTO> cityDTOs = new ArrayList<>();
        for (City city : cities) {
            cityDTOs.add(cityToDTO(city)); // Utilize cityToDTO method to map each city
        }
        return cityDTOs;
    }

    private ProjectDTO projectToDTO(Project project) {
        if (project == null) return null;
        ProjectDTO projectDTO = new ProjectDTO();
        projectDTO.setId(project.getId());
        projectDTO.setName(project.getName());
        projectDTO.setDescription(project.getDescription());
        return projectDTO;
    }

    private SkillDTO skillToDTO(Skill skill) {
        if (skill == null) return null;

        SkillDTO skillDTO = new SkillDTO();
        skillDTO.setId(skill.getId());
        skillDTO.setDescription(skill.getDescription());

        return skillDTO;
    }

    private List<SkillDTO> skillsToDTO(List<Skill> skills) {
        List<SkillDTO> skillDTOs = new ArrayList<>();
        for (Skill skill : skills) {
            SkillDTO skillDTO = skillToDTO(skill);
            skillDTOs.add(skillDTO);
        }
        return skillDTOs;
    }


    private LanguageProficiencyDTO languageProficiencyToDTO(LanguageProficiency languageProficiency) {
        if (languageProficiency == null) return null;

        LanguageProficiencyDTO languageProficiencyDTO = new LanguageProficiencyDTO();
        languageProficiencyDTO.setId(languageProficiency.getId());
        languageProficiencyDTO.setLanguage(languageToDTO(languageProficiency.getLanguage())); // Assuming you have a method to convert Language entities to LanguageDTOs
        languageProficiencyDTO.setUnderstandingListening(languageLevelToDTO(languageProficiency.getUnderstandingListening()));
        languageProficiencyDTO.setUnderstandingReading(languageLevelToDTO(languageProficiency.getUnderstandingReading()));
        languageProficiencyDTO.setSpeakingInteraction(languageLevelToDTO(languageProficiency.getSpeakingInteraction()));
        languageProficiencyDTO.setSpeakingProduction(languageLevelToDTO(languageProficiency.getSpeakingProduction()));
        languageProficiencyDTO.setWritingProduction(languageLevelToDTO(languageProficiency.getWritingProduction()));

        return languageProficiencyDTO;
    }

    private List<LanguageProficiencyDTO> languageProficienciesToDTO(List<LanguageProficiency> languageProficiencies) {
        List<LanguageProficiencyDTO> languageProficiencyDTOs = new ArrayList<>();
        for (LanguageProficiency languageProficiency : languageProficiencies) {
            LanguageProficiencyDTO languageProficiencyDTO = languageProficiencyToDTO(languageProficiency);
            languageProficiencyDTOs.add(languageProficiencyDTO);
        }
        return languageProficiencyDTOs;
    }

    private LanguageLevelDTO languageLevelToDTO(LanguageProficiency.LanguageLevel languageLevel) {
        if (languageLevel == null) return null;
        LanguageLevelDTO languageLevelDTO = new LanguageLevelDTO();
        languageLevelDTO.setLevel(languageLevel.name());
        return languageLevelDTO;
    }
}
