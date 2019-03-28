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
        "id",
        "node_id",
        "html_url",
        "diff_url",
        "patch_url",
        "issue_url",
        "number",
        "state",
        "locked",
        "title",
        "user",
        "body",
        "created_at",
        "updated_at",
        "closed_at",
        "merged_at",
        "merge_commit_sha",
        "assignee",
        "assignees",
        "requested_reviewers",
        "requested_teams",
        "labels",
        "milestone",
        "commits_url",
        "review_comments_url",
        "review_comment_url",
        "comments_url",
        "statuses_url",
        "head",
        "base",
        "_links",
        "author_association",
        "merged",
        "mergeable",
        "rebaseable",
        "mergeable_state",
        "merged_by",
        "comments",
        "review_comments",
        "maintainer_can_modify",
        "commits",
        "additions",
        "deletions",
        "changed_files"
})
public class Pulls {

    @JsonProperty("url")
    private String url;
    @JsonProperty("id")
    private int id;
    @JsonProperty("node_id")
    private String nodeId;
    @JsonProperty("html_url")
    private String htmlUrl;
    @JsonProperty("diff_url")
    private String diffUrl;
    @JsonProperty("patch_url")
    private String patchUrl;
    @JsonProperty("issue_url")
    private String issueUrl;
    @JsonProperty("number")
    private int number;
    @JsonProperty("state")
    private String state;
    @JsonProperty("locked")
    private boolean locked;
    @JsonProperty("title")
    private String title;
    @JsonProperty("user")
    private User user;
    @JsonProperty("body")
    private String body;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("closed_at")
    private Object closedAt;
    @JsonProperty("merged_at")
    private Object mergedAt;
    @JsonProperty("merge_commit_sha")
    private String mergeCommitSha;
    @JsonProperty("assignee")
    private Assignee assignee;
    @JsonProperty("assignees")
    private List<Assignee> assignees = null;
    @JsonProperty("requested_reviewers")
    private List<Object> requestedReviewers = null;
    @JsonProperty("requested_teams")
    private List<Object> requestedTeams = null;
    @JsonProperty("labels")
    private List<Label> labels = null;
    @JsonProperty("milestone")
    private Object milestone;
    @JsonProperty("commits_url")
    private String commitsUrl;
    @JsonProperty("review_comments_url")
    private String reviewCommentsUrl;
    @JsonProperty("review_comment_url")
    private String reviewCommentUrl;
    @JsonProperty("comments_url")
    private String commentsUrl;
    @JsonProperty("statuses_url")
    private String statusesUrl;
    @JsonProperty("head")
    private Head head;
    @JsonProperty("base")
    private Base base;
    @JsonProperty("_links")
    private Links links;
    @JsonProperty("author_association")
    private String authorAssociation;
    @JsonProperty("merged")
    private boolean merged;
    @JsonProperty("mergeable")
    private boolean mergeable;
    @JsonProperty("rebaseable")
    private boolean rebaseable;
    @JsonProperty("mergeable_state")
    private String mergeableState;
    @JsonProperty("merged_by")
    private Object mergedBy;
    @JsonProperty("comments")
    private int comments;
    @JsonProperty("review_comments")
    private int reviewComments;
    @JsonProperty("maintainer_can_modify")
    private boolean maintainerCanModify;
    @JsonProperty("commits")
    private int commits;
    @JsonProperty("additions")
    private int additions;
    @JsonProperty("deletions")
    private int deletions;
    @JsonProperty("changed_files")
    private int changedFiles;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Pulls() {
    }

