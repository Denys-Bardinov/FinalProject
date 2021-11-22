package api.data;

public class CreationUser {
    private String name;
    private String job;

    public CreationUser() {

    }

    public CreationUser(String name, String job) {
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
