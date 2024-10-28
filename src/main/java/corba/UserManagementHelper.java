package corba;


/**
* corba/UserManagementHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from idlf.idl
* Monday, October 28, 2024 1:21:01 PM EAT
*/


// Interface for managing users in the banking system
abstract public class UserManagementHelper
{
  private static String  _id = "IDL:corba/UserManagement:1.0";

  public static void insert (org.omg.CORBA.Any a, corba.UserManagement that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static corba.UserManagement extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (corba.UserManagementHelper.id (), "UserManagement");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static corba.UserManagement read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_UserManagementStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, corba.UserManagement value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static corba.UserManagement narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof corba.UserManagement)
      return (corba.UserManagement)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      corba._UserManagementStub stub = new corba._UserManagementStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static corba.UserManagement unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof corba.UserManagement)
      return (corba.UserManagement)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      corba._UserManagementStub stub = new corba._UserManagementStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
