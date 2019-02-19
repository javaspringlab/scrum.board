package github.model;

public class Organization {
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
        private String name;
        private String company;
        private String blog;
        private String location;
        private String email;
        private boolean is_verified;
        private boolean has_organization_projects;
        private boolean has_repository_projects;
        private int public_repos;
        private int public_gists;
        private int followers;
        private int following;
        private String html_url;
        private String created_at;
        private String updated_at;
        private String type;
        private int total_private_repos;
        private int owned_private_repos;
        private int private_gists;
        private int disk_usage;
        private int collaborators;
        private String billing_email;
        private OrganizationPlan plan;
        private String default_repository_permission;
        private boolean members_can_create_repositories;
        private boolean two_factor_requirement_enabled;

        public Organization(){}

    public Organization(String login, int id, String node_id, String url, String repos_url, String events_url, String hooks_url, String issues_url, String members_url, String public_members_url, String avatar_url, String description, String name, String company, String blog, String location, String email, boolean is_verified, boolean has_organization_projects, boolean has_repository_projects, int public_repos, int public_gists, int followers, int following, String html_url, String created_at, String updated_at, String type, int total_private_repos, int owned_private_repos, int private_gists, int disk_usage, int collaborators, String billing_email, OrganizationPlan plan, String default_repository_permission, boolean members_can_create_repositories, boolean two_factor_requirement_enabled) {
        this.login = login;
        this.id = id;
        this.node_id = node_id;
        this.url = url;
        this.repos_url = repos_url;
        this.events_url = events_url;
        this.hooks_url = hooks_url;
        this.issues_url = issues_url;
        this.members_url = members_url;
        this.public_members_url = public_members_url;
        this.avatar_url = avatar_url;
        this.description = description;
        this.name = name;
        this.company = company;
        this.blog = blog;
        this.location = location;
        this.email = email;
        this.is_verified = is_verified;
        this.has_organization_projects = has_organization_projects;
        this.has_repository_projects = has_repository_projects;
        this.public_repos = public_repos;
        this.public_gists = public_gists;
        this.followers = followers;
        this.following = following;
        this.html_url = html_url;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.type = type;
        this.total_private_repos = total_private_repos;
        this.owned_private_repos = owned_private_repos;
        this.private_gists = private_gists;
        this.disk_usage = disk_usage;
        this.collaborators = collaborators;
        this.billing_email = billing_email;
        this.plan = plan;
        this.default_repository_permission = default_repository_permission;
        this.members_can_create_repositories = members_can_create_repositories;
        this.two_factor_requirement_enabled = two_factor_requirement_enabled;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNode_id() {
        return node_id;
    }

    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRepos_url() {
        return repos_url;
    }

    public void setRepos_url(String repos_url) {
        this.repos_url = repos_url;
    }

    public String getEvents_url() {
        return events_url;
    }

    public void setEvents_url(String events_url) {
        this.events_url = events_url;
    }

    public String getHooks_url() {
        return hooks_url;
    }

    public void setHooks_url(String hooks_url) {
        this.hooks_url = hooks_url;
    }

    public String getIssues_url() {
        return issues_url;
    }

    public void setIssues_url(String issues_url) {
        this.issues_url = issues_url;
    }

    public String getMembers_url() {
        return members_url;
    }

    public void setMembers_url(String members_url) {
        this.members_url = members_url;
    }

    public String getPublic_members_url() {
        return public_members_url;
    }

    public void setPublic_members_url(String public_members_url) {
        this.public_members_url = public_members_url;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isIs_verified() {
        return is_verified;
    }

    public void setIs_verified(boolean is_verified) {
        this.is_verified = is_verified;
    }

    public boolean isHas_organization_projects() {
        return has_organization_projects;
    }

    public void setHas_organization_projects(boolean has_organization_projects) {
        this.has_organization_projects = has_organization_projects;
    }

    public boolean isHas_repository_projects() {
        return has_repository_projects;
    }

    public void setHas_repository_projects(boolean has_repository_projects) {
        this.has_repository_projects = has_repository_projects;
    }

    public int getpublic_repos() {
        return public_repos;
    }

    public void setpublic_repos(int public_repos) {
        this.public_repos = public_repos;
    }

    public int getPublic_gists() {
        return public_gists;
    }

    public void setPublic_gists(int public_gists) {
        this.public_gists = public_gists;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTotal_private_repos() {
        return total_private_repos;
    }

    public void setTotal_private_repos(int total_private_repos) {
        this.total_private_repos = total_private_repos;
    }

    public int getOwned_private_repos() {
        return owned_private_repos;
    }

    public void setOwned_private_repos(int owned_private_repos) {
        this.owned_private_repos = owned_private_repos;
    }

    public int getPrivate_gists() {
        return private_gists;
    }

    public void setPrivate_gists(int private_gists) {
        this.private_gists = private_gists;
    }

    public int getdisk_usage() {
        return disk_usage;
    }

    public void setdisk_usage(int disk_usage) {
        this.disk_usage = disk_usage;
    }

    public int getCollaborators() {
        return collaborators;
    }

    public void setCollaborators(int collaborators) {
        this.collaborators = collaborators;
    }

    public String getbilling_email() {
        return billing_email;
    }

    public void setbilling_email(String billing_email) {
        this.billing_email = billing_email;
    }

    public OrganizationPlan getPlan() {
        return plan;
    }

    public void setPlan(OrganizationPlan plan) {
        this.plan = plan;
    }

    public String getDefault_repository_permission() {
        return default_repository_permission;
    }

    public void setDefault_repository_permission(String default_repository_permission) {
        this.default_repository_permission = default_repository_permission;
    }

    public boolean ismembers_can_create_repositories() {
        return members_can_create_repositories;
    }

    public void setmembers_can_create_repositories(boolean members_can_create_repositories) {
        this.members_can_create_repositories = members_can_create_repositories;
    }

    public boolean istwo_factor_requirement_enabled() {
        return two_factor_requirement_enabled;
    }

    public void settwo_factor_requirement_enabled(boolean two_factor_requirement_enabled) {
        this.two_factor_requirement_enabled = two_factor_requirement_enabled;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "id='" + id    +
                "org='"+ login + '\'' +
                '}';
    }
}