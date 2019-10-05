package service;

import service.dto.Person;

import java.util.List;

public interface PersonService {

    void save(Person person);

    List<Person> getAll();

    Person getById(long i);
}
