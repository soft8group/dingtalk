package com.dingtalk.user.manage;

public class ProxyMember implements MemberManage {
    private Administrator realAdministrator;
    private static String administratorId;

    private Corporation controllingCorporation;
    private static String corporationId;

    private static class ProxyMemberHolder {
        private static ProxyMember instance = new ProxyMember();
    }

    private ProxyMember() {}

    /**
     * 用于返回唯一可用的实例
     * @param administratorId 接收代理连接的管理员编号
     * @param corporationId 接收管理员想要进行操作的组织编号
     * @return 校验管理员资格，若无资格便返回 null
     */
    public static ProxyMember getInstance (String administratorId, String corporationId) {
        ProxyMember.administratorId = administratorId;
        ProxyMember.corporationId = corporationId;

        if (Corporation.isManager(administratorId)) {
            System.out.println("管理员身份验证成功！");
            return ProxyMemberHolder.instance;
        } else {
            System.out.println("您不具备该组织的管理员资格！");
            return null;
        }
    }

    /**
     * 模拟代理类添加用户进组织
     * @param useId 用于接收需要添加进组织用户的编号
     */
    @Override
    public void addMember(String useId) {}

    /**
     * 模拟代理类将用户移除出组织
     * @param userId 用于接收需要移除出组织用户的编号
     */
    @Override
    public void removeMember(String userId) {}


}

class Administrator extends User implements MemberManage {
    private Administrator(String adminId) {
        super(adminId);
    }

    @Override
    public void addMember(String userId) {}

    @Override
    public void removeMember(String userId) {}

    //模拟向服务器传输修改结果
    public void submitEdit() {
        System.out.println("正在向数据库提交更改数据……");
    }
}

class  Corporation {
    private String corporationId;
    private String corporationName;
    private static String[] manager = {"adc1","abc2"};
    private static String[] member = {"adc1","abc2","abc3","abc4"};

    /**
     * Corporation类构造函数，模拟从服务器获取组织相关信息
     * @param corporationId 接受指定组织的编号
     */
    public Corporation(String corporationId) {
        this.corporationId = corporationId;
        System.out.printf("正在从服务器获取ID为：%s的组织信息……%n", this.corporationId);
    }

    //检查是否为某公司管理员
    public static boolean isManager(String memberId) {
        for (String i : manager) {
            if (i.equals(memberId)) {
                return true;
            }
        }

        return false;
    }
}
