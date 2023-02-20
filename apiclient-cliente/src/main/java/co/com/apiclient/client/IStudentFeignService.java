package co.com.apiclient.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import co.com.apiclient.entity.Student;

//Indicamos que esta interface es cliente rest hacia otra api
//@FeignClient(name = NOMBRE_API_dESTINO, url = URL_API_DESTINO:PUERTO)
@FeignClient(name = "apidata", url = "192.168.26.130:8080")
public interface IStudentFeignService {
	
	//las uri en las peticiones Http deben coincidir con las declaradas 
	//en la clase RestController en la api destino.
	@GetMapping("/api/list")
	public List<Student> findAll();
}
