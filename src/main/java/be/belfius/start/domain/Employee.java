package be.belfius.start.domain;

import lombok.Data;

/**
 * @author tersc
 * first appearance on 10/03/2022
 */
@Data
public class Employee {
    private String name;
    private double salary;

    public void setSalary(double salary){
        System.out.println("Employee.setSalary():" + salary);
    }
}
