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
        "type",
        "outwardIssue"
})
public class SubTask {

    @JsonProperty("id")
    private String id;
    @JsonProperty("type")
    private Type type;
    @JsonProperty("outwardIssue")
    private OutwardIssue outwardIssue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public SubTask() {
    }

    /**
     *
     * @param id
     * @param outwardIssue
     * @param type
     */
    public SubTask(String id, Type type, OutwardIssue outwardIssue) {
        super();
        this.id = id;
        this.type = type;
        this.outwardIssue = outwardIssue;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("type")
    public Type getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(Type type) {
        this.type = type;
    }

    @JsonProperty("outwardIssue")
    public OutwardIssue getOutwardIssue() {
        return outwardIssue;
    }

    @JsonProperty("outwardIssue")
    public void setOutwardIssue(OutwardIssue outwardIssue) {
        this.outwardIssue = outwardIssue;
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
