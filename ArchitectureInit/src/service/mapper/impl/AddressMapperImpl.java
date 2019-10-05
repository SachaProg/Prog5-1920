package service.mapper.impl;

import business.domain.AddressEntity;
import service.dto.Address;

import java.util.ArrayList;
import java.util.List;


public class AddressMapperImpl {

    public AddressEntity toEntity(Address address) {
        if (address == null)
            return null;
        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setCity(address.getCity());
        addressEntity.setId(Long.parseLong(address.getId()));
        addressEntity.setZip(Integer.parseInt(address.getZip()));
        return addressEntity;
    }

    public Address toDTO(AddressEntity addressEntity) {
        if (addressEntity == null)
            return null;
        Address address = new Address();
        address.setCity(addressEntity.getCity());
        address.setId(addressEntity.getId().toString());
        address.setZip(Integer.toString(addressEntity.getZip()));
        return address;
    }

    public List<Address> toDTO(List<AddressEntity> addressEntitiesList) {
        List<Address> addresses = new ArrayList<>();
        for(AddressEntity addressEntity : addressEntitiesList){
            Address address = toDTO(addressEntity);
            addresses.add(address);
        }
        return addresses;
    }

    public List<AddressEntity> toEntity(List<Address> addresses) {
        List<AddressEntity> addressEntityList = new ArrayList<>();
        for(Address address : addresses){
            AddressEntity addressEntity = toEntity(address);
            addressEntityList.add(addressEntity);
        }
        return addressEntityList;
    }

}
