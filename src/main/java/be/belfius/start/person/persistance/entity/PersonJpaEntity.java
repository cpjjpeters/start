package be.belfius.start.person.persistance.entity;

import be.belfius.start.domain.Gender;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author tersc
 * first appearance on 10/04/2022
 */
@Table(name = "PERSON")
@Entity
@Data
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class PersonJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "GENDER")
    private Gender gender;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;
    @Column(name = "AGE")
    private int age;

//    public Person(String firstName, Gender gender, int age){
//        this.firstName = firstName;
//        this.gender = gender;
//        this.age = age;
//    }

}