package be.belfius.start.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import be.belfius.start.person.domain.Person;
import be.belfius.start.repository.PersonRepository;
import be.belfius.start.person.persistance.PersonPersistenceFacade;
import java.util.Optional;

/**
 * @author tersc
 * first appearance on 23/12/2021
 */
@Slf4j
@Service
public class PersonService {

    private final PersonRepository personRepository;
    private final PersonPersistenceFacade personPersistenceFacade;

    public PersonService(PersonRepository personRepository, PersonPersistenceFacade personPersistenceFacade) {
        this.personRepository = personRepository;
        this.personPersistenceFacade = personPersistenceFacade;
    }

    public void save(Person person) {
    }

    public Optional<Person> findById(Long id) {
        log.debug("id={}", id);
        return PersonPersistenceFacade.findById(id);
    }

}
