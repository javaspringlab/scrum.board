package io.github.rbuhler.scrum.board;

import com.fasterxml.jackson.databind.ObjectMapper;
import github.model.Organization;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@RestController
public class OrganizationController {

    @RequestMapping("/gitOrg")
	  public Organization organization(@RequestHeader (value="Authorization") String auth, @RequestParam (value="org") String org){

		RestTemplate restTemplate = new RestTemplate();
        ObjectMapper mapper = new ObjectMapper();
		String url = "https://api.github.com/orgs/" + org;

		//setting the headers
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", auth);
		HttpEntity entity = new HttpEntity(headers);
		HttpEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

        //retrieving the response
		String jsonData = response.getBody();
		Organization orgData = null;
		try {
			orgData = mapper.readValue(jsonData, Organization.class);
		} catch (IOException e) {
			System.out.println("\n");
				e.printStackTrace();
			System.out.println("\n");
		}
        return orgData;
    }
}

/*
https://spring.io/guides/gs/rest-service/
http://localhost:8080/gitOrg?org=javaspringlab
http://www.jsonschema2pojo.org
 */