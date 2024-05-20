package com.example.CV.mapper;

import com.example.CV.dto.DegreeDTO;
import com.example.CV.entity.Degree;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DegreeMapper {

    private final SectorMapper sectorMapper;
    private final InstitutionMapper institutionMapper;

    public DegreeDTO degreeToDTO(Degree degree) {
        if (degree == null) return null;

        DegreeDTO degreeDTO = new DegreeDTO();
        degreeDTO.setId(degree.getId());
        degreeDTO.setTitle(degree.getTitle());
        degreeDTO.setInstitution(institutionMapper.institutionToDTO(degree.getInstitution())); // Assuming you have a method to convert Institution entities to InstitutionDTOs
        degreeDTO.setSector(sectorMapper.sectorToDTO(degree.getSector())); // Assuming you have a method to convert Sector entities to SectorDTOs

        return degreeDTO;
    }
}
