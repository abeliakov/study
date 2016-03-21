package pojo;

import java.math.BigInteger;
import java.util.HashMap;

public abstract class Client {

    private String personalInfo;
    private HashMap<BigInteger, Account> accounts;

    public Client(String personalInfo) {
        this.personalInfo = personalInfo;
    }

    public Client(String personalInfo, Account... accounts) {
        this.personalInfo = personalInfo;
        this.accounts = new HashMap<BigInteger, Account>();
        for (Account account : accounts) {
            this.accounts.put(account.getAccountId(), account);
        }
    }

    public void addAccount(Account account) {
        accounts.put(account.getAccountId(), account);
    }
}
