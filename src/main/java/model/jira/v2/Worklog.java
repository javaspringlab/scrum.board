package model.jira.v2;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "self",
        "author",
        "updateAuthor",
        "comment",
        "updated",
        "visibility",
        "started",
        "timeSpent",
        "timeSpentSeconds",
        "id",
        "issueId"
})
public class Worklog {

    @JsonProperty("self")
    private String self;
    @JsonProperty("author")
    private Author__ author;
    @JsonProperty("updateAuthor")
    private UpdateAuthor_ updateAuthor;
    @JsonProperty("comment")
    private String comment;
    @JsonProperty("updated")
    private String updated;
    @JsonProperty("visibility")
    private Visibility_ visibility;
    @JsonProperty("started")
    private String started;
    @JsonProperty("timeSpent")
    private String timeSpent;
    @JsonProperty("timeSpentSeconds")
    private int timeSpentSeconds;
    @JsonProperty("id")
    private String id;
    @JsonProperty("issueId")
    private String issueId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Worklog() {
    }

    /**
     *
     * @param id
     * @param author
     * @param visibility
     * @param updated
     * @param timeSpentSeconds
     * @param updateAuthor
     * @param issueId
     * @param self
     * @param started
     * @param timeSpent
     * @param comment
     */
    public Worklog(String self, Author__ author, UpdateAuthor_ updateAuthor, String comment, String updated, Visibility_ visibility, String started, String timeSpent, int timeSpentSeconds, String id, String issueId) {
        super();
        this.self = self;
        this.author = author;
        this.updateAuthor = updateAuthor;
        this.comment = comment;
        this.updated = updated;
        this.visibility = visibility;
        this.started = started;
        this.timeSpent = timeSpent;
        this.timeSpentSeconds = timeSpentSeconds;
        this.id = id;
        this.issueId = issueId;
    }

    @JsonProperty("self")
    public String getSelf() {
        return self;
    }

    @JsonProperty("self")
    public void setSelf(String self) {
        this.self = self;
    }

    @JsonProperty("author")
    public Author__ getAuthor() {
        return author;
    }

    @JsonProperty("author")
    public void setAuthor(Author__ author) {
        this.author = author;
    }

    @JsonProperty("updateAuthor")
    public UpdateAuthor_ getUpdateAuthor() {
        return updateAuthor;
    }

    @JsonProperty("updateAuthor")
    public void setUpdateAuthor(UpdateAuthor_ updateAuthor) {
        this.updateAuthor = updateAuthor;
    }

    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    @JsonProperty("updated")
    public String getUpdated() {
        return updated;
    }

    @JsonProperty("updated")
    public void setUpdated(String updated) {
        this.updated = updated;
    }

    @JsonProperty("visibility")
    public Visibility_ getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(Visibility_ visibility) {
        this.visibility = visibility;
    }

    @JsonProperty("started")
    public String getStarted() {
        return started;
    }

    @JsonProperty("started")
    public void setStarted(String started) {
        this.started = started;
    }

    @JsonProperty("timeSpent")
    public String getTimeSpent() {
        return timeSpent;
    }

    @JsonProperty("timeSpent")
    public void setTimeSpent(String timeSpent) {
        this.timeSpent = timeSpent;
    }

    @JsonProperty("timeSpentSeconds")
    public int getTimeSpentSeconds() {
        return timeSpentSeconds;
    }

    @JsonProperty("timeSpentSeconds")
    public void setTimeSpentSeconds(int timeSpentSeconds) {
        this.timeSpentSeconds = timeSpentSeconds;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("issueId")
    public String getIssueId() {
        return issueId;
    }

    @JsonProperty("issueId")
    public void setIssueId(String issueId) {
        this.issueId = issueId;
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