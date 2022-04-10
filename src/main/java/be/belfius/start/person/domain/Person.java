package be.belfius.start.person.domain;


import be.belfius.start.domain.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
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
import java.time.Instant;

/**
 * @author tersc
 * first appearance on 23/12/2021
 */

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Person {

    private Long id;
    @Builder.Default
    private Instant createdDate = Instant.now();
    @Builder.Default
    private Instant lastModifiedDate = Instant.now();
    private String firstName;
    private String lastName;
    private Gender gender;
    private String email;
    private String phoneNumber;
    private int age;

    public Person(String firstName, Gender gender, int age){
        this.firstName = firstName;
        this.gender = gender;
        this.age = age;
    }
//
//    public int getAge() {
//        return this.age;
//    }
}
