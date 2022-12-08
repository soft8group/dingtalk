package entity;


public class User {
    protected String name;
    protected Integer id;

    public Integer getUserId() {
        System.out.print("UserId:");
        System.out.println(id);
        System.out.println("----------------");
        return id;
    }
    public String getUserName() {
        System.out.print("UserName:");
        System.out.println(name);
        return name;
    }
    public String UserName() {
        return name;
    }
    public void setUserName(String username) {
        this.name = username;
    }
    public void setUserId(Integer userid) {
        this.id = userid;
    }
}
