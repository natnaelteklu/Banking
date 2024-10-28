package service;

import corba.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountDaoImpl {

    private Connection connection;

    public AccountDaoImpl(Connection connection) {
        this.connection = connection;
    }

    public void createAccount(Account account) throws SQLException {
        String sql = "INSERT INTO accounts (holderName, accType, accountNumber, balance, createdDate) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, account.holderName);
            stmt.setString(2, account.accType);
            stmt.setString(3, account.accountNumber);
            stmt.setDouble(4, account.balance);
            stmt.setString(5, account.createdDate);
            stmt.executeUpdate();
        }
    }

    public Account getAccount(long accId) throws SQLException {
        String sql = "SELECT * FROM accounts WHERE accId = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, accId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return mapRowToAccount(rs);
            } else {
                throw new SQLException("Account not found"); // Handle not found
            }
        }
    }

    public List<Account> getAllAccounts() throws SQLException {
        List<Account> accounts = new ArrayList<>();
        String sql = "SELECT * FROM accounts";
        try (PreparedStatement stmt = connection.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                accounts.add(mapRowToAccount(rs));
            }
        }
        return accounts;
    }

    public List<Account> searchAccounts(String query) throws SQLException {
        List<Account> accounts = new ArrayList<>();
        String sqlQuery = "SELECT * FROM accounts WHERE holderName LIKE ?";
        try (PreparedStatement stmt = connection.prepareStatement(sqlQuery)) {
            stmt.setString(1, "%" + query + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                accounts.add(mapRowToAccount(rs));
            }
        }
        return accounts;
    }

    public void updateAccount(Account account) throws SQLException {
        String sql = "UPDATE accounts SET holderName = ?, accType = ?, accountNumber = ?, balance = ? WHERE accId = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, account.holderName);
            stmt.setString(2, account.accType);
            stmt.setString(3, account.accountNumber);
            stmt.setDouble(4, account.balance);
            stmt.setLong(5, account.accId);
            stmt.executeUpdate();
        }
    }

    public void deleteAccount(long accId) throws SQLException {
        String sql = "DELETE FROM accounts WHERE accId = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, accId);
            stmt.executeUpdate();
        }
    }

    private Account mapRowToAccount(ResultSet rs) throws SQLException {
        Account account = new Account();
        account.accId = rs.getInt("accId");
        account.holderName = rs.getString("holderName");
        account.accType = rs.getString("accType");
        account.accountNumber = rs.getString("accountNumber");
        account.balance = rs.getDouble("balance");
        account.createdDate = rs.getString("createdDate");
        return account;
    }
}
