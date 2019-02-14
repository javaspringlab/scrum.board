package io.github.rbuhler.scrum.board;

import gitOrganization.GitOrganization;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import static org.springframework.http.HttpMethod.*;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);

		RestTemplate restTemplate = new RestTemplate();

		String url = "https://github.wdf.sap.corp/api/v3/user/orgs";
		String token = "9231f3b43ac0baf85e2adaf7c7ac60b3d30d32e4";

		//setting the headers
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Token " + token);

		HttpEntity entity = new HttpEntity(headers);
		HttpEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

		//retrieving the response
		System.out.println("Response"+ response.getBody());

	}
}