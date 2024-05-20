package com.example.CV.mapper;

import com.example.CV.dto.EmployerDTO;
import com.example.CV.entity.Employer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmployerMapper {

    public EmployerDTO employerToDTO(Employer employer) {
        if (employer == null) return null;
        EmployerDTO employerDTO = new EmployerDTO();
        employerDTO.setId(employer.getId());
        employerDTO.setName(employer.getName());
        return employerDTO;
    }
}
