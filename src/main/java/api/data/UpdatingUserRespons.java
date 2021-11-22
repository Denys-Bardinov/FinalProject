package api.data;

public class UpdatingUserRespons {
    private String name;
    private String job;
    private String updatedAt;

    public UpdatingUserRespons(String name, String job, String updatedAt) {
        this.name = name;
        this.job = job;
        this.updatedAt = updatedAt;
    }

    public UpdatingUserRespons() {

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
