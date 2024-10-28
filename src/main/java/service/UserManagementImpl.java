package service;

import corba.*;  // Import all generated classes from the corba package
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class UserManagementImpl extends UserManagementPOA {
    private UserDaoImpl userDAO;

    public UserManagementImpl(Connection connection) {
        this.userDAO = new UserDaoImpl(connection);
    }

    @Override
    public void createUser(User user) {
        try {
            userDAO.createUser(user);
            System.out.println("User created: " + user.username);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User getUser(int userId) {
        try {
            return userDAO.getUser(userId);
        } catch (SQLException e) {
            e.printStackTrace();
            return null; // Handle exception accordingly
        }
    }

    @Override
    public User[] getAllUsers() {
        try {
            List<User> userList = userDAO.getAllUsers();
            return userList.toArray(new User[0]);
        } catch (SQLException e) {
            e.printStackTrace();
            return new User[0]; // Return empty array on exception
        }
    }

    @Override
    public User[] searchUsers(String query) {
        try {
            List<User> result = userDAO.searchUsers(query);
            return result.toArray(new User[0]);
        } catch (SQLException e) {
            e.printStackTrace();
            return new User[0]; // Return empty array on exception
        }
    }

    @Override
    public void updateUser(User user) {
        try {
            userDAO.updateUser(user);
            System.out.println("User updated: " + user.username);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteUser(int userId) {
        try {
            userDAO.deleteUser(userId);
            System.out.println("User deleted with ID: " + userId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deactivateUser(int userId) {
        User user = getUser(userId);
        if (user != null) {
            user.isActive = false;
            updateUser(user);
            System.out.println("User deactivated: " + user.username);
        } else {
            System.out.println("User not found with ID: " + userId);
        }
    }
}
