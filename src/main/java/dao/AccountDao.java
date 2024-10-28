
package dao;

import corba.Account;
import java.util.List;

public interface AccountDao {
    void depositToAccount(int accNumber, long ammount);
    void createAccount(Account account);
    Account getAccount(int accId);
    List<Account> getAllAccounts();
    List<Account> searchAccounts(String query);
    void updateAccount(Account account);
    void deleteAccount(int accId);
    
}
