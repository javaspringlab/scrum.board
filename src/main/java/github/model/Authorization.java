package github.model;

public class Authorization {
    private String Authorization;

    Authorization(){}

    public Authorization(String authorization) {
        Authorization = authorization;
    }

    public String getAuthorization() {
        return Authorization;
    }

    public void setAuthorization(String authorization) {
        Authorization = authorization;
    }
}
