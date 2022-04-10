package be.belfius.start.person.persistance;

import java.util.List;
import java.util.Optional;
import  be.belfius.start.domain.Person;

/**
 * @author tersc
 * first appearance on 10/04/2022
 */

public interface PersonPersistenceFacade {

    Person save(Person person);

    List<Person> findAll();

    Optional<Person> findById(long id);
}
