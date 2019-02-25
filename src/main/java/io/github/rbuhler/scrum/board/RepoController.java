package io.github.rbuhler.scrum.board;

import com.fasterxml.jackson.databind.ObjectMapper;
import github.model.Repo;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@RestController
public class RepoController {

    @RequestMapping("/gitRepo")
    public Repo[] repo(@RequestHeader (value="Authorization") String auth,
                       @RequestParam (value="org") String org,
                       @RequestParam (value="repo") String repo){

        RestTemplate restTemplate = new RestTemplate();
        ObjectMapper mapper = new ObjectMapper();
        String url = "https://api.github.com/orgs/" + org + "/repos?name=" + repo;
        System.out.println("\n" + url + "\n");

        //setting the headers
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", auth);
        HttpEntity entity = new HttpEntity(headers);
        HttpEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

        //retrieving the response
        String jsonData = response.getBody();

        System.out.println("\n"+ jsonData + "\n");

        Repo[] repoDataList = null;
        try {
            repoDataList = mapper.readValue(jsonData, Repo[].class);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return repoDataList;
    }
}