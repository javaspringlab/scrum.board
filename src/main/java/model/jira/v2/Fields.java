package model.jira.v2;

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
        "watcher",
        "attachment",
        "sub-tasks",
        "description",
        "project",
        "comment",
        "issuelinks",
        "worklog",
        "updated",
        "timetracking"
})
public class Fields {

    @JsonProperty("watcher")
    private Watcher watcher;
    @JsonProperty("attachment")
    private List<Attachment> attachment = null;
    @JsonProperty("sub-tasks")
    private List<SubTask> subTasks = null;
    @JsonProperty("description")
    private String description;
    @JsonProperty("project")
    private Project project;
    @JsonProperty("comment")
    private List<Comment> comment = null;
    @JsonProperty("issuelinks")
    private List<Issuelink> issuelinks = null;
    @JsonProperty("worklog")
    private List<Worklog> worklog = null;
    @JsonProperty("updated")
    private int updated;
    @JsonProperty("timetracking")
    private Timetracking timetracking;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Fields() {
    }

    /**
     *
     * @param timetracking
     * @param project
     * @param updated
     * @param description
     * @param issuelinks
     * @param attachment
     * @param comment
     * @param watcher
     * @param subTasks
     * @param worklog
     */
    public Fields(Watcher watcher, List<Attachment> attachment, List<SubTask> subTasks, String description, Project project, List<Comment> comment, List<Issuelink> issuelinks, List<Worklog> worklog, int updated, Timetracking timetracking) {
        super();
        this.watcher = watcher;
        this.attachment = attachment;
        this.subTasks = subTasks;
        this.description = description;
        this.project = project;
        this.comment = comment;
        this.issuelinks = issuelinks;
        this.worklog = worklog;
        this.updated = updated;
        this.timetracking = timetracking;
    }

    @JsonProperty("watcher")
    public Watcher getWatcher() {
        return watcher;
    }

    @JsonProperty("watcher")
    public void setWatcher(Watcher watcher) {
        this.watcher = watcher;
    }

    @JsonProperty("attachment")
    public List<Attachment> getAttachment() {
        return attachment;
    }

    @JsonProperty("attachment")
    public void setAttachment(List<Attachment> attachment) {
        this.attachment = attachment;
    }

    @JsonProperty("sub-tasks")
    public List<SubTask> getSubTasks() {
        return subTasks;
    }

    @JsonProperty("sub-tasks")
    public void setSubTasks(List<SubTask> subTasks) {
        this.subTasks = subTasks;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("project")
    public Project getProject() {
        return project;
    }

    @JsonProperty("project")
    public void setProject(Project project) {
        this.project = project;
    }

    @JsonProperty("comment")
    public List<Comment> getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }

    @JsonProperty("issuelinks")
    public List<Issuelink> getIssuelinks() {
        return issuelinks;
    }

    @JsonProperty("issuelinks")
    public void setIssuelinks(List<Issuelink> issuelinks) {
        this.issuelinks = issuelinks;
    }

    @JsonProperty("worklog")
    public List<Worklog> getWorklog() {
        return worklog;
    }

    @JsonProperty("worklog")
    public void setWorklog(List<Worklog> worklog) {
        this.worklog = worklog;
    }

    @JsonProperty("updated")
    public int getUpdated() {
        return updated;
    }

    @JsonProperty("updated")
    public void setUpdated(int updated) {
        this.updated = updated;
    }

    @JsonProperty("timetracking")
    public Timetracking getTimetracking() {
        return timetracking;
    }

    @JsonProperty("timetracking")
    public void setTimetracking(Timetracking timetracking) {
        this.timetracking = timetracking;
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
