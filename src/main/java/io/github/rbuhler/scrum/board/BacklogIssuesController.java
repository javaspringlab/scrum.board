package io.github.rbuhler.scrum.board;

import model.board.BacklogIssues;
import model.github.Issues;
import model.github.Organization;
import model.github.Repository;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BacklogIssuesController {

    @RequestMapping("/backlogIssueList")
    public BacklogIssues[] backlogissues(@RequestHeader(value="Authorization") String auth,
                                                   @RequestParam(value="org") String org,
                                                   @RequestParam (value="repo") String repo) {


        OrganizationController organization = new OrganizationController();
        RepositoryController repository = new RepositoryController();
        IssuesController issues = new IssuesController();

        Organization orgData = new Organization();
        Repository repoData  = new Repository();
        Issues[] issuesData  = null;

        BacklogIssues[] blIssueLIst = null;

        orgData = organization.getOrganization(auth, org);
        repoData = repository.getRepo(auth, org,repo);
        issuesData = issues.GetIssues(auth, org, repo);

        int countIssues;
        countIssues = issuesData.length;

        for(int i=0; i <= countIssues; i++){
            // Result Mapping
            blIssueLIst[i].setOrgId("");
            blIssueLIst[i].setRepoId("");
            blIssueLIst[i].setId(0);
            blIssueLIst[i].setUrl("");
            blIssueLIst[i].setTitle("");
            blIssueLIst[i].setUserLogin(""); /* user": { "login */
            blIssueLIst[i].setUserHtml(""); /* html_url */
            blIssueLIst[i].setLabels(null); /* [ ] */
            blIssueLIst[i].setState("");
            blIssueLIst[i].setAssignee(null);
            blIssueLIst[i].setAssignees(null); /* [ ] */
            blIssueLIst[i].setMilestone(""); /* [ ] */
            blIssueLIst[i].setComments(0); /* index of how many */
            blIssueLIst[i].setCreatedAt("");
            blIssueLIst[i].setUpdatedAt("");
            blIssueLIst[i].setBody("");
        }
        return blIssueLIst;
    }

}
