package corban;


/**
* corban/AccountListHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from idlnew.idl
* Monday, October 28, 2024 2:54:47 PM EAT
*/

public final class AccountListHolder implements org.omg.CORBA.portable.Streamable
{
  public corban.Account value[] = null;

  public AccountListHolder ()
  {
  }

  public AccountListHolder (corban.Account[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = corban.AccountListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    corban.AccountListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return corban.AccountListHelper.type ();
  }

}