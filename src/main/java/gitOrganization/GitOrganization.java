package gitOrganization;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GitOrganization {
        private String login;
        private int id;
        private String node_id;
        private String url;
        private String repos_url;
        private String events_url;
        private String hooks_url;
        private String issues_url;
        private String members_url;
        private String public_members_url;
        private String avatar_url;
        private String description;

        @Override
    public String toString() {
        return "Organization{" +
                "id='" + id    +
                "org='"+ login + '\'' +
                '}';
    }
}

/*
    https://spring.io/guides/gs/consuming-rest/"
 */