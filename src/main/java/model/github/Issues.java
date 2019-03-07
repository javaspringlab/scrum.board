package model.github;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "url",
        "repository_url",
        "labels_url",
        "comments_url",
        "events_url",
        "html_url",
        "id",
        "node_id",
        "number",
        "title",
        "user",
        "labels",
        "state",
        "locked",
        "assignee",
        "assignees",
        "milestone",
        "comments",
        "created_at",
        "updated_at",
        "closed_at",
        "author_association",
        "body",
        "closed_by"
})
public class Issues {

    @JsonProperty("url")
    private String url;
    @JsonProperty("repository_url")
    private String repositoryUrl;
    @JsonProperty("labels_url")
    private String labelsUrl;
    @JsonProperty("comments_url")
    private String commentsUrl;
    @JsonProperty("events_url")
    private String eventsUrl;
    @JsonProperty("html_url")
    private String htmlUrl;
    @JsonProperty("id")
    private int id;
    @JsonProperty("node_id")
    private String nodeId;
    @JsonProperty("number")
    private int number;
    @JsonProperty("title")
    private String title;
    @JsonProperty("user")
    private User user;
    @JsonProperty("labels")
    private List<Label> labels = null;
    @JsonProperty("state")
    private String state;
    @JsonProperty("locked")
    private boolean locked;
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
    @JsonProperty("closed_at")
    private Object closedAt;
    @JsonProperty("author_association")
    private String authorAssociation;
    @JsonProperty("body")
    private String body;
    @JsonProperty("closed_by")
    private Object closedBy;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Issues() {
    }

    /**
     *
     * @param body
     * @param eventsUrl
     * @param assignees
     * @param closedAt
     * @param labels
     * @param state
     * @param assignee
     * @param number
     * @param url
     * @param updatedAt
     * @param milestone
     * @param id
     * @param htmlUrl
     * @param nodeId
     * @param title
     * @param authorAssociation
     * @param createdAt
     * @param commentsUrl
     * @param labelsUrl
     * @param locked
     * @param repositoryUrl
     * @param user
     * @param comments
     * @param closedBy
     */
    public Issues(String url, String repositoryUrl, String labelsUrl, String commentsUrl, String eventsUrl, String htmlUrl, int id, String nodeId, int number, String title, User user, List<Label> labels, String state, boolean locked, Assignee assignee, List<Assignee> assignees, Object milestone, int comments, String createdAt, String updatedAt, Object closedAt, String authorAssociation, String body, Object closedBy) {
        super();
        this.url = url;
        this.repositoryUrl = repositoryUrl;
        this.labelsUrl = labelsUrl;
        this.commentsUrl = commentsUrl;
        this.eventsUrl = eventsUrl;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.nodeId = nodeId;
        this.number = number;
        this.title = title;
        this.user = user;
        this.labels = labels;
        this.state = state;
        this.locked = locked;
        this.assignee = assignee;
        this.assignees = assignees;
        this.milestone = milestone;
        this.comments = comments;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.closedAt = closedAt;
        this.authorAssociation = authorAssociation;
        this.body = body;
        this.closedBy = closedBy;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("repository_url")
    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    @JsonProperty("repository_url")
    public void setRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    @JsonProperty("labels_url")
    public String getLabelsUrl() {
        return labelsUrl;
    }

    @JsonProperty("labels_url")
    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    @JsonProperty("comments_url")
    public String getCommentsUrl() {
        return commentsUrl;
    }

    @JsonProperty("comments_url")
    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    @JsonProperty("events_url")
    public String getEventsUrl() {
        return eventsUrl;
    }

    @JsonProperty("events_url")
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    @JsonProperty("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    @JsonProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonProperty("number")
    public int getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(int number) {
        this.number = number;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    @JsonProperty("labels")
    public List<Label> getLabels() {
        return labels;
    }

    @JsonProperty("labels")
    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("locked")
    public boolean isLocked() {
        return locked;
    }

    @JsonProperty("locked")
    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    @JsonProperty("assignee")
    public Assignee getAssignee() {
        return assignee;
    }

    @JsonProperty("assignee")
    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }

    @JsonProperty("assignees")
    public List<Assignee> getAssignees() {
        return assignees;
    }

    @JsonProperty("assignees")
    public void setAssignees(List<Assignee> assignees) {
        this.assignees = assignees;
    }

    @JsonProperty("milestone")
    public Object getMilestone() {
        return milestone;
    }

    @JsonProperty("milestone")
    public void setMilestone(Object milestone) {
        this.milestone = milestone;
    }

    @JsonProperty("comments")
    public int getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(int comments) {
        this.comments = comments;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("closed_at")
    public Object getClosedAt() {
        return closedAt;
    }

    @JsonProperty("closed_at")
    public void setClosedAt(Object closedAt) {
        this.closedAt = closedAt;
    }

    @JsonProperty("author_association")
    public String getAuthorAssociation() {
        return authorAssociation;
    }

    @JsonProperty("author_association")
    public void setAuthorAssociation(String authorAssociation) {
        this.authorAssociation = authorAssociation;
    }

    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    @JsonProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    @JsonProperty("closed_by")
    public Object getClosedBy() {
        return closedBy;
    }

    @JsonProperty("closed_by")
    public void setClosedBy(Object closedBy) {
        this.closedBy = closedBy;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}