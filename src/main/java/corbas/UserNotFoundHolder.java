package corbas;

/**
* corba/UserNotFoundHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from idlf.idl
* Monday, October 28, 2024 1:02:00 PM EAT
*/

public final class UserNotFoundHolder implements org.omg.CORBA.portable.Streamable
{
  public corbas.UserNotFound value = null;

  public UserNotFoundHolder ()
  {
  }

  public UserNotFoundHolder (corbas.UserNotFound initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = corbas.UserNotFoundHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    corbas.UserNotFoundHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return corbas.UserNotFoundHelper.type ();
  }

}
