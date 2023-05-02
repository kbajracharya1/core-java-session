package day1;

import java.net.PasswordAuthentication;
import java.security.Signature;
import java.util.List;

public class BankAccount {
    private String accountNumber = "123456789"; //constant account number which cannot be changed.
    private AccountType accountType;
    private double accountBalance;
    public String accountHolderName;
    private String accountMaturity;
    private String routingNumber;
    private Signature signatureOfAccountNo;
    private String phoneNumber;
    private String addressOfAcHolder;
    private String userName;
    private PasswordAuthentication password;
    private double acBalance;
    private float transferLimit;
    private String photo;
    private String email;
    public String ssn;
    private String hashedSsn;
    private List statements;

    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(String accNumber){
        accountNumber = accNumber;
    }

    public void setSSN(String socialNumber){//can also put the encryption(socialNumber) => adfafd function.
        ssn = socialNumber;
    }
    public String getHashedSsn(){//#####4532
        return hashedSsn;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public void setAccountBalance(double accBalance){
        accountBalance = accBalance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddressOfAcHolder() {
        return addressOfAcHolder;
    }

    public void setAddressOfAcHolder(String addressOfAcHolder) {
        this.addressOfAcHolder = addressOfAcHolder;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getAcBalance() {
        return acBalance;
    }

    public void setAcBalance(double acBalance) {
        this.acBalance = acBalance;
    }

    //Abstraction - Hiding lower level details
    public boolean transferBalance(BankAccount fromAccount, BankAccount toAccount, double amount){
        //Code to transfer the balance
        return true;
    }

    public void getInstance(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.ssn = "asdfsd";
    }




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