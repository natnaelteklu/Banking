package corbas;


/**
* corba/User.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from idlf.idl
* Monday, October 28, 2024 1:02:00 PM EAT
*/

public final class User implements org.omg.CORBA.portable.IDLEntity
{
  public int userId = (int)0;
  public String username = null;
  public String password = null;
  public String email = null;
  public String role = null;
  public String firstName = null;
  public String lastName = null;
  public String phoneNumber = null;
  public String address = null;
  public boolean isActive = false;
  public String createdDate = null;

  public User ()
  {
  } // ctor

  public User (int _userId, String _username, String _password, String _email, String _role, String _firstName, String _lastName, String _phoneNumber, String _address, boolean _isActive, String _createdDate)
  {
    userId = _userId;
    username = _username;
    password = _password;
    email = _email;
    role = _role;
    firstName = _firstName;
    lastName = _lastName;
    phoneNumber = _phoneNumber;
    address = _address;
    isActive = _isActive;
    createdDate = _createdDate;
  } // ctor

} // class User