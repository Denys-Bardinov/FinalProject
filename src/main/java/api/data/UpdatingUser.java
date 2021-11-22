package api.data;

public class UpdatingUser {
    private String name;
    private String job;

    public UpdatingUser() {

    }

    public UpdatingUser(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }
}
