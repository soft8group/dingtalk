package entity;

public class Comment {
    private String content;
    private Integer VideoId;
    private Integer UserId;

    public String getContent() {
        return content;
    }
    public Integer getVideoId() {
        return VideoId;
    }
    public Integer getUserId() {
        return UserId;
    }
    public void setContent(String content) {
        this.content = content;
    }
}
