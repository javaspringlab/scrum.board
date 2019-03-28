package io.github.rbuhler.scrum.board;

import model.board.BacklogIssues;
import model.board.IssueType;
import model.github.Issues;
import model.github.Pulls;
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
        issuesData = issues.GetIssues(auth, org, repo);
        int countIssues = issuesData.length;;

        /*todo*/
        /* remove this assignment */
        repo = "dummy_repository";

        PullsController pulls = new PullsController();
        Pulls[] pullsData = null;
        pullsData = pulls.GetPullsList(auth, org, repo);
        int countPulls  = pullsData.length;

        BacklogIssues blIssue = null;
        ArrayList<BacklogIssues> blIssueLIst = new ArrayList<BacklogIssues>();

        /* ISSUES*/
        for(int i=0; i < countIssues; i++){
            // Result Mapping
            blIssue = new BacklogIssues();
            blIssue.setOrgId(org);
            blIssue.setRepoId(repo);
            blIssue.setIssueType(IssueType.GIT_ISSUE);
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
        /* PULL REQUESTS*/
        for(int i=0; i < countPulls; i++){
            // Result Mapping
            blIssue = new BacklogIssues();
            blIssue.setOrgId(org);
            blIssue.setRepoId(repo);
            blIssue.setIssueType(IssueType.GIT_PULL);
            blIssue.setId(pullsData[i].getNumber());
            blIssue.setUrl(pullsData[i].getHtmlUrl());
            blIssue.setTitle(pullsData[i].getTitle());
            blIssue.setUserLogin(pullsData[i].getUser().getLogin());
            blIssue.setUserHtml(pullsData[i].getUser().getHtmlUrl());
            blIssue.setLabels(pullsData[i].getLabels());
            blIssue.setState(pullsData[i].getState());
            blIssue.setAssignee(pullsData[i].getAssignee());
            blIssue.setAssignees(pullsData[i].getAssignees());
            blIssue.setMilestone(pullsData[i].getMilestone());
            blIssue.setComments(pullsData[i].getComments());
            blIssue.setCreatedAt(pullsData[i].getCreatedAt());
            blIssue.setUpdatedAt(pullsData[i].getUpdatedAt());
            blIssue.setBody(pullsData[i].getBody());

            blIssueLIst.add(blIssue);
        }

        return blIssueLIst;
    }
}