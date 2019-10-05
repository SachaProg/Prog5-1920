package service.impl;

import business.domain.AddressEntity;
import business.repo.impl.AddressRepositoryImpl;
import service.AddressService;
import service.dto.Address;
import service.mapper.impl.AddressMapperImpl;

public class AddressServiceImpl
        extends AbstractServiceImpl<Address, AddressEntity>
        implements AddressService {

    public AddressServiceImpl() {
        super(new AddressRepositoryImpl(), new AddressMapperImpl());
    }
}
