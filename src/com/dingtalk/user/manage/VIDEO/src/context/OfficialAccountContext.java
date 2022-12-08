package context;

import java.util.ArrayList;
import java.util.List;
import entity.*;


public class OfficialAccountContext {
    private OfficialAccount account = new OfficialAccount();
    private List<String> subscribers = new ArrayList<>();
    private List<String> videolist = new ArrayList<>();

    public void setAccountName(String accountName) {account.setAccountName(accountName);}

    public void setAccountID(Integer accountID) {account.setAccountId(accountID);}

    public OfficialAccount getAccount() {
        return account;
    }
    public String getName(){return account.getAccountName();}
    public Integer getId(){return account.getAccountId();}

    public void addVideo(Video video) {videolist.add(video.VideoTitle());}

    public void deleteVideo(Video video) {videolist.remove(videolist.size()-1);}

    public void register(User user) {
        subscribers.add(user.UserName());
    }

    public void unregister(User user) {
        subscribers.remove(subscribers.size()-1);
    }

    public void showsubscribers(){
        account.getAccountName();
        System.out.println("subscribers:");
        for(int i=0;i<=subscribers.size()-1;i++){
            System.out.println(subscribers.get(i));
        }
        System.out.println("----------------");
    }

    public void showvideo(){
        account.getAccountName();
        System.out.println("Video:");
        for(int i=0;i<=videolist.size()-1;i++){
            System.out.println(videolist.get(i));
        }
        System.out.println("----------------");
    }
}
