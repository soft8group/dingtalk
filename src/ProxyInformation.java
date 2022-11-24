/*
 * 用户信息管理模块，包括用户查看信息、修改信息等功能
 * 使用代理设计模式，ProxyInformation为代理类
 */

import java.util.ArrayList;

public class ProxyInformation {
}

class User {
    private String id;
    public String name;
    public String phone;
    public String dingtalkNumber;
    public String workStatue;
    public String male;
    public String birthday;
    public String address;
    public ArrayList<GroupInformation> group;


    public void User(String userId){
        this.id = userId;
        group = new ArrayList<>();

        getInformation();
    }
    private boolean setInformation() {
        return true;
    }


    //模拟从数据库中获取用户信息数据
    private void getInformation() {
        System.out.printf("正在从服务器获取ID为：%s的用户信息%n", this.id);
        this.name = "小明";
        this.phone = "15387590567";
        this.dingtalkNumber = "HDU_xiaomin";
        this.workStatue = "工作中";
        this.male = "男";
        this.birthday = "2002-12-1";
        this.address = "杭州电子科技大学下沙校区";

        GroupInformation groupFirst = new GroupInformation();
        groupFirst.setGroup("杭州电子科技大学", this.name, this.phone,
                "19062208", "计算机学院（软件学院）");
        group.add(groupFirst);

        System.out.println("用户信息加载成功！");
    }

    //模拟用户查看信息
    public void showInformation() {
        System.out.println("您的个人信息：");
        System.out.println("**************************");
        System.out.printf("姓名：%s%n", this.name);
        System.out.printf("性别：%s%n", this.male);
        System.out.printf("生日：%s%n", this.birthday);
        System.out.printf("手机号码：%s%n", this.phone);
        System.out.printf("钉钉号： %s%n", this.dingtalkNumber);
        System.out.printf("工作状态：%s%n", this.workStatue);
        System.out.printf("地址：%s%n", this.address);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("您的组织信息：");
        System.out.println("**************************");
        for(int i=0; i<group.size(); i++) {
            System.out.printf("组织名称：%s%n", this.group.get(i).corporationName);
            System.out.printf("姓名：%s%n", this.group.get(i).workName);
            System.out.printf("电话：%s%n", this.group.get(i).workPhone);
            System.out.printf("部门：%s%n", this.group.get(i).department);
            System.out.printf("工号： %s%n", this.group.get(i).workNumber);
        }
    }
}

class GroupInformation {
    public String corporationName;
    public String workName;
    public String workPhone;
    public String workNumber;
    public String department;

    public void setGroup(String corporationName, String workName, String workPhone,
                         String workNumber, String department){
        this.corporationName = corporationName;
        this.workName = workName;
        this.workPhone = workPhone;
        this.workNumber = workNumber;
        this.department = department;
    }
}