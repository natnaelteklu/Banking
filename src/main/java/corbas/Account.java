package corbas;

public final class Account implements org.omg.CORBA.portable.IDLEntity
{
  public int accId = (int)0;
  public String holderName = null;
  public String accType = null;
  public String accountNumber = null;
  public double balance = (double)0;
  public String createdDate = null;

  public Account ()
  {
  } // ctor

  public Account (int _accId, String _holderName, String _accType, String _accountNumber, double _balance, String _createdDate)
  {
    accId = _accId;
    holderName = _holderName;
    accType = _accType;
    accountNumber = _accountNumber;
    balance = _balance;
    createdDate = _createdDate;
  } // ctor

} // class Account
