package service.impl;

import business.domain.AddressEntity;
import business.repo.impl.AddressRepositoryImpl;
import service.dto.Address;
import service.mapper.impl.AddressMapperImpl;

import java.util.List;

public class AddressServiceImpl {

    private AddressRepositoryImpl addressRepository;
    private AddressMapperImpl addressMapper;

    public AddressServiceImpl(AddressRepositoryImpl addressRepository, AddressMapperImpl addressMapper) {
        this.addressRepository = addressRepository;
        this.addressMapper = addressMapper;
    }

    public void save(Address address) {
        AddressEntity addressEntity = addressMapper.toEntity(address);
        addressRepository.save(addressEntity);
    }

    public List<Address> getAll() {
        List<AddressEntity> addressEntityList = addressRepository.getAll();
        return addressMapper.toDTO(addressEntityList);
    }

    public Address getById(long id) {
        return addressMapper.toDTO(addressRepository.getByID(id));
    }
}
