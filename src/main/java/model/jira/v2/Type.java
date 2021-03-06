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
        "name",
        "inward",
        "outward"
})
public class Type {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("inward")
    private String inward;
    @JsonProperty("outward")
    private String outward;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Type() {
    }

    /**
     *
     * @param id
     * @param outward
     * @param inward
     * @param name
     */
    public Type(String id, String name, String inward, String outward) {
        super();
        this.id = id;
        this.name = name;
        this.inward = inward;
        this.outward = outward;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("inward")
    public String getInward() {
        return inward;
    }

    @JsonProperty("inward")
    public void setInward(String inward) {
        this.inward = inward;
    }

    @JsonProperty("outward")
    public String getOutward() {
        return outward;
    }

    @JsonProperty("outward")
    public void setOutward(String outward) {
        this.outward = outward;
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
