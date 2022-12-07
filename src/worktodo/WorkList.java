package worktodo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkList {
    private static List<Work> works = new ArrayList<Work>();
    public void initwork(){
        Work work1 = new Work();
        work1.setName("250");
        work1.setContent("pigpigpigpig");
        Work work2 = new Work();
        work2.setName("052");
        work2.setContent("gipgipgipgip");
        works.add(work1);
        works.add(work2);
    }
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

    public void deleteWorks()  {
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