package github.model;

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
        "admin",
        "push",
        "pull"
})
public class PermisSions {

    @JsonProperty("admin")
    private boolean admin;
    @JsonProperty("push")
    private boolean push;
    @JsonProperty("pull")
    private boolean pull;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public PermisSions() {
    }

    /**
     *
     * @param pull
     * @param admin
     * @param push
     */
    public PermisSions(boolean admin, boolean push, boolean pull) {
        super();
        this.admin = admin;
        this.push = push;
        this.pull = pull;
    }

    @JsonProperty("admin")
    public boolean isAdmin() {
        return admin;
    }

    @JsonProperty("admin")
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    @JsonProperty("push")
    public boolean isPush() {
        return push;
    }

    @JsonProperty("push")
    public void setPush(boolean push) {
        this.push = push;
    }

    @JsonProperty("pull")
    public boolean isPull() {
        return pull;
    }

    @JsonProperty("pull")
    public void setPull(boolean pull) {
        this.pull = pull;
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