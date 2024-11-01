package corban;


/**
* corban/InsufficientFunds.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from idlnew.idl
* Monday, October 28, 2024 2:54:47 PM EAT
*/

public final class InsufficientFunds extends org.omg.CORBA.UserException
{
  public double currentBalance = (double)0;

  public InsufficientFunds ()
  {
    super(InsufficientFundsHelper.id());
  } // ctor

  public InsufficientFunds (double _currentBalance)
  {
    super(InsufficientFundsHelper.id());
    currentBalance = _currentBalance;
  } // ctor


  public InsufficientFunds (String $reason, double _currentBalance)
  {
    super(InsufficientFundsHelper.id() + "  " + $reason);
    currentBalance = _currentBalance;
  } // ctor

} // class InsufficientFunds
