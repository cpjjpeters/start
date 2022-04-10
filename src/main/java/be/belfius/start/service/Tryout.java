package be.belfius.start.service;

import lombok.extern.slf4j.Slf4j;
import be.belfius.start.person.domain.Person;

import java.util.Optional;

/**
 * @author tersc
 * first appearance on 10/04/2022
 */
@Slf4j
public class Tryout {
    private final PersonService personService;


    public Tryout(PersonService personService) {
        this.personService = personService;
    }

    public void receive(){


    Person p1 = new Person();
    personService.save(p1);
        Optional<Person> pFound = personService.findById(p1.getId());
    }
}
