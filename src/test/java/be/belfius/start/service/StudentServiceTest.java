package be.belfius.start.service;

import be.belfius.start.domain.Student;
import be.belfius.start.repository.StudentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * @author tersc
 * first appearance on 08/03/2022
 */

class StudentServiceTest {
    @Mock
    StudentRepository studentRepository;
    @BeforeEach
    void setUp() {


        };

    @Test
    void getStudents() {
    }

    @Test
    void saveStudent() {
    }

    @Test
    void findById() {
    }

    @Test
    void findStudentByEmail() {
        //given
        String email = "cpjj@gmail.com";
        Student student = new Student(
                "cpjj",
                email
        );
//        studentRepository.save(student);
        //when
//        Optional<Student> expected = studentRepository.findStudentByEmail(email);
//        //then
//        assertThat(expected).isEqualTo(student) ;
    }
}