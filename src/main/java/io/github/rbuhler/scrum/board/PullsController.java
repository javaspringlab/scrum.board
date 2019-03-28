package io.github.rbuhler.scrum.board;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.github.Pulls;
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
public class PullsController {
    @RequestMapping("/gitPullsList")
    public Pulls[] pulls(@RequestHeader(value="Authorization") String auth,
                         @RequestParam(value="org") String org,
                         @RequestParam (value="repo") String repo){

        RestTemplate restTemplate = new RestTemplate();
        ObjectMapper mapper = new ObjectMapper();
        String url = "https://api.github.com/repos/" + org + "/" + repo + "/pulls";

        //setting the headers
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", auth);
        HttpEntity entity = new HttpEntity(headers);
        HttpEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

        //retrieving the response
        String jsonData = response.getBody();
        Pulls[] pullsDataList = null;

        try {
            pullsDataList = mapper.readValue(jsonData, Pulls[].class);
        } catch (IOException e) {
            System.out.println("\n");
            e.printStackTrace();
            System.out.println("\n");
        }
        return pullsDataList;

    }
    public Pulls[] GetPullsList(String auth,
                                String org,
                                String repo){

        Pulls[] pullsDataList = pulls(auth,org,repo);
        return  pullsDataList;
    }
}
