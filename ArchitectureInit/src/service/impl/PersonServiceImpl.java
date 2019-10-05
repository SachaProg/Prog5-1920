package service.impl;

import business.domain.PersonEntity;
import business.repo.impl.PersonRepositoryImpl;
import service.dto.Person;
import service.mapper.impl.PersonMapperImpl;

import java.util.List;


public class PersonServiceImpl {

    private PersonRepositoryImpl personRepository;
    private PersonMapperImpl personMapper;

    public PersonServiceImpl(PersonRepositoryImpl personRepository, PersonMapperImpl personMapper) {
        this.personRepository = personRepository;
        this.personMapper = personMapper;
    }

    public void save(Person person) {
        PersonEntity personEntity = personMapper.toEntity(person);
        personRepository.save(personEntity);
    }

    public List<Person> getAll() {
        List<PersonEntity> personEntityList = personRepository.getAll();
        return personMapper.toDTO(personEntityList);
    }

    public Person getById(long id) {
        return personMapper.toDTO(personRepository.getByID(id));
    }

}
