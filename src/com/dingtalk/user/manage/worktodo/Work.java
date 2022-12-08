
package com.dingtalk.user.manage.worktodo;

public class Work extends SelfWork {
    String name;
    String content;
    public void setName(String name) {
        this.name = name;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public String getContent(){
        return content;
    }
}