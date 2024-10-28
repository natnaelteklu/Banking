package corban;


/**
* corban/UserManagementOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from idlnew.idl
* Monday, October 28, 2024 2:54:47 PM EAT
*/


// Interface for User Management
public interface UserManagementOperations 
{
  void createUser (corban.User user);
  corban.User getUser (int userId) throws corban.UserNotFound;
  corban.User[] getAllUsers ();
  corban.User[] searchUsers (String query);
  void updateUser (corban.User user) throws corban.UserNotFound;
  void deleteUser (int userId) throws corban.UserNotFound;
  void activateUser (int userId) throws corban.UserNotFound;
  void deactivateUser (int userId) throws corban.UserNotFound;
} // interface UserManagementOperations
