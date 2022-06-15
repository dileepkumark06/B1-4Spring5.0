package com.example.springstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.springstarter.entities.Student;

@SpringBootApplication

public class SpringStarterProjectApplication 
{
	public static void main(String[] args)
	{
		ConfigurableApplicationContext c=SpringApplication.run(SpringStarterProjectApplication.class, args);
		Student s=c.getBean(Student.class);
		s.display();
	}
}