package co.pragra.learning.first_spring_proj.dec14.domain;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Map;


@ToString
public class Person {
    private String firstName;
    private int age;
    private double income;
    private List<String> hobbies;
    private Map<String, String> scoreCard;

    public Person(String firstName, int age, double income) {
        this.firstName = firstName;
        this.age = age;
        this.income = income;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public void setScoreCard(Map<String, String> scoreCard) {
        this.scoreCard = scoreCard;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                ", income=" + income +
                ", hobbies=" + hobbies +
                '}';
    }
}
