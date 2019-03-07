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
        "self",
        "isWatching",
        "watchCount",
        "watchers"
})
public class Watcher {

    @JsonProperty("self")
    private String self;
    @JsonProperty("isWatching")
    private boolean isWatching;
    @JsonProperty("watchCount")
    private int watchCount;
    @JsonProperty("watchers")
    private List<Watcher_> watchers = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Watcher() {
    }

    /**
     *
     * @param watchCount
     * @param isWatching
     * @param self
     * @param watchers
     */
    public Watcher(String self, boolean isWatching, int watchCount, List<Watcher_> watchers) {
        super();
        this.self = self;
        this.isWatching = isWatching;
        this.watchCount = watchCount;
        this.watchers = watchers;
    }

    @JsonProperty("self")
    public String getSelf() {
        return self;
    }

    @JsonProperty("self")
    public void setSelf(String self) {
        this.self = self;
    }

    @JsonProperty("isWatching")
    public boolean isIsWatching() {
        return isWatching;
    }

    @JsonProperty("isWatching")
    public void setIsWatching(boolean isWatching) {
        this.isWatching = isWatching;
    }

    @JsonProperty("watchCount")
    public int getWatchCount() {
        return watchCount;
    }

    @JsonProperty("watchCount")
    public void setWatchCount(int watchCount) {
        this.watchCount = watchCount;
    }

    @JsonProperty("watchers")
    public List<Watcher_> getWatchers() {
        return watchers;
    }

    @JsonProperty("watchers")
    public void setWatchers(List<Watcher_> watchers) {
        this.watchers = watchers;
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