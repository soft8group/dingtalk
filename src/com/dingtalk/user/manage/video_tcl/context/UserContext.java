package context;

import java.util.ArrayList;
import java.util.List;
import entity.*;

public class UserContext {
    private User user = new User();
    private Video video = new Video();
    private List<String> subscribelist = new ArrayList<>();

    public void setUserName(String username) {
        user.setUserName(username);
    }
    public void setUserId(Integer userid) {
        user.setUserId(userid);
    }
    public User getUser(){return user;}
    public String getName(){return user.getUserName();}
    public Integer getId(){return user.getUserId();}

    public void getvideo(Video video1) { this.video = video1; }

    public void subscribe(OfficialAccount account) {
        subscribelist.add(account.AccountName());
    }

    public void unsubscribe(OfficialAccount account) {
        subscribelist.remove(subscribelist.size()-1);
    }

    public void postComment(String content){this.video.getcomment(content);};

    public void postLike(){this.video.getlike();}

    public void showsubscribe(){
        user.getUserName();
        System.out.println("subscribe account:");
        for(int i=0;i<=subscribelist.size()-1;i++){
            System.out.println(subscribelist.get(i));
        }
        System.out.println("----------------");
    }
}
