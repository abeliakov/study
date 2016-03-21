package pojo;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.TreeMap;

public class DataBase {

    private static TreeMap<BigDecimal, Account> accounts;
    private static LinkedList<BigDecimal> removedAccountIds;

    public BigDecimal getFreeAccountId() {
        if (accounts == null || accounts.isEmpty()) {
            return new BigDecimal(1);
        } else {
            if (removedAccountIds == null || removedAccountIds.isEmpty()) {
                return accounts.lastKey().add(new BigDecimal(1));
            } else {
                BigDecimal freeId = removedAccountIds.getFirst();
                removedAccountIds.remove(removedAccountIds.getFirst());
                return freeId;
            }
        }
    }

    public void putAccountInDataBase(Account account) {
        if (accounts == null) {
            accounts = new TreeMap<BigDecimal, Account>();
        }
        accounts.put(account.getAccountId(),account);
    }

    public void removeAccount(Account account){
        accounts.remove(account.getAccountId());
        if (removedAccountIds == null) {
            removedAccountIds = new LinkedList<BigDecimal>();
        }
        removedAccountIds.add(account.getAccountId());
    }
}
