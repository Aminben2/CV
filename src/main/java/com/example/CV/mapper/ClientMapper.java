package com.example.CV.mapper;

import com.example.CV.dto.CityDTO;
import com.example.CV.dto.ClientDTO;
import com.example.CV.entity.City;
import com.example.CV.entity.Client;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class ClientMapper {

    @Autowired
    private CityMapper cityMapper;

    public ClientDTO clientToDTO(Client client) {
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
            cityDTOs.add(cityMapper.cityToDTO(city)); // Utilize cityToDTO method to map each city
        }
        return cityDTOs;
    }
}
