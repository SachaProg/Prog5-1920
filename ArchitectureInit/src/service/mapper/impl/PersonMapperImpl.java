package service.mapper.impl;

import business.domain.PersonEntity;
import service.dto.Person;

import java.util.ArrayList;
import java.util.List;


public class PersonMapperImpl {

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

    public List<Person> toDTO(List<PersonEntity> personEntityList) {
        List<Person> personList = new ArrayList<>();
        for(PersonEntity personEntity : personEntityList){
            Person person = toDTO(personEntity);
            personList.add(person);
        }
        return personList;
    }

    public List<PersonEntity> toEntity(List<Person> personList) {
        List<PersonEntity> personEntityList = new ArrayList<>();
        for(Person person : personList){
            PersonEntity personEntity = toEntity(person);
            personEntityList.add(personEntity);
        }
        return personEntityList;
    }

}
