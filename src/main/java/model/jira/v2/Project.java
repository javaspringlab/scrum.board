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
        "id",
        "key",
        "name",
        "avatarUrls",
        "projectCategory",
        "simplified",
        "style"
})
public class Project {

    @JsonProperty("self")
    private String self;
    @JsonProperty("id")
    private String id;
    @JsonProperty("key")
    private String key;
    @JsonProperty("name")
    private String name;
    @JsonProperty("avatarUrls")
    private AvatarUrls_ avatarUrls;
    @JsonProperty("projectCategory")
    private ProjectCategory projectCategory;
    @JsonProperty("simplified")
    private boolean simplified;
    @JsonProperty("style")
    private String style;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Project() {
    }

    /**
     *
     * @param id
     * @param style
     * @param name
     * @param self
     * @param avatarUrls
     * @param simplified
     * @param key
     * @param projectCategory
     */
    public Project(String self, String id, String key, String name, AvatarUrls_ avatarUrls, ProjectCategory projectCategory, boolean simplified, String style) {
        super();
        this.self = self;
        this.id = id;
        this.key = key;
        this.name = name;
        this.avatarUrls = avatarUrls;
        this.projectCategory = projectCategory;
        this.simplified = simplified;
        this.style = style;
    }

    @JsonProperty("self")
    public String getSelf() {
        return self;
    }

    @JsonProperty("self")
    public void setSelf(String self) {
        this.self = self;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("avatarUrls")
    public AvatarUrls_ getAvatarUrls() {
        return avatarUrls;
    }

    @JsonProperty("avatarUrls")
    public void setAvatarUrls(AvatarUrls_ avatarUrls) {
        this.avatarUrls = avatarUrls;
    }

    @JsonProperty("projectCategory")
    public ProjectCategory getProjectCategory() {
        return projectCategory;
    }

    @JsonProperty("projectCategory")
    public void setProjectCategory(ProjectCategory projectCategory) {
        this.projectCategory = projectCategory;
    }

    @JsonProperty("simplified")
    public boolean isSimplified() {
        return simplified;
    }

    @JsonProperty("simplified")
    public void setSimplified(boolean simplified) {
        this.simplified = simplified;
    }

    @JsonProperty("style")
    public String getStyle() {
        return style;
    }

    @JsonProperty("style")
    public void setStyle(String style) {
        this.style = style;
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
