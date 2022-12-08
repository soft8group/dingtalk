package entity;

public class OfficialAccount {
    private String accountName;
    private Integer accountId;

    public Integer getAccountId() {
        System.out.print("AccountId:");
        System.out.println(accountId);
        System.out.println("----------------");
        return accountId;
    }
    public String getAccountName() {
        System.out.print("AccountName:");
        System.out.println(accountName);
        return accountName;
    }
    public String AccountName() {
        return accountName;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }
}
