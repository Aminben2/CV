package com.example.CV.mapper;

import com.example.CV.dto.InstitutionDTO;
import com.example.CV.entity.Institution;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InstitutionMapper {

    private final CityMapper cityMapper;
    public InstitutionDTO institutionToDTO(Institution institution) {
        if (institution == null) return null;

        InstitutionDTO institutionDTO = new InstitutionDTO();
        institutionDTO.setId(institution.getId());
        institutionDTO.setName(institution.getName());
        institutionDTO.setCity(cityMapper.cityToDTO(institution.getCity())); // Assuming you have a method to convert City entities to CityDTOs

        return institutionDTO;
    }
}
