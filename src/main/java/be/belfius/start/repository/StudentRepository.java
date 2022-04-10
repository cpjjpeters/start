package be.belfius.start.repository;

import be.belfius.start.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

/**
 * @author tersc
 * first appearance on 02/03/2022
 */

public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("select s from Student s where s.email = ?1")
    Optional<Student>  findStudentByEmail(String email);

    @Override
    <S extends Student> S save(S entity);
}
