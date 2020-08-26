package com.restclient.restclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestClientApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(RestClientApplication.class, args);

	}


	@Override
	public void run(ApplicationArguments args) throws Exception {
		RestTemplate template = new RestTemplate();

		String url = "http://localhost:8082/restGateway/DynamicIncrement/number/5/step/3";


		ResponseEntity<String> response = template.getForEntity(url, String.class);

		System.out.println(response.getBody());



	}

}
