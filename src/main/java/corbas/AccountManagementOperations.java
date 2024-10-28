package corbas;


/**
* corba/AccountManagementOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from idlf.idl
* Monday, October 28, 2024 1:02:00 PM EAT
*/


// Interface for Account Management
public interface AccountManagementOperations 
{
  void createAccount (corbas.Account account);
  corbas.Account getAccount (int accId) throws corbas.AccountNotFound;
  corbas.Account[] getAllAccounts ();
  corbas.Account[] searchAccounts (String query);
  void updateAccount (corbas.Account account) throws corbas.AccountNotFound;
  void deleteAccount (int accId) throws corbas.AccountNotFound;

  // New functionalities for banking
  double deposit (int accId, double amount) throws corbas.AccountNotFound;
  double withdraw (int accId, double amount) throws corbas.AccountNotFound, corbas.InsufficientFunds;
  double checkBalance (int accId) throws corbas.AccountNotFound;
  corbas.Transaction[] getAccountTransactions (int accId) throws corbas.AccountNotFound;

  // Fund transfer between accounts
  void transferFunds (int fromAccId, int toAccId, double amount) throws corbas.AccountNotFound, corbas.InsufficientFunds;
} // interface AccountManagementOperations
