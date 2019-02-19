package github.model;

public class OrganizationPlan {
    private String name;
    private String space;
    private int private_repos;
    private int filled_seats;
    private int seats;

    public OrganizationPlan(){}

    public OrganizationPlan(String name, String space, int private_repos, int filled_seats, int seats) {
        this.name = name;
        this.space = space;
        this.private_repos = private_repos;
        this.filled_seats = filled_seats;
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
        this.space = space;
    }

    public int getPrivate_repos() {
        return private_repos;
    }

    public void setPrivate_repos(int private_repos) {
        this.private_repos = private_repos;
    }

    public int getfilled_seats() {
        return filled_seats;
    }

    public void setfilled_seats(int filled_seats) {
        this.filled_seats = filled_seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