    /**
     *
     * @param mergedBy
     * @param body
     * @param assignees
     * @param closedAt
     * @param state
     * @param mergeableState
     * @param deletions
     * @param reviewCommentUrl
     * @param mergeCommitSha
     * @param id
     * @param milestone
     * @param mergedAt
     * @param additions
     * @param title
     * @param htmlUrl
     * @param nodeId
     * @param rebaseable
     * @param commentsUrl
     * @param createdAt
     * @param commitsUrl
     * @param commits
     * @param head
     * @param patchUrl
     * @param labels
     * @param mergeable
     * @param assignee
     * @param links
     * @param number
     * @param issueUrl
     * @param reviewCommentsUrl
     * @param url
     * @param updatedAt
     * @param diffUrl
     * @param authorAssociation
     * @param requestedReviewers
     * @param base
     * @param maintainerCanModify
     * @param requestedTeams
     * @param reviewComments
     * @param locked
     * @param changedFiles
     * @param user
     * @param comments
     * @param merged
     * @param statusesUrl
     */
    public Pulls(String url, int id, String nodeId, String htmlUrl, String diffUrl, String patchUrl, String issueUrl, int number, String state, boolean locked, String title, User user, String body, String createdAt, String updatedAt, Object closedAt, Object mergedAt, String mergeCommitSha, Assignee assignee, List<Assignee> assignees, List<Object> requestedReviewers, List<Object> requestedTeams, List<Label> labels, Object milestone, String commitsUrl, String reviewCommentsUrl, String reviewCommentUrl, String commentsUrl, String statusesUrl, Head head, Base base, Links links, String authorAssociation, boolean merged, boolean mergeable, boolean rebaseable, String mergeableState, Object mergedBy, int comments, int reviewComments, boolean maintainerCanModify, int commits, int additions, int deletions, int changedFiles) {
        super();
        this.url = url;
        this.id = id;
        this.nodeId = nodeId;
        this.htmlUrl = htmlUrl;
        this.diffUrl = diffUrl;
        this.patchUrl = patchUrl;
        this.issueUrl = issueUrl;
        this.number = number;
        this.state = state;
        this.locked = locked;
        this.title = title;
        this.user = user;
        this.body = body;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.closedAt = closedAt;
        this.mergedAt = mergedAt;
        this.mergeCommitSha = mergeCommitSha;
        this.assignee = assignee;
        this.assignees = assignees;
        this.requestedReviewers = requestedReviewers;
        this.requestedTeams = requestedTeams;
        this.labels = labels;
        this.milestone = milestone;
        this.commitsUrl = commitsUrl;
        this.reviewCommentsUrl = reviewCommentsUrl;
        this.reviewCommentUrl = reviewCommentUrl;
        this.commentsUrl = commentsUrl;
        this.statusesUrl = statusesUrl;
        this.head = head;
        this.base = base;
        this.links = links;
        this.authorAssociation = authorAssociation;
        this.merged = merged;
        this.mergeable = mergeable;
        this.rebaseable = rebaseable;
        this.mergeableState = mergeableState;
        this.mergedBy = mergedBy;
        this.comments = comments;
        this.reviewComments = reviewComments;
        this.maintainerCanModify = maintainerCanModify;
        this.commits = commits;
        this.additions = additions;
        this.deletions = deletions;
        this.changedFiles = changedFiles;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
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

    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    @JsonProperty("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonProperty("diff_url")
    public String getDiffUrl() {
        return diffUrl;
    }

    @JsonProperty("diff_url")
    public void setDiffUrl(String diffUrl) {
        this.diffUrl = diffUrl;
    }

    @JsonProperty("patch_url")
    public String getPatchUrl() {
        return patchUrl;
    }

    @JsonProperty("patch_url")
    public void setPatchUrl(String patchUrl) {
        this.patchUrl = patchUrl;
    }

    @JsonProperty("issue_url")
    public String getIssueUrl() {
        return issueUrl;
    }

    @JsonProperty("issue_url")
    public void setIssueUrl(String issueUrl) {
        this.issueUrl = issueUrl;
    }

    @JsonProperty("number")
    public int getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(int number) {
        this.number = number;
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

    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    @JsonProperty("body")
    public void setBody(String body) {
        this.body = body;
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

    @JsonProperty("merged_at")
    public Object getMergedAt() {
        return mergedAt;
    }

    @JsonProperty("merged_at")
    public void setMergedAt(Object mergedAt) {
        this.mergedAt = mergedAt;
    }

    @JsonProperty("merge_commit_sha")
    public String getMergeCommitSha() {
        return mergeCommitSha;
    }

    @JsonProperty("merge_commit_sha")
    public void setMergeCommitSha(String mergeCommitSha) {
        this.mergeCommitSha = mergeCommitSha;
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

    @JsonProperty("requested_reviewers")
    public List<Object> getRequestedReviewers() {
        return requestedReviewers;
    }

    @JsonProperty("requested_reviewers")
    public void setRequestedReviewers(List<Object> requestedReviewers) {
        this.requestedReviewers = requestedReviewers;
    }

    @JsonProperty("requested_teams")
    public List<Object> getRequestedTeams() {
        return requestedTeams;
    }

    @JsonProperty("requested_teams")
    public void setRequestedTeams(List<Object> requestedTeams) {
        this.requestedTeams = requestedTeams;
    }

    @JsonProperty("labels")
    public List<Label> getLabels() {
        return labels;
    }

    @JsonProperty("labels")
    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    @JsonProperty("milestone")
    public Object getMilestone() {
        return milestone;
    }

    @JsonProperty("milestone")
    public void setMilestone(Object milestone) {
        this.milestone = milestone;
    }

    @JsonProperty("commits_url")
    public String getCommitsUrl() {
        return commitsUrl;
    }

    @JsonProperty("commits_url")
    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    @JsonProperty("review_comments_url")
    public String getReviewCommentsUrl() {
        return reviewCommentsUrl;
    }

    @JsonProperty("review_comments_url")
    public void setReviewCommentsUrl(String reviewCommentsUrl) {
        this.reviewCommentsUrl = reviewCommentsUrl;
    }

    @JsonProperty("review_comment_url")
    public String getReviewCommentUrl() {
        return reviewCommentUrl;
    }

    @JsonProperty("review_comment_url")
    public void setReviewCommentUrl(String reviewCommentUrl) {
        this.reviewCommentUrl = reviewCommentUrl;
    }

    @JsonProperty("comments_url")
    public String getCommentsUrl() {
        return commentsUrl;
    }

    @JsonProperty("comments_url")
    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    @JsonProperty("statuses_url")
    public String getStatusesUrl() {
        return statusesUrl;
    }

    @JsonProperty("statuses_url")
    public void setStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    @JsonProperty("head")
    public Head getHead() {
        return head;
    }

    @JsonProperty("head")
    public void setHead(Head head) {
        this.head = head;
    }

    @JsonProperty("base")
    public Base getBase() {
        return base;
    }

    @JsonProperty("base")
    public void setBase(Base base) {
        this.base = base;
    }

    @JsonProperty("_links")
    public Links getLinks() {
        return links;
    }

    @JsonProperty("_links")
    public void setLinks(Links links) {
        this.links = links;
    }

    @JsonProperty("author_association")
    public String getAuthorAssociation() {
        return authorAssociation;
    }

    @JsonProperty("author_association")
    public void setAuthorAssociation(String authorAssociation) {
        this.authorAssociation = authorAssociation;
    }

    @JsonProperty("merged")
    public boolean isMerged() {
        return merged;
    }

    @JsonProperty("merged")
    public void setMerged(boolean merged) {
        this.merged = merged;
    }

    @JsonProperty("mergeable")
    public boolean isMergeable() {
        return mergeable;
    }

    @JsonProperty("mergeable")
    public void setMergeable(boolean mergeable) {
        this.mergeable = mergeable;
    }

    @JsonProperty("rebaseable")
    public boolean isRebaseable() {
        return rebaseable;
    }

    @JsonProperty("rebaseable")
    public void setRebaseable(boolean rebaseable) {
        this.rebaseable = rebaseable;
    }

    @JsonProperty("mergeable_state")
    public String getMergeableState() {
        return mergeableState;
    }

    @JsonProperty("mergeable_state")
    public void setMergeableState(String mergeableState) {
        this.mergeableState = mergeableState;
    }

    @JsonProperty("merged_by")
    public Object getMergedBy() {
        return mergedBy;
    }

    @JsonProperty("merged_by")
    public void setMergedBy(Object mergedBy) {
        this.mergedBy = mergedBy;
    }

    @JsonProperty("comments")
    public int getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(int comments) {
        this.comments = comments;
    }

    @JsonProperty("review_comments")
    public int getReviewComments() {
        return reviewComments;
    }

    @JsonProperty("review_comments")
    public void setReviewComments(int reviewComments) {
        this.reviewComments = reviewComments;
    }

    @JsonProperty("maintainer_can_modify")
    public boolean isMaintainerCanModify() {
        return maintainerCanModify;
    }

    @JsonProperty("maintainer_can_modify")
    public void setMaintainerCanModify(boolean maintainerCanModify) {
        this.maintainerCanModify = maintainerCanModify;
    }

    @JsonProperty("commits")
    public int getCommits() {
        return commits;
    }

    @JsonProperty("commits")
    public void setCommits(int commits) {
        this.commits = commits;
    }

    @JsonProperty("additions")
    public int getAdditions() {
        return additions;
    }

    @JsonProperty("additions")
    public void setAdditions(int additions) {
        this.additions = additions;
    }

    @JsonProperty("deletions")
    public int getDeletions() {
        return deletions;
    }

    @JsonProperty("deletions")
    public void setDeletions(int deletions) {
        this.deletions = deletions;
    }

    @JsonProperty("changed_files")
    public int getChangedFiles() {
        return changedFiles;
    }

    @JsonProperty("changed_files")
    public void setChangedFiles(int changedFiles) {
        this.changedFiles = changedFiles;
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