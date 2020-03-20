package com.cognizant.DAO;

import java.util.List;

import com.cognizant.model.Student;

public interface StudentDAO {
	public String insert(Student s);

	public List<Student> getAll();
}
