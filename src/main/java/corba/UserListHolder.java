package corba;


/**
* corba/UserListHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from idlf.idl
* Monday, October 28, 2024 1:21:01 PM EAT
*/


// Define sequence types for lists of Users and Accounts
public final class UserListHolder implements org.omg.CORBA.portable.Streamable
{
  public corba.User value[] = null;

  public UserListHolder ()
  {
  }

  public UserListHolder (corba.User[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = corba.UserListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    corba.UserListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return corba.UserListHelper.type ();
  }

}
