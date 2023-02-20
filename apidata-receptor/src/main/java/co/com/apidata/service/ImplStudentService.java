package co.com.apidata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.apidata.entity.Student;
import co.com.apidata.repository.IStudentRepository;

@Service
public class ImplStudentService implements IStudentService{
	
	@Autowired
	private IStudentRepository studentRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	@Override
	@Transactional
	public Student save(Student student) {
		return studentRepository.save(student);
	}
	
}
