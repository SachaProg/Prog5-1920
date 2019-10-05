package service.impl;

import business.domain.PersonEntity;
import business.repo.impl.PersonRepositoryImpl;
import service.PersonService;
import service.dto.Person;
import service.mapper.impl.PersonMapperImpl;


public class PersonServiceImpl
        extends AbstractServiceImpl<Person, PersonEntity>
        implements PersonService {

    public PersonServiceImpl() {
        super(new PersonRepositoryImpl(), new PersonMapperImpl());
    }

}
