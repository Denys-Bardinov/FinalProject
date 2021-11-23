package api.data;

public class CreationUserResponse {
    private String name;
    private String job;
    private String id;
    private String createdAt;

    public CreationUserResponse() {
    }

    public CreationUserResponse(String name, String job, String id, String createdAt) {
        this.name = name;
        this.job = job;
        this.id = id;
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getId() {
        return id;
    }

    public String getCreatedAt() {
        return createdAt;
    }
}
