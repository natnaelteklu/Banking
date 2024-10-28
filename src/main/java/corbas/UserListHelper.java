package corbas;


/**
* corba/UserListHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from idlf.idl
* Monday, October 28, 2024 1:02:00 PM EAT
*/

abstract public class UserListHelper
{
  private static String  _id = "IDL:corba/UserList:1.0";

  public static void insert (org.omg.CORBA.Any a, corbas.User[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static corbas.User[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = corbas.UserHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (corbas.UserListHelper.id (), "UserList", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static corbas.User[] read (org.omg.CORBA.portable.InputStream istream)
  {
    corbas.User value[] = null;
    int _len0 = istream.read_long ();
    value = new corbas.User[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = corbas.UserHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, corbas.User[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      corbas.UserHelper.write (ostream, value[_i0]);
  }

}
