package corban;

/**
* corban/UnauthorizedAccessHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from idlnew.idl
* Monday, October 28, 2024 2:54:47 PM EAT
*/

public final class UnauthorizedAccessHolder implements org.omg.CORBA.portable.Streamable
{
  public corban.UnauthorizedAccess value = null;

  public UnauthorizedAccessHolder ()
  {
  }

  public UnauthorizedAccessHolder (corban.UnauthorizedAccess initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = corban.UnauthorizedAccessHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    corban.UnauthorizedAccessHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return corban.UnauthorizedAccessHelper.type ();
  }

}
