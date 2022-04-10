package be.belfius.start.repository;

import be.belfius.start.person.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author tersc
 * first appearance on 23/12/2021
 */

public interface PersonRepository extends JpaRepository<Person, Long> {
}
