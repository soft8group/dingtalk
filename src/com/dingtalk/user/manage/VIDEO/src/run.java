import context.OfficialAccountContext;
import context.UserContext;
import entity.*;

public class run {
    public static void main(String[] args) {
        OfficialAccountContext account_tcl = new OfficialAccountContext();
        UserContext user_ccclg = new UserContext();
        Video video_tcl1 =new Video();
        Video video_tcl2 =new Video();
        video_tcl1.setVideoTitle("video111");
        video_tcl2.setVideoTitle("video222");
        account_tcl.setAccountName("TCL");
        account_tcl.setAccountID(111);
        user_ccclg.setUserName("CCCLG");
        user_ccclg.setUserId(666);

        account_tcl.getName();
        account_tcl.getId();
        user_ccclg.getName();
        user_ccclg.getId();


        account_tcl.addVideo(video_tcl1);
        account_tcl.addVideo(video_tcl2);
        account_tcl.showvideo();
        account_tcl.deleteVideo(video_tcl2);
        account_tcl.showvideo();

        user_ccclg.getvideo(video_tcl1);
        user_ccclg.subscribe(account_tcl.getAccount());
        account_tcl.register(user_ccclg.getUser());
        account_tcl.showsubscribers();
        user_ccclg.showsubscribe();

        user_ccclg.unsubscribe(account_tcl.getAccount());
        account_tcl.unregister(user_ccclg.getUser());
        account_tcl.showsubscribers();
        user_ccclg.showsubscribe();

        user_ccclg.postComment("it's great!");
        user_ccclg.postLike();
        user_ccclg.postLike();
        video_tcl1.showComment();
        video_tcl1.showLikenum();
    }
}
