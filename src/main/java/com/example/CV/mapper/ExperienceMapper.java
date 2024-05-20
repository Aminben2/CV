package com.example.CV.mapper;

import com.example.CV.dto.ExperienceDTO;
import com.example.CV.entity.Experience;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor

public class ExperienceMapper {

    private final CityMapper cityMapper;
    private final EmployerMapper employerMapper;
    private final ClientMapper clientMapper;
    private final ProjectMapper projectMapper;
    private final ExperienceTypeMapper experienceTypeMapper;

    public ExperienceDTO experienceToDTO(Experience experience) {
        if (experience == null) return null;

        ExperienceDTO experienceDTO = new ExperienceDTO();
        experienceDTO.setId(experience.getId());
        experienceDTO.setTitle(experience.getTitle());
        experienceDTO.setStartDate(experience.getStarDate());
        experienceDTO.setEndDate(experience.getEndDate());
        experienceDTO.setDescription(experience.getDescription());
        experienceDTO.setCity(cityMapper.cityToDTO(experience.getCity())); // Assuming you have a method to convert City entities to CityDTOs
        experienceDTO.setEmployer(employerMapper.employerToDTO(experience.getEmployer())); // Assuming you have a method to convert Employer entities to EmployerDTOs
        experienceDTO.setExperienceType(experienceTypeMapper.experienceTypeToDTO(experience.getExperienceType())); // Assuming you have a method to convert ExperienceType entities to ExperienceTypeDTOs
        experienceDTO.setClient(clientMapper.clientToDTO(experience.getClient())); // Assuming you have a method to convert Client entities to ClientDTOs
        experienceDTO.setProject(projectMapper.projectToDTO(experience.getProject())); // Assuming you have a method to convert Project entities to ProjectDTOs

        return experienceDTO;
    }


    public List<ExperienceDTO> experiencesToDTO(List<Experience> experiences) {
        List<ExperienceDTO> experienceDTOs = new ArrayList<>();
        for (Experience experience : experiences) {
            ExperienceDTO experienceDTO = experienceToDTO(experience);
            experienceDTOs.add(experienceDTO);
        }
        return experienceDTOs;
    }

}
