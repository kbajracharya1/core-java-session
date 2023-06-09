package day2;

import day1.AccountType;

import java.net.PasswordAuthentication;
import java.security.Signature;
import java.util.List;

public class BankAccount {
    String accountNumber; //constant account number which cannot be changed.
    public AccountType accountType;
    double accountBalance;
    String accountHolderName;
    String accountMaturity;
    String routingNumber;
    byte[] signatureOfAccountNo;
    String phoneNumber;
    String address;
    String userName;
    String password;
    double acBalance;
    float transferLimit;
    String photo;
    String email;
    String ssn;
    List statements;
}


/* States
    -> Account Number (String)
    -> Account Type (Account Type) a class which will hold fixed set of object.
    -> Account Holder Name (String)
    -> Account Maturity (String)
    -> Routing Number (String) for reuse
    -> Signature of Account No (Collection of Byte) 1 px = Byte
    -> Phone Number Account Holder (String)
    -> Address of Account Holder (String)
    -> User Name (String)
    -> Password (Collection of chars)
    -> Account Balance (Double)
    -> Transfer Limit (Float)
    -> Photo (String) => Example: D:/Download/kritish.png
    -> Email (String)
    -> Social Security Number (String)
    -> Statements (List of something)

 */

/*
    Behaviours (functionalities) use to update
        -> Login
        -> Check balance
        -> Add funds
        -> Transfer balance
        -> View statement

        Getters & Setters
 */