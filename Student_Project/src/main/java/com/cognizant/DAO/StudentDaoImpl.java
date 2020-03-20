package com.cognizant.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cognizant.model.Student;
@Component("studentDao")
public class StudentDaoImpl implements StudentDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;
	public String insert(Student s) {
		int r=jdbcTemplate.update("INSERT INTO STUDENT (id,name,marks) VALUES (?,?,?)", s.getId(), s.getName(),s.getMarks());
		if(r>0) {
		return "SUCCESS";
		}
		else {
			return "FAIL";
		}
	}

	public List<Student> getAll() {
		 List < Student > students = jdbcTemplate.query("SELECT * FROM STUDENT", new BeanPropertyRowMapper(Student.class));
	        return students;
	}

}
