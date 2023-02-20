package co.com.apiclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.apiclient.entity.Student;
import co.com.apiclient.service.IStudentService;

@RestController
@RequestMapping("/api")
public class ClientController {

	@Autowired
	private IStudentService studentService;
	
	@GetMapping("/list")
	public List<Student> getList() {
		return studentService.findAll();
	}
}
