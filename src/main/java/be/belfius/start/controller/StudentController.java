package be.belfius.start.controller;

import be.belfius.start.domain.Student;
import be.belfius.start.service.StudentService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.awt.*;
import java.util.List;
import java.util.Optional;

/**
 * @author tersc
 * first appearance on 02/03/2022
 */
@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @GetMapping(value = "findStudentByEmail/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Student> getStudentByEmail(@PathVariable(value = "email")String email){
        return studentService.findStudentByEmail(email);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Student> getStudent(@PathVariable(value = "id")Long id){
        return studentService.findById(id);
    }
    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Student createStudent(@Valid @RequestBody Student student){
        return studentService.saveStudent(student);
    }
//    @PutMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    public Student saveStudent(@PathVariable String userId, @RequestBody UserDetailsRequestModel requestModel){
//        Student student;
//        return studentService.saveStudent(student);
//    }

}
