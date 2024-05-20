package com.example.CV.mapper;

import com.example.CV.dto.CountryDTO;
import com.example.CV.entity.Country;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class CountryMapper {

    public CountryDTO countryToDTO(Country country) {
        if (country == null) return null;
        CountryDTO countryDTO = new CountryDTO();
        countryDTO.setId(country.getId());
        countryDTO.setName(country.getName());
        return countryDTO;
    }

    public List<CountryDTO> countriesToDTO(List<Country> countries) {
        List<CountryDTO> countryDTOs = new ArrayList<>();
        for (Country country : countries) {
            CountryDTO countryDTO = countryToDTO(country);
            countryDTOs.add(countryDTO);
        }
        return countryDTOs;
    }
}
