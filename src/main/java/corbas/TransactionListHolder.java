package corbas;


/**
* corba/TransactionListHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from idlf.idl
* Monday, October 28, 2024 1:02:00 PM EAT
*/

public final class TransactionListHolder implements org.omg.CORBA.portable.Streamable
{
  public corbas.Transaction value[] = null;

  public TransactionListHolder ()
  {
  }

  public TransactionListHolder (corbas.Transaction[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = corbas.TransactionListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    corbas.TransactionListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return corbas.TransactionListHelper.type ();
  }

}
