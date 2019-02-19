package io.github.rbuhler.scrum.board;

import com.fasterxml.jackson.databind.ObjectMapper;
import github.model.Body;
import github.model.Issue;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;

@RestController
public class IssueController {

    @RequestMapping("/gitIssue")
    public List<Issue> issues(@RequestBody Body body){

        RestTemplate restTemplate = new RestTemplate();
        ObjectMapper mapper = new ObjectMapper();
        String url = "https://api.github.com/orgs/" + body.getOrg()+"/"+body.getRepo();

        //setting the headers
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "body " + body.getBasic());
        HttpEntity entity = new HttpEntity(headers);
        HttpEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

        //retrieving the response
        String jsonData = response.getBody();
        List<Issue> issueDataList = null;
        try {

            issueDataList = mapper.readValue(jsonData, List.class);

        } catch (IOException e) {
            System.out.println("\n");
            e.printStackTrace();
            System.out.println("\n");
        }
        return issueDataList;
    }
}