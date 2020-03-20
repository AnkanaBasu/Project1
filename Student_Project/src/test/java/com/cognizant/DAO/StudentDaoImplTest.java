package com.cognizant.DAO;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.cognizant.configuration.ApplicationConfig;
import com.cognizant.model.Student;

public class StudentDaoImplTest {
@Test
public void testInsert() {
	 AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
     StudentDAO dao=(StudentDAO) context.getBean("studentDao");
	String res=dao.insert(new Student(001,"Test",4.5 ));
	assertNotNull(res);
	assertEquals("SUCCESS", res);
}
}
