package co.pragra.learning.first_spring_proj;

import co.pragra.learning.first_spring_proj.dec14.conf.ApplicationConfig;
import co.pragra.learning.first_spring_proj.dec14.domain.Person;
import co.pragra.learning.first_spring_proj.dec14.service.InsuranceService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

//@SpringBootApplication
public class FirstSpringProjApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Person person = context.getBean("person", Person.class);
		System.out.println("person = " + person);
	}


}
