package service;

import service.dto.Address;

import java.util.List;

public interface AddressService {

    void save(Address address);

    List<Address> getAll();

    Address getById(long i);
}
