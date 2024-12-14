package co.pragra.learning.first_spring_proj;

import co.pragra.learning.first_spring_proj.dec14.domain.Person;
import co.pragra.learning.first_spring_proj.dec14.service.InsuranceService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

//@SpringBootApplication
public class FirstSpringProjApplication {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:beans.xml");
		InsuranceService insuranceService = context.getBean("insuranceService", InsuranceService.class);
		System.out.println(insuranceService.insure().getQuote());

		Person person = context.getBean("person", Person.class);
		System.out.println("person = " + person);
		
	}


}
