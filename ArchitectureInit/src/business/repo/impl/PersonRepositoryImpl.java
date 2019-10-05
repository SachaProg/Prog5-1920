package business.repo.impl;

import business.domain.AddressEntity;
import business.domain.PersonEntity;

import java.util.ArrayList;
import java.util.List;


public class PersonRepositoryImpl {

    private List<PersonEntity> personEntityList;

    public PersonRepositoryImpl() {
        this.personEntityList = new ArrayList<>();
    }

    public void save(PersonEntity personEntity) {
        personEntityList.add(personEntity);
    }

    public List<PersonEntity> getAll() {
        return personEntityList;
    }

    public PersonEntity getByID(Long id) {
        for (PersonEntity personEntity : personEntityList) {
            if (personEntity.getId().equals(id))
                return personEntity;
        }
        return null;
    }

}
