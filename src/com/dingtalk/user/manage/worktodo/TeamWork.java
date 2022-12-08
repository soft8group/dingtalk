package com.dingtalk.user.manage.worktodo;

public abstract class TeamWork implements workinterface {
    @Override
    public abstract void setContent(String Content);
    @Override
    public abstract void setName(String name);
    @Override
    public abstract String getName();
    @Override
    public abstract String getContent();
}