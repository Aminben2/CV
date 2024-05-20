package com.example.CV.mapper;

import com.example.CV.dto.CityDTO;
import com.example.CV.entity.City;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class CityMapper {

    @Autowired
    private CountryMapper countryMapper ;

    public CityDTO cityToDTO(City city) {
        if (city == null) return null;
        CityDTO cityDTO = new CityDTO();
        cityDTO.setId(city.getId());
        cityDTO.setName(city.getName());
        cityDTO.setCountry(countryMapper.countryToDTO(city.getCountry()));
        return cityDTO;
    }
    public List<CityDTO> citiesToDTOs(List<City> cities) {
        if (cities == null) return null;
        List<CityDTO> cityDTOs = new ArrayList<>();
        for (City city : cities) {
            cityDTOs.add(cityToDTO(city)); // Utilize cityToDTO method to map each city
        }
        return cityDTOs;
    }
}
