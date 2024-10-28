package corba;

/**
* corba/UserManagementHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from idlf.idl
* Monday, October 28, 2024 1:21:01 PM EAT
*/


// Interface for managing users in the banking system
public final class UserManagementHolder implements org.omg.CORBA.portable.Streamable
{
  public corba.UserManagement value = null;

  public UserManagementHolder ()
  {
  }

  public UserManagementHolder (corba.UserManagement initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = corba.UserManagementHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    corba.UserManagementHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return corba.UserManagementHelper.type ();
  }

}
