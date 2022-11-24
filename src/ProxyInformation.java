/*
 * 用户信息管理模块，包括用户查看信息、修改信息等功能
 * 使用代理设计模式，ProxyInformation为代理类
 */

import java.util.ArrayList;

public class ProxyInformation implements InformationManage{
    private User realUser;
    private String userId;


    public ProxyInformation(String userId) {
        this.userId = userId;
    }

    //代理类查看用户信息
    @Override
    public void showInformation() {
        if (realUser == null) {
            realUser = new User(userId);
        }
        realUser.showInformation();
    }

    //代理类设置用户信息
    @Override
    public void setInformation(String[] information) {
        String[] informationOld = realUser.getInformation();
        int changeNum = 0;
        boolean checkLegal = false;

        if (realUser == null) {
            realUser = new User(userId);
        }

        System.out.println("正在检查信息合法性……");

        for(int i = 0; i < information.length; i++) {
            if(information[i] == null || information[i].replace(" ","").equals("")) {
                information[i] = informationOld[i];
            }
            if(!information[i].equals(informationOld[i])) {
                changeNum += 1;
                System.out.printf("change%d: %s  -->  %s%n",changeNum,informationOld[i],information[i]);
            }
        }

        if (checkLegal) {
            System.out.println("变更中存在非法信息，检查不通过！");
        } else {
            realUser.setInformation(information);
            realUser.submitEdit();
            System.out.println("信息更改成功！");
        }
    }
}

class User implements InformationManage{
    private String id;
    private String name;
    private String phone;
    private String dingtalkNumber;
    private String workStatue;
    private String male;
    private String birthday;
    private String address;
    private ArrayList<GroupInformation> group;

    public User(String userId){
        this.id = userId;
        group = new ArrayList<>();

        getInformationFromServer();
    }

    //模拟用户编辑个人信息
    @Override
    public void setInformation(String[] information) {
        this.name = information[0];
        this.phone = information[1];
        this.dingtalkNumber = information[2];
        this.workStatue = information[3];
        this.male = information[4];
        this.birthday = information[5];
        this.address = information[6];
    }

    public void submitEdit() {
        System.out.println("正在向数据库提交更改数据……");
    }


    //模拟从数据库中获取用户信息数据
    private void getInformationFromServer() {
        System.out.printf("正在从服务器获取ID为：%s的用户信息……%n", this.id);
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
    @Override
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

    //个人信息返回函数
    public String[] getInformation() {
        String[] information = new String[7];

        information[0] = this.name;
        information[1] = this.male;
        information[2] = this.birthday;
        information[3] = this.phone;
        information[4] = this.dingtalkNumber;
        information[5] = this.workStatue;
        information[6] = this.address;

        return information;
    }
}


//存储用户所在组织信息
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