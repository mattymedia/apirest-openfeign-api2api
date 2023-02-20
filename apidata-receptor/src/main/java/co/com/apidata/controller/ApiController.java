package co.com.apidata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.apidata.entity.Student;
import co.com.apidata.service.IStudentService;

@RestController
@RequestMapping("/api")
public class ApiController {

	@Autowired
	private IStudentService studentService;
	
	@GetMapping("/list")
	public List<Student> findAll(){
		return studentService.findAll();
	}
	
	@PostMapping("/save")
	public Student save(@RequestBody Student student) {
		return studentService.save(student);
	}
}
