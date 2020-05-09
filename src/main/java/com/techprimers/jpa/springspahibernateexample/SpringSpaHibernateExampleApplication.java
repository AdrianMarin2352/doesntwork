package com.techprimers.jpa.springspahibernateexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.techprimers.jpa.springspahibernateexample.repository")
@SpringBootApplication
public class SpringSpaHibernateExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSpaHibernateExampleApplication.class, args);
	}

}
