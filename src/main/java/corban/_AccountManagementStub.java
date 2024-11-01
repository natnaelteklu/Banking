package corban;


/**
* corban/_AccountManagementStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from idlnew.idl
* Monday, October 28, 2024 2:54:47 PM EAT
*/


// Interface for Account Management
public class _AccountManagementStub extends org.omg.CORBA.portable.ObjectImpl implements corban.AccountManagement
{

  public void createAccount (corban.Account account)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("createAccount", true);
                corban.AccountHelper.write ($out, account);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                createAccount (account        );
            } finally {
                _releaseReply ($in);
            }
  } // createAccount

  public corban.Account getAccount (int accId) throws corban.AccountNotFound
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getAccount", true);
                $out.write_long (accId);
                $in = _invoke ($out);
                corban.Account $result = corban.AccountHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:corban/AccountNotFound:1.0"))
                    throw corban.AccountNotFoundHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getAccount (accId        );
            } finally {
                _releaseReply ($in);
            }
  } // getAccount

  public corban.Account[] getAllAccounts ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getAllAccounts", true);
                $in = _invoke ($out);
                corban.Account $result[] = corban.AccountListHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getAllAccounts (        );
            } finally {
                _releaseReply ($in);
            }
  } // getAllAccounts

  public corban.Account[] searchAccounts (String query)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("searchAccounts", true);
                $out.write_string (query);
                $in = _invoke ($out);
                corban.Account $result[] = corban.AccountListHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return searchAccounts (query        );
            } finally {
                _releaseReply ($in);
            }
  } // searchAccounts

  public void updateAccount (corban.Account account) throws corban.AccountNotFound
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("updateAccount", true);
                corban.AccountHelper.write ($out, account);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:corban/AccountNotFound:1.0"))
                    throw corban.AccountNotFoundHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                updateAccount (account        );
            } finally {
                _releaseReply ($in);
            }
  } // updateAccount

  public void deleteAccount (int accId) throws corban.AccountNotFound
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("deleteAccount", true);
                $out.write_long (accId);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:corban/AccountNotFound:1.0"))
                    throw corban.AccountNotFoundHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                deleteAccount (accId        );
            } finally {
                _releaseReply ($in);
            }
  } // deleteAccount


  // New functionalities for banking
  public double deposit (int accId, double amount) throws corban.AccountNotFound
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("deposit", true);
                $out.write_long (accId);
                $out.write_double (amount);
                $in = _invoke ($out);
                double $result = $in.read_double ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:corban/AccountNotFound:1.0"))
                    throw corban.AccountNotFoundHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return deposit (accId, amount        );
            } finally {
                _releaseReply ($in);
            }
  } // deposit

  public double withdraw (int accId, double amount) throws corban.AccountNotFound, corban.InsufficientFunds
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("withdraw", true);
                $out.write_long (accId);
                $out.write_double (amount);
                $in = _invoke ($out);
                double $result = $in.read_double ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:corban/AccountNotFound:1.0"))
                    throw corban.AccountNotFoundHelper.read ($in);
                else if (_id.equals ("IDL:corban/InsufficientFunds:1.0"))
                    throw corban.InsufficientFundsHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return withdraw (accId, amount        );
            } finally {
                _releaseReply ($in);
            }
  } // withdraw

  public double checkBalance (int accId) throws corban.AccountNotFound
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("checkBalance", true);
                $out.write_long (accId);
                $in = _invoke ($out);
                double $result = $in.read_double ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:corban/AccountNotFound:1.0"))
                    throw corban.AccountNotFoundHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return checkBalance (accId        );
            } finally {
                _releaseReply ($in);
            }
  } // checkBalance

  public corban.Transaction[] getAccountTransactions (int accId) throws corban.AccountNotFound
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getAccountTransactions", true);
                $out.write_long (accId);
                $in = _invoke ($out);
                corban.Transaction $result[] = corban.TransactionListHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:corban/AccountNotFound:1.0"))
                    throw corban.AccountNotFoundHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getAccountTransactions (accId        );
            } finally {
                _releaseReply ($in);
            }
  } // getAccountTransactions


  // Fund transfer between accounts
  public void transferFunds (int fromAccId, int toAccId, double amount) throws corban.AccountNotFound, corban.InsufficientFunds
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("transferFunds", true);
                $out.write_long (fromAccId);
                $out.write_long (toAccId);
                $out.write_double (amount);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:corban/AccountNotFound:1.0"))
                    throw corban.AccountNotFoundHelper.read ($in);
                else if (_id.equals ("IDL:corban/InsufficientFunds:1.0"))
                    throw corban.InsufficientFundsHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                transferFunds (fromAccId, toAccId, amount        );
            } finally {
                _releaseReply ($in);
            }
  } // transferFunds

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:corban/AccountManagement:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _AccountManagementStub
