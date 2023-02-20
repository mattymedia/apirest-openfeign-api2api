package co.com.apidata.service;

import java.util.List;

import co.com.apidata.entity.Student;

public interface IStudentService {

	public List<Student> findAll();
	
	public Student save(Student student);
}
