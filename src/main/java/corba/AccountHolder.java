package corba;

/**
* corba/AccountHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from idlf.idl
* Monday, October 28, 2024 1:21:01 PM EAT
*/

public final class AccountHolder implements org.omg.CORBA.portable.Streamable
{
  public corba.Account value = null;

  public AccountHolder ()
  {
  }

  public AccountHolder (corba.Account initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = corba.AccountHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    corba.AccountHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return corba.AccountHelper.type ();
  }

}