package service.mapper.impl;

import business.domain.PersonEntity;
import service.dto.Person;
import service.mapper.AbstractMapper;


public class PersonMapperImpl extends AbstractMapper<Person, PersonEntity> {

    public PersonEntity toEntity(Person person) {
        if (person == null)
            return null;
        PersonEntity personEntity = new PersonEntity();
        personEntity.setName(person.getName());
        personEntity.setId(Long.parseLong(person.getId()));
        return personEntity;
    }

    public Person toDTO(PersonEntity personEntity) {
        if (personEntity == null)
            return null;
        Person person = new Person();
        person.setName(personEntity.getName());
        person.setId(personEntity.getId().toString());
        return person;
    }

}
