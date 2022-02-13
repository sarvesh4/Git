public class Account {

    private final String accountName;
    private final int types;
    private final AccountVersion accountVersions;

    public Account(String accountName, int types, AccountVersion accountVersions) {
        this.accountName = accountName;
        this.types = types;
        this.accountVersions = accountVersions;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getTypes() {
        return types;
    }

    public AccountVersion getAccountVersions() {
        return accountVersions;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + accountName + '\'' +
                ", type=" + types +
                ", version=" + accountVersions +
                '}';
    }
}
