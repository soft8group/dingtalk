package com.dingtalk.user.manage;

public class ProxyMember {
}

class Administrator extends User implements MemberManage {
    private Administrator(String adminId) {
        super(adminId);
    }

    @Override
    public void addMember() {}

    @Override
    public void removeMember() {}
}

class  Corporation {
    private String corporationId;
    private String corporationName;
    private static String[] manager = {"adc1","abc2"};
    private static String[] member = {"adc1","abc2","abc3","abc4"};

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
