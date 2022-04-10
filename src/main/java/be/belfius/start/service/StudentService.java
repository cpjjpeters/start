package be.belfius.start.service;

import be.belfius.start.domain.Student;
import be.belfius.start.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author tersc
 * first appearance on 02/03/2022
 */
@Service
@Slf4j
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public Student saveStudent(Student student){
        Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());
                if(studentOptional.isPresent()){
                    throw new IllegalStateException("email taken");
                }
        return studentRepository.save(student);
    }

    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }

    public Optional<Student> findStudentByEmail(String email) {
        return studentRepository.findStudentByEmail(email);
    }
}
