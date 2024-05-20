package com.example.CV.mapper;

import com.example.CV.dto.CertificateDTO;
import com.example.CV.entity.Certificate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class CertificateMapper {

    public CertificateDTO certificateToDTO(Certificate certificate) {
        if (certificate == null) return null;

        CertificateDTO certificateDTO = new CertificateDTO();
        certificateDTO.setId(certificate.getId());
        certificateDTO.setName(certificate.getName());
        certificateDTO.setDescription(certificate.getDescription());

        return certificateDTO;
    }

    public List<CertificateDTO> certificatesToDTO(List<Certificate> certificates) {
        List<CertificateDTO> certificateDTOs = new ArrayList<>();
        for (Certificate certificate : certificates) {
            CertificateDTO certificateDTO = certificateToDTO(certificate);
            certificateDTOs.add(certificateDTO);
        }
        return certificateDTOs;
    }
}
