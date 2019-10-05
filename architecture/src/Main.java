import service.AddressService;
import service.PersonService;
import service.dto.Address;
import service.dto.Person;
import service.impl.AddressServiceImpl;
import service.impl.PersonServiceImpl;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        runPerson();
        runAddress();
    }

    private static void runAddress() {
        Address address = new Address();
        address.setCity("Gent");
        address.setZip("9000");
        address.setId("1");

        Address address2 = new Address();
        address2.setCity("Antwerpen");
        address2.setZip("2000");
        address2.setId("10");

        AddressService addressService = new AddressServiceImpl();
        addressService.save(address);
        addressService.save(address2);

        List<Address> addressList = addressService.getAll();
        System.out.println(addressList);

        System.out.println(addressService.getById(1));
        System.out.println(addressService.getById(10));
    }

    private static void runPerson() {
        Person person = new Person();
        person.setName("Sacha");
        person.setId("2");

        Person person2 = new Person();
        person2.setName("Piet");
        person2.setId("3");

        PersonService personService = new PersonServiceImpl();
        personService.save(person);
        personService.save(person2);

        List<Person> personList = personService.getAll();
        System.out.println(personList);

        System.out.println(personService.getById(2));
        System.out.println(personService.getById(3));
    }
}
