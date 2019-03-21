package io.github.rbuhler.scrum.board;

import model.board.BacklogIssues;
import model.github.Issues;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class BacklogIssuesController {

    @RequestMapping("/backlogIssueList")
    public ArrayList<BacklogIssues> backlogissues(@RequestHeader(value="Authorization") String auth,
                                                   @RequestParam(value="org") String org,
                                                   @RequestParam (value="repo") String repo) {

        IssuesController issues = new IssuesController();
        Issues[] issuesData  = null;
        BacklogIssues blIssue = null;
        ArrayList<BacklogIssues> blIssueLIst = new ArrayList<BacklogIssues>();

        issuesData = issues.GetIssues(auth, org, repo);
        int countIssues;
        countIssues = issuesData.length;

        for(int i=0; i < countIssues; i++){
            // Result Mapping
            blIssue = new BacklogIssues();
            blIssue.setOrgId(org);
            blIssue.setRepoId(repo);
            blIssue.setId(issuesData[i].getNumber());
            blIssue.setUrl(issuesData[i].getHtmlUrl());
            blIssue.setTitle(issuesData[i].getTitle());
            blIssue.setUserLogin(issuesData[i].getUser().getLogin());
            blIssue.setUserHtml(issuesData[i].getUser().getHtmlUrl());
            blIssue.setLabels(issuesData[i].getLabels());
            blIssue.setState(issuesData[i].getState());
            blIssue.setAssignee(issuesData[i].getAssignee());
            blIssue.setAssignees(issuesData[i].getAssignees());
            blIssue.setMilestone(issuesData[i].getMilestone());
            blIssue.setComments(issuesData[i].getComments());
            blIssue.setCreatedAt(issuesData[i].getCreatedAt());
            blIssue.setUpdatedAt(issuesData[i].getUpdatedAt());
            blIssue.setBody(issuesData[i].getBody());

            blIssueLIst.add(blIssue);
        }
        return blIssueLIst;
    }
}
