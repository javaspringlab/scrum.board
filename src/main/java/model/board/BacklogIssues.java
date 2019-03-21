package model.board;

import com.fasterxml.jackson.annotation.*;
import model.github.Assignee;
import model.github.Label;
import model.github.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "orgId", /* "login": "javaspringlab" */
        "repoId",  /* "name": "scrum.board" */
        "id", /* "number": 2 */
        "url",
        "title",
        "userLogin", /* user": { "login */
        "userHtml", /* html_url */
        "labels", /* [ ] */
        "state",
        "assignee",
        "assignees", /* [ ] */
        "milestone", /* [ ] */
        "comments", /* index of how many */
        "created_at",
        "updated_at",
        "body",
})

public class BacklogIssues {

    @JsonProperty("orgId")
    private String orgId;
    @JsonProperty("repoId")
    private String repoId;
    @JsonProperty("id")
    private int id;
    @JsonProperty("url")
    private String url;
    @JsonProperty("title")
    private String title;
    @JsonProperty("userLogin")
    private String userLogin;
    @JsonProperty("userHtml")
    private String userHtml;
    @JsonProperty("labels")
    private List<Label> labels = null;
    @JsonProperty("state")
    private String state;
    @JsonProperty("assignee")
    private Assignee assignee;
    @JsonProperty("assignees")
    private List<Assignee> assignees = null;
    @JsonProperty("milestone")
    private Object milestone;
    @JsonProperty("comments")
    private int comments;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("body")
    private String body;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public BacklogIssues() {
    }

    public BacklogIssues(String orgId, String repoId, int id, String url, String title, String userLogin, String userHtml, List<Label> labels, String state, Assignee assignee, List<Assignee> assignees, Object milestone, int comments, String createdAt, String updatedAt, String body ) {
        this.orgId = orgId;
        this.repoId = repoId;
        this.id = id;
        this.url = url;
        this.title = title;
        this.userLogin = userLogin;
        this.userHtml = userHtml;
        this.labels = labels;
        this.state = state;
        this.assignee = assignee;
        this.assignees = assignees;
        this.milestone = milestone;
        this.comments = comments;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.body = body;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getRepoId() {
        return repoId;
    }

    public void setRepoId(String repoId) {
        this.repoId = repoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserHtml() {
        return userHtml;
    }

    public void setUserHtml(String userHtml) {
        this.userHtml = userHtml;
    }

    public List<Label> getLabels() {
        return labels;
    }

    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }

    public List<Assignee> getAssignees() {
        return assignees;
    }

    public void setAssignees(List<Assignee> assignees) {
        this.assignees = assignees;
    }

    public Object getMilestone() {
        return milestone;
    }

    public void setMilestone(Object milestone) {
        this.milestone = milestone;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }
}