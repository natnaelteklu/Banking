package service;

import corba.*;  // Import all generated classes from the corba package
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class AccountManagementImpl extends AccountManagementPOA {
    private AccountDaoImpl accountDAO;

    public AccountManagementImpl(Connection connection) {
        this.accountDAO = new AccountDaoImpl(connection);
    }

    @Override
    public void createAccount(Account account) {
        try {
            accountDAO.createAccount(account);
            System.out.println("Account created: " + account.holderName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Account getAccount(int accId) {
        try {
            return accountDAO.getAccount(accId);
        } catch (SQLException e) {
            e.printStackTrace();
            return null; // Handle exception accordingly
        }
    }

    @Override
    public Account[] getAllAccounts() {
        try {
            List<Account> accountList = accountDAO.getAllAccounts();
            return accountList.toArray(new Account[0]);
        } catch (SQLException e) {
            e.printStackTrace();
            return new Account[0]; // Return empty array on exception
        }
    }

    @Override
    public Account[] searchAccounts(String query) {
        try {
            List<Account> result = accountDAO.searchAccounts(query);
            return result.toArray(new Account[0]);
        } catch (SQLException e) {
            e.printStackTrace();
            return new Account[0]; // Return empty array on exception
        }
    }

    @Override
    public void updateAccount(Account account) {
        try {
            accountDAO.updateAccount(account);
            System.out.println("Account updated: " + account.holderName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteAccount(int accId) {
        try {
            accountDAO.deleteAccount(accId);
            System.out.println("Account deleted with ID: " + accId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
