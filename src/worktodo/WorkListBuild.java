package worktodo;
import java.util.Scanner;
public class WorkListBuild {
    public static void main(String[] args)  {
        WorkList workList = new WorkList();
        workList.initwork();
        Scanner input = new Scanner(System.in);
        loop:while( true ) {
            System.out.println("------待办工作界面------");
            System.out.println("|     1.查询工作      |");
            System.out.println("|     2.添加工作      |");
            System.out.println("|     3.删除工作      |");
            System.out.println("|     4.退   出      |");
            System.out.println("------输入您的选项------");
            String str1 = input.nextLine();
            switch (str1) {
                case "1":
                    workList.showWorks();
                    break;
                case "2":
                    workList.addWork();
                    break;
                case "3":
                    workList.deleteWorks();
                    break;
                case "4":
                    System.out.println("你可好歹走了");
                    break loop;
                default:
                    System.out.println("输入错误");
                    break;
            }
        }
    }
}