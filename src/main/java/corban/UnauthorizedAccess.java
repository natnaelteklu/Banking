package corban;


/**
* corban/UnauthorizedAccess.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from idlnew.idl
* Monday, October 28, 2024 2:54:47 PM EAT
*/

public final class UnauthorizedAccess extends org.omg.CORBA.UserException
{
  public String message = null;

  public UnauthorizedAccess ()
  {
    super(UnauthorizedAccessHelper.id());
  } // ctor

  public UnauthorizedAccess (String _message)
  {
    super(UnauthorizedAccessHelper.id());
    message = _message;
  } // ctor


  public UnauthorizedAccess (String $reason, String _message)
  {
    super(UnauthorizedAccessHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class UnauthorizedAccess
