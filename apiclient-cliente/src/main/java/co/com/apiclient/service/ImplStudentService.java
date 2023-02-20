package co.com.apiclient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.apiclient.client.IStudentFeignService;
import co.com.apiclient.entity.Student;

@Service
public class ImplStudentService implements IStudentService{

	@Autowired
	private IStudentFeignService studentFeignService;
	
	public List<Student> findAll() {
		return studentFeignService.findAll();
	}

}
