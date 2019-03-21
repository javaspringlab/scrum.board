package io.github.rbuhler.scrum.board;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.github.Issues;
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
public class IssuesController {

    @RequestMapping("/gitIssuesList")
    public Issues[] issues(@RequestHeader (value="Authorization") String auth,
                           @RequestParam(value="org") String org,
                           @RequestParam (value="repo") String repo){

        RestTemplate restTemplate = new RestTemplate();
        ObjectMapper mapper = new ObjectMapper();
        String url = "https://api.github.com/repos/" + org + "/" + repo + "/issues";

        //setting the headers
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", auth);
        HttpEntity entity = new HttpEntity(headers);
        HttpEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

        //retrieving the response
        String jsonData = response.getBody();
        Issues[] issuesDataList = null;

        try {
            issuesDataList = mapper.readValue(jsonData, Issues[].class);
        } catch (IOException e) {
            System.out.println("\n");
            e.printStackTrace();
            System.out.println("\n");
        }
        return issuesDataList;
    }

    public Issues[] GetIssues( String auth,
                            String org,
                           String repo) {

        RestTemplate restTemplate = new RestTemplate();
        ObjectMapper mapper = new ObjectMapper();
        String url = "https://api.github.com/repos/" + org + "/" + repo + "/issues";

        //setting the headers
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", auth);
        HttpEntity entity = new HttpEntity(headers);
        HttpEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

        //retrieving the response
        String jsonData = response.getBody();
        Issues[] issuesDataList = null;

        try {
            issuesDataList = mapper.readValue(jsonData, Issues[].class);
        } catch (IOException e) {
            System.out.println("\n");
            e.printStackTrace();
            System.out.println("\n");
        }
        return issuesDataList;
    }
}
