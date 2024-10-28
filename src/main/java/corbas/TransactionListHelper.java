package corbas;


/**
* corba/TransactionListHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from idlf.idl
* Monday, October 28, 2024 1:02:00 PM EAT
*/

abstract public class TransactionListHelper
{
  private static String  _id = "IDL:corba/TransactionList:1.0";

  public static void insert (org.omg.CORBA.Any a, corbas.Transaction[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static corbas.Transaction[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = corbas.TransactionHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (corbas.TransactionListHelper.id (), "TransactionList", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static corbas.Transaction[] read (org.omg.CORBA.portable.InputStream istream)
  {
    corbas.Transaction value[] = null;
    int _len0 = istream.read_long ();
    value = new corbas.Transaction[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = corbas.TransactionHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, corbas.Transaction[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      corbas.TransactionHelper.write (ostream, value[_i0]);
  }

}