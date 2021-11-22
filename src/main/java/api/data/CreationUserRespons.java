package api.data;

public class CreationUserRespons {
    private String name;
    private String job;
    private String updatedAt;

    public CreationUserRespons(String name, String job, String updatedAt) {
        this.name = name;
        this.job = job;
        this.updatedAt = updatedAt;
    }

    public CreationUserRespons() {

    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
}
