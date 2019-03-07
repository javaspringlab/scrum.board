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
        "self",
        "filename",
        "author",
        "created",
        "size",
        "mimeType",
        "content",
        "thumbnail"
})
public class Attachment {

    @JsonProperty("id")
    private int id;
    @JsonProperty("self")
    private String self;
    @JsonProperty("filename")
    private String filename;
    @JsonProperty("author")
    private Author author;
    @JsonProperty("created")
    private String created;
    @JsonProperty("size")
    private int size;
    @JsonProperty("mimeType")
    private String mimeType;
    @JsonProperty("content")
    private String content;
    @JsonProperty("thumbnail")
    private String thumbnail;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Attachment() {
    }

    /**
     *
     * @param content
     * @param id
     * @param author
     * @param thumbnail
     * @param created
     * @param filename
     * @param self
     * @param mimeType
     * @param size
     */
    public Attachment(int id, String self, String filename, Author author, String created, int size, String mimeType, String content, String thumbnail) {
        super();
        this.id = id;
        this.self = self;
        this.filename = filename;
        this.author = author;
        this.created = created;
        this.size = size;
        this.mimeType = mimeType;
        this.content = content;
        this.thumbnail = thumbnail;
    }

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("self")
    public String getSelf() {
        return self;
    }

    @JsonProperty("self")
    public void setSelf(String self) {
        this.self = self;
    }

    @JsonProperty("filename")
    public String getFilename() {
        return filename;
    }

    @JsonProperty("filename")
    public void setFilename(String filename) {
        this.filename = filename;
    }

    @JsonProperty("author")
    public Author getAuthor() {
        return author;
    }

    @JsonProperty("author")
    public void setAuthor(Author author) {
        this.author = author;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("size")
    public int getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(int size) {
        this.size = size;
    }

    @JsonProperty("mimeType")
    public String getMimeType() {
        return mimeType;
    }

    @JsonProperty("mimeType")
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    @JsonProperty("thumbnail")
    public String getThumbnail() {
        return thumbnail;
    }

    @JsonProperty("thumbnail")
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
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
