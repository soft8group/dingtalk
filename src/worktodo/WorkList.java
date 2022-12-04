package worktodo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkList {
    private List<Work> works = new ArrayList<Work>();

    public void addWork() {
        Work work = new Work();
        System.out.println("请输入工作名字：");
        Scanner input = new Scanner(System.in);
        if (input.hasNextLine()) {
            String str1 = input.nextLine();
            work.setName(str1);
        }
        System.out.println("请输入工作内容：");
        if (input.hasNextLine()) {
            String str1 = input.nextLine();
            work.setContent(str1);
        }
        works.add(work);
        System.out.println("工作添加成功");
    }

    public void showWorks() {
        for (Work work : works) {
            System.out.println("Work : " + work.getName());
            System.out.println("Work Content : " + work.getContent());
        }
    }

    public void deleteWorks() {
        System.out.println("请输入要删除的工作：");
        Scanner input = new Scanner(System.in);
        if (input.hasNextLine()) {
            String str1 = input.nextLine();
            for (Work work : works) {
                String str2 = work.getName();
                if (str1.equals(str2)) {
                    boolean site = works.remove(work);
                }
            }
        }
    }
}