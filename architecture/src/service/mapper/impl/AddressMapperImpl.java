package service.mapper.impl;

import business.domain.AddressEntity;
import service.dto.Address;
import service.mapper.AbstractMapper;


public class AddressMapperImpl extends AbstractMapper<Address, AddressEntity> {

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

}
