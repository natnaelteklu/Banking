package corbas;


/**
* corba/UserManagementPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from idlf.idl
* Monday, October 28, 2024 1:02:00 PM EAT
*/


// Interface for User Management
public abstract class UserManagementPOA extends org.omg.PortableServer.Servant
 implements corbas.UserManagementOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("createUser", new java.lang.Integer (0));
    _methods.put ("getUser", new java.lang.Integer (1));
    _methods.put ("getAllUsers", new java.lang.Integer (2));
    _methods.put ("searchUsers", new java.lang.Integer (3));
    _methods.put ("updateUser", new java.lang.Integer (4));
    _methods.put ("deleteUser", new java.lang.Integer (5));
    _methods.put ("activateUser", new java.lang.Integer (6));
    _methods.put ("deactivateUser", new java.lang.Integer (7));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // corba/UserManagement/createUser
       {
         corbas.User user = corbas.UserHelper.read (in);
         this.createUser (user);
         out = $rh.createReply();
         break;
       }

       case 1:  // corba/UserManagement/getUser
       {
         try {
           int userId = in.read_long ();
           corbas.User $result = null;
           $result = this.getUser (userId);
           out = $rh.createReply();
           corbas.UserHelper.write (out, $result);
         } catch (corbas.UserNotFound $ex) {
           out = $rh.createExceptionReply ();
           corbas.UserNotFoundHelper.write (out, $ex);
         }
         break;
       }

       case 2:  // corba/UserManagement/getAllUsers
       {
         corbas.User $result[] = null;
         $result = this.getAllUsers ();
         out = $rh.createReply();
         corbas.UserListHelper.write (out, $result);
         break;
       }

       case 3:  // corba/UserManagement/searchUsers
       {
         String query = in.read_string ();
         corbas.User $result[] = null;
         $result = this.searchUsers (query);
         out = $rh.createReply();
         corbas.UserListHelper.write (out, $result);
         break;
       }

       case 4:  // corba/UserManagement/updateUser
       {
         try {
           corbas.User user = corbas.UserHelper.read (in);
           this.updateUser (user);
           out = $rh.createReply();
         } catch (corbas.UserNotFound $ex) {
           out = $rh.createExceptionReply ();
           corbas.UserNotFoundHelper.write (out, $ex);
         }
         break;
       }

       case 5:  // corba/UserManagement/deleteUser
       {
         try {
           int userId = in.read_long ();
           this.deleteUser (userId);
           out = $rh.createReply();
         } catch (corbas.UserNotFound $ex) {
           out = $rh.createExceptionReply ();
           corbas.UserNotFoundHelper.write (out, $ex);
         }
         break;
       }

       case 6:  // corba/UserManagement/activateUser
       {
         try {
           int userId = in.read_long ();
           this.activateUser (userId);
           out = $rh.createReply();
         } catch (corbas.UserNotFound $ex) {
           out = $rh.createExceptionReply ();
           corbas.UserNotFoundHelper.write (out, $ex);
         }
         break;
       }

       case 7:  // corba/UserManagement/deactivateUser
       {
         try {
           int userId = in.read_long ();
           this.deactivateUser (userId);
           out = $rh.createReply();
         } catch (corbas.UserNotFound $ex) {
           out = $rh.createExceptionReply ();
           corbas.UserNotFoundHelper.write (out, $ex);
         }
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:corba/UserManagement:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public UserManagement _this() 
  {
    return UserManagementHelper.narrow(
    super._this_object());
  }

  public UserManagement _this(org.omg.CORBA.ORB orb) 
  {
    return UserManagementHelper.narrow(
    super._this_object(orb));
  }


} // class UserManagementPOA
