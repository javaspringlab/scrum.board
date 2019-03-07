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
        "originalEstimate",
        "remainingEstimate",
        "timeSpent",
        "originalEstimateSeconds",
        "remainingEstimateSeconds",
        "timeSpentSeconds"
})
public class Timetracking {

    @JsonProperty("originalEstimate")
    private String originalEstimate;
    @JsonProperty("remainingEstimate")
    private String remainingEstimate;
    @JsonProperty("timeSpent")
    private String timeSpent;
    @JsonProperty("originalEstimateSeconds")
    private int originalEstimateSeconds;
    @JsonProperty("remainingEstimateSeconds")
    private int remainingEstimateSeconds;
    @JsonProperty("timeSpentSeconds")
    private int timeSpentSeconds;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Timetracking() {
    }

    /**
     *
     * @param originalEstimate
     * @param remainingEstimate
     * @param remainingEstimateSeconds
     * @param originalEstimateSeconds
     * @param timeSpentSeconds
     * @param timeSpent
     */
    public Timetracking(String originalEstimate, String remainingEstimate, String timeSpent, int originalEstimateSeconds, int remainingEstimateSeconds, int timeSpentSeconds) {
        super();
        this.originalEstimate = originalEstimate;
        this.remainingEstimate = remainingEstimate;
        this.timeSpent = timeSpent;
        this.originalEstimateSeconds = originalEstimateSeconds;
        this.remainingEstimateSeconds = remainingEstimateSeconds;
        this.timeSpentSeconds = timeSpentSeconds;
    }

    @JsonProperty("originalEstimate")
    public String getOriginalEstimate() {
        return originalEstimate;
    }

    @JsonProperty("originalEstimate")
    public void setOriginalEstimate(String originalEstimate) {
        this.originalEstimate = originalEstimate;
    }

    @JsonProperty("remainingEstimate")
    public String getRemainingEstimate() {
        return remainingEstimate;
    }

    @JsonProperty("remainingEstimate")
    public void setRemainingEstimate(String remainingEstimate) {
        this.remainingEstimate = remainingEstimate;
    }

    @JsonProperty("timeSpent")
    public String getTimeSpent() {
        return timeSpent;
    }

    @JsonProperty("timeSpent")
    public void setTimeSpent(String timeSpent) {
        this.timeSpent = timeSpent;
    }

    @JsonProperty("originalEstimateSeconds")
    public int getOriginalEstimateSeconds() {
        return originalEstimateSeconds;
    }

    @JsonProperty("originalEstimateSeconds")
    public void setOriginalEstimateSeconds(int originalEstimateSeconds) {
        this.originalEstimateSeconds = originalEstimateSeconds;
    }

    @JsonProperty("remainingEstimateSeconds")
    public int getRemainingEstimateSeconds() {
        return remainingEstimateSeconds;
    }

    @JsonProperty("remainingEstimateSeconds")
    public void setRemainingEstimateSeconds(int remainingEstimateSeconds) {
        this.remainingEstimateSeconds = remainingEstimateSeconds;
    }

    @JsonProperty("timeSpentSeconds")
    public int getTimeSpentSeconds() {
        return timeSpentSeconds;
    }

    @JsonProperty("timeSpentSeconds")
    public void setTimeSpentSeconds(int timeSpentSeconds) {
        this.timeSpentSeconds = timeSpentSeconds;
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
