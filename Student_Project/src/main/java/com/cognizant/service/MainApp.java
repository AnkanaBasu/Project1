package com.cognizant.service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.cognizant.DAO.StudentDAO;
import com.cognizant.configuration.ApplicationConfig;
import com.cognizant.model.Student;

public class MainApp {

	public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        StudentDAO dao=(StudentDAO) context.getBean("studentDao");
        /*dao.insert(new Student(123, "Ankana", 8.7));
        dao.insert(new Student(110, "Ashutosh", 8.5));*/
        System.out.println(dao.insert(new Student(125, "Ana", 5.7)));
        System.out.println(dao.getAll());
	}

}
