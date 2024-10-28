package service;

import corba.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl {

    private Connection connection;

    public UserDaoImpl(Connection connection) {
        this.connection = connection;
    }

    public void createUser(User user) throws SQLException {
        String sql = "INSERT INTO users (username, password, email, role, firstName, lastName, phoneNumber, address, isActive, createdDate) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, user.username);
            stmt.setString(2, user.password);
            stmt.setString(3, user.email);
            stmt.setString(4, user.role);
            stmt.setString(5, user.firstName);
            stmt.setString(6, user.lastName);
            stmt.setString(7, user.phoneNumber);
            stmt.setString(8, user.address);
            stmt.setBoolean(9, user.isActive);
            stmt.setString(10, user.createdDate);
            stmt.executeUpdate();
        }
    }

    public User getUser(long userId) throws SQLException {
        String sql = "SELECT * FROM users WHERE userId = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, userId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return mapRowToUser(rs);
            } else {
                throw new SQLException("User not found"); // Handle not found
            }
        }
    }

    public List<User> getAllUsers() throws SQLException {
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM users";
        try (PreparedStatement stmt = connection.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                users.add(mapRowToUser(rs));
            }
        }
        return users;
    }

    public List<User> searchUsers(String query) throws SQLException {
        List<User> users = new ArrayList<>();
        String sqlQuery = "SELECT * FROM users WHERE username LIKE ?";
        try (PreparedStatement stmt = connection.prepareStatement(sqlQuery)) {
            stmt.setString(1, "%" + query + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                users.add(mapRowToUser(rs));
            }
        }
        return users;
    }

    public void updateUser(User user) throws SQLException {
        String sql = "UPDATE users SET username = ?, password = ?, email = ?, role = ?, firstName = ?, lastName = ?, phoneNumber = ?, address = ?, isActive = ? WHERE userId = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, user.username);
            stmt.setString(2, user.password);
            stmt.setString(3, user.email);
            stmt.setString(4, user.role);
            stmt.setString(5, user.firstName);
            stmt.setString(6, user.lastName);
            stmt.setString(7, user.phoneNumber);
            stmt.setString(8, user.address);
            stmt.setBoolean(9, user.isActive);
            stmt.setLong(10, user.userId);
            stmt.executeUpdate();
        }
    }

    public void deleteUser(long userId) throws SQLException {
        String sql = "DELETE FROM users WHERE userId = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, userId);
            stmt.executeUpdate();
        }
    }

    private User mapRowToUser(ResultSet rs) throws SQLException {
        User user = new User();
        user.userId = rs.getInt("userId");
        user.username = rs.getString("username");
        user.password = rs.getString("password");
        user.email = rs.getString("email");
        user.role = rs.getString("role");
        user.firstName = rs.getString("firstName");
        user.lastName = rs.getString("lastName");
        user.phoneNumber = rs.getString("phoneNumber");
        user.address = rs.getString("address");
        user.isActive = rs.getBoolean("isActive");
        user.createdDate = rs.getString("createdDate");
        return user;
    }
}
