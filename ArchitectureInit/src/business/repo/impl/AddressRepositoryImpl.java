package business.repo.impl;

import business.domain.AddressEntity;

import java.util.ArrayList;
import java.util.List;


public class AddressRepositoryImpl {

    private List<AddressEntity> addressEntityList;

    public AddressRepositoryImpl() {
        this.addressEntityList = new ArrayList<>();
    }

    public void save(AddressEntity addressEntity) {
        addressEntityList.add(addressEntity);
    }

    public List<AddressEntity> getAll() {
        return addressEntityList;
    }

    public AddressEntity getByID(Long id) {
        for (AddressEntity addressEntity : addressEntityList) {
            if (addressEntity.getId().equals(id))
                return addressEntity;
        }
        return null;
    }
}
