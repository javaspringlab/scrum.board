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
        "id",
        "key",
        "self",
        "fields"
})
public class InwardIssue {

    @JsonProperty("id")
    private String id;
    @JsonProperty("key")
    private String key;
    @JsonProperty("self")
    private String self;
    @JsonProperty("fields")
    private Fields___ fields;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public InwardIssue() {
    }

    /**
     *
     * @param id
     * @param self
     * @param key
     * @param fields
     */
    public InwardIssue(String id, String key, String self, Fields___ fields) {
        super();
        this.id = id;
        this.key = key;
        this.self = self;
        this.fields = fields;
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

    @JsonProperty("self")
    public String getSelf() {
        return self;
    }

    @JsonProperty("self")
    public void setSelf(String self) {
        this.self = self;
    }

    @JsonProperty("fields")
    public Fields___ getFields() {
        return fields;
    }

    @JsonProperty("fields")
    public void setFields(Fields___ fields) {
        this.fields = fields;
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
