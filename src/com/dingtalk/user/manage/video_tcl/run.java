import context.*;
import entity.*;
import java.util.Scanner;
public class run {
    public static void main(String[] args) {
        UserContext user_ccclg = new UserContext();
        OfficialAccountContext account_tcl = new OfficialAccountContext();
        Video video = new Video();
        int ID = 0;
        Scanner input = new Scanner(System.in);
        loop0:
        while (true){
        System.out.println("      1.视频号操作       ");
        System.out.println("      2.用户操作       ");
        System.out.println("      3.查看视频信息     ");
        System.out.println("请选择操作：");
        String str = input.nextLine();
        switch (str) {
            case "1":
                System.out.println("请输入视频号名：");
                String name1 = input.nextLine();
                account_tcl.setAccountName(name1);
                account_tcl.setAccountID(ID);
                ID++;
                loop1:
                while (true) {
                    System.out.println("      1.查看视频号名和ID ");
                    System.out.println("      2.发布视频   ");
                    System.out.println("      3.删除视频   ");
                    System.out.println("      4.查看订阅用户   ");
                    System.out.println("      5.进入用户操作   ");
                    System.out.println("请选择操作：");
                    String str1 = input.nextLine();
                    switch (str1){
                        case "1":
                            account_tcl.getName();
                            account_tcl.getId();
                            break;
                        case "2":
                            System.out.println("      输入视频名：   ");
                            String str_video = input.nextLine();
                            video.setVideoTitle(str_video);
                            account_tcl.addVideo(video);
                            break;
                        case "3":
                            account_tcl.deleteVideo(video);
                            break;
                        case "4":
                            account_tcl.showsubscribers();
                            break ;
                        case "5":
                            break loop1;
                    }
                }

            case "2":
                System.out.println("请输入用户名：");
                String name2 = input.nextLine();
                user_ccclg.setUserName(name2);
                user_ccclg.setUserId(ID);
                user_ccclg.getvideo(video);
                ID++;
                loop2:
                while (true) {
                    System.out.println("      1.查看用户名和ID ");
                    System.out.println("      2.点赞视频   ");
                    System.out.println("      3.评论视频   ");
                    System.out.println("      4.订阅/取消订阅视频号  ");
                    System.out.println("      5.查看订阅视频号   ");
                    System.out.println("      6.查看视频信息   ");
                    System.out.println("请选择操作：");
                    String str2 = input.nextLine();
                    switch (str2){
                        case "1":
                            user_ccclg.getName();
                            user_ccclg.getId();
                            break;
                        case "2":
                            user_ccclg.postLike();
                            System.out.println("      点赞成功   ");
                            break;
                        case "3":
                            System.out.println("      输入评论内容：   ");
                            String str_comment = input.nextLine();
                            user_ccclg.postComment(str_comment);
                            break;
                        case "4":
                            System.out.println("      订阅/取消订阅（Y/N）   ");
                            String str3 = input.nextLine();
                            switch (str3){
                                case "Y":
                                    user_ccclg.subscribe(account_tcl.getAccount());
                                    account_tcl.register(user_ccclg.getUser());
                                    System.out.println("      订阅成功   ");
                                    break ;
                                case"N":
                                    user_ccclg.unsubscribe(account_tcl.getAccount());
                                    account_tcl.unregister(user_ccclg.getUser());
                                    System.out.println("      取消订阅成功   ");
                                    break ;
                            }
                            break ;
                        case "5":
                            user_ccclg.showsubscribe();
                            break;
                        case "6":
                            break loop2;
                    }
                }
            case "3":
                loop3:
                while (true) {
                    System.out.println("      1.查看视频列表       ");
                    System.out.println("      2.查看评论       ");
                    System.out.println("      3.查看点赞数     ");
                    System.out.println("      4.返回主菜单   ");
                    System.out.println("请选择操作：");
                    String str4 = input.nextLine();
                    switch (str4) {
                        case "1":
                            account_tcl.showvideo();
                            break;
                        case "2":
                            video.showComment();
                            break;
                        case "3":
                            video.showLikenum();
                            break;
                        case "4":
                            break loop3;
                    }
                }
        }
    }
    }
}
