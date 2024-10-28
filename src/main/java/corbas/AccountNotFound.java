package corbas;


/**
* corba/AccountNotFound.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from idlf.idl
* Monday, October 28, 2024 1:02:00 PM EAT
*/

public final class AccountNotFound extends org.omg.CORBA.UserException
{
  public int accId = (int)0;

  public AccountNotFound ()
  {
    super(AccountNotFoundHelper.id());
  } // ctor

  public AccountNotFound (int _accId)
  {
    super(AccountNotFoundHelper.id());
    accId = _accId;
  } // ctor


  public AccountNotFound (String $reason, int _accId)
  {
    super(AccountNotFoundHelper.id() + "  " + $reason);
    accId = _accId;
  } // ctor

} // class AccountNotFound
