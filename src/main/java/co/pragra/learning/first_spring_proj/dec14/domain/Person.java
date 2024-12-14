package co.pragra.learning.first_spring_proj.dec14.domain;

import lombok.AllArgsConstructor;
import lombok.ToString;


@ToString
public class Person {
    private String firstName;
    private int age;
    private double income;

    public Person(String firstName, int age, double income) {
        this.firstName = firstName;
        this.age = age;
        this.income = income;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                ", income=" + income +
                '}';
    }
}
