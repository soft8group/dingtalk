package entity;

import java.util.ArrayList;
import java.util.List;

public class Video {
    private Integer id;
    private String title;
    private Integer likenum = 0;
    private Comment comment1 = new Comment();
    private Comment comment2 = new Comment();
    private List<Comment> commentList = new ArrayList<>();
    private List<Like> likeList = new ArrayList<>();

    public Integer getVideoId() {
        System.out.print("VideoId:");
        System.out.println(id);
        return id;
    }
    public String getVideoTitle() {
        System.out.print("VideoTitle:");
        System.out.println(title);
        return title;
    }
    public Integer showLikenum(){
        System.out.print("LikeNumber:");
        System.out.println(likenum);
        return 0;
    }
    public String VideoTitle(){
        return title;
    }
    public void showComment(){
        System.out.print("Video:");
        System.out.print(title);
        System.out.println("  Comment:");
        for(int i=0;i<=commentList.size()-1;i++){
            this.comment2 = commentList.get(i);
            System.out.println(this.comment2.getContent());
        }
        System.out.println("----------------");
    }
    public void setVideoTitle(String title) {
        this.title = title;
    }
    public void getlike(){this.likenum++;}
    public void getcomment(String content) {
        this.comment1.setContent(content);
        commentList.add(comment1);
    }
}
