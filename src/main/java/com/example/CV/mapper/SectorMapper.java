package com.example.CV.mapper;

import com.example.CV.dto.SectorDTO;
import com.example.CV.entity.Sector;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SectorMapper {
    public SectorDTO sectorToDTO(Sector sector) {
        if (sector == null) return null;

        SectorDTO sectorDTO = new SectorDTO();
        sectorDTO.setId(sector.getId());
        sectorDTO.setName(sector.getName());
        sectorDTO.setDescription(sector.getDescription());

        return sectorDTO;
    }

}
