package io.school.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class }) 
public class SchoolApiApp {

	public static void main(String[] args) {
		SpringApplication.run(SchoolApiApp.class, args);
		// TODO Auto-generated method stub

	}

}
