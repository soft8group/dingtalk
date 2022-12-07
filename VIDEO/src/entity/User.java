package entity;

public class User {
    protected String name;
    protected Integer id;

    public Integer getUserId() {
        return id;
    }
    public String getUserName() {
        return name;
    }
    public void setUserName(String username) {
        this.name = username;
    }
}
