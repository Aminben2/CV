package com.example.CV.mapper;

import com.example.CV.dto.AddressDTO;
import com.example.CV.entity.Address;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
@RequiredArgsConstructor
public class AddressMapper {

    @Autowired
    private CityMapper cityMapper;

    public AddressDTO addressToDTO(Address address) {
        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setId(address.getId());
        addressDTO.setAddressDescription(address.getAddressDescription());
        addressDTO.setPostalCode(address.getPostalCode());
        addressDTO.setCity(cityMapper.cityToDTO(address.getCity()));
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
}


