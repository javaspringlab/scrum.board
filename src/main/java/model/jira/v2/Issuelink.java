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
        "outwardIssue",
        "inwardIssue"
})
public class Issuelink {

    @JsonProperty("id")
    private String id;
    @JsonProperty("type")
    private Type_ type;
    @JsonProperty("outwardIssue")
    private OutwardIssue_ outwardIssue;
    @JsonProperty("inwardIssue")
    private InwardIssue inwardIssue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Issuelink() {
    }

    /**
     *
     * @param id
     * @param inwardIssue
     * @param outwardIssue
     * @param type
     */
    public Issuelink(String id, Type_ type, OutwardIssue_ outwardIssue, InwardIssue inwardIssue) {
        super();
        this.id = id;
        this.type = type;
        this.outwardIssue = outwardIssue;
        this.inwardIssue = inwardIssue;
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
    public Type_ getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(Type_ type) {
        this.type = type;
    }

    @JsonProperty("outwardIssue")
    public OutwardIssue_ getOutwardIssue() {
        return outwardIssue;
    }

    @JsonProperty("outwardIssue")
    public void setOutwardIssue(OutwardIssue_ outwardIssue) {
        this.outwardIssue = outwardIssue;
    }

    @JsonProperty("inwardIssue")
    public InwardIssue getInwardIssue() {
        return inwardIssue;
    }

    @JsonProperty("inwardIssue")
    public void setInwardIssue(InwardIssue inwardIssue) {
        this.inwardIssue = inwardIssue;
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
