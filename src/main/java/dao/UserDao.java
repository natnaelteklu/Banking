
package dao;

import corba.User;
import java.util.List;

public interface UserDao {
     void createUser(User user);
    User getUser(int userId);
    List<User> getAllUsers();
    List<User> searchUsers(String query);
    void updateUser(User user);
    void deleteUser(int userId);
    
}


