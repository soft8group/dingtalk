package entity;

import context.OfficialAccountContext;

public class OfficialAccount {
    private String accountName;
    private Integer accountId;
    private OfficialAccountContext context;

    public Integer getAccountId() {
        return accountId;
    }
    public String getAccountName() {
        return accountName;
    }
    public OfficialAccountContext getContext() {
        return context;
    }
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
