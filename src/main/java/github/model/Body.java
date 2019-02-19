package github.model;

public class Body {
    private String basic;
    private String org;
    private String repo;

    Body(){}

    public Body(String basic, String org, String repo) {
        this.basic = basic;
        this.org   = org;
        this.repo  = repo;
    }

    public String getBasic() {
        return basic;
    }
    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getOrg() {
        return org;
    }
    public void setOrg(String org) {
        this.org = org;
    }

    public String getRepo() {
        return repo;
    }
    public void setRepo(String repo) {
        this.repo = repo;
    }
}
