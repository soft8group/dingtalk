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

class Corporation {
}
