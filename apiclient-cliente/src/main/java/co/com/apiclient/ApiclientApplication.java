package co.com.apiclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients//escaneamos y habilitamos interfaces anotadas como @FeignClients
public class ApiclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiclientApplication.class, args);
	}

}
