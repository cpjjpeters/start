package be.belfius.start.config;

import be.belfius.start.domain.Student;
import be.belfius.start.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

/**
 * @author tersc
 * first appearance on 02/03/2022
 */
@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student maria =new Student(

                    "Maria",
                    "maria@belfius.be",
                    LocalDate.of(2000,05,04)

            );
            Student xx = new Student(
                    1L,
                    "naam","naam@mail.com",
                    LocalDate.of(1967,06,13)
            );
            Student carl =new Student(

                    "Carl",
                    "tersc@belfius.be",
                    LocalDate.of(1964,05,04)

            );
            List<Student> maca = List.of(maria, carl,xx);
            for(Student student:maca){
                System.out.println(student.toString());
            }
            studentRepository.saveAll(
                    List.of(maria,carl)
            );
        };
    }
}
