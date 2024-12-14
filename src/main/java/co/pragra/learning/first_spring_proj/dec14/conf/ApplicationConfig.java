package co.pragra.learning.first_spring_proj.dec14.conf;

import co.pragra.learning.first_spring_proj.dec14.domain.Person;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

public class ApplicationConfig {

    @Bean
    Person person(){
       Person p =  new Person("Robin",25,192993);
       p.setHobbies(Arrays.asList("Eat", "Sleep","Work"));
       return p;
    }
}
