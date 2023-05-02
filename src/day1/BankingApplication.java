package day1;

public class BankingApplication {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.ssn = "adsfdfad";

        bankAccount.setAccountNumber("1561641564");
        bankAccount.setAccountHolderName("Kritish Bajracharya");
        bankAccount.setAccountBalance(50000000);
        bankAccount.setAccountType(AccountType.SAVING_ACCOUNT);
        bankAccount.setAddressOfAcHolder("Georgia");
        bankAccount.setRoutingNumber("0615404dfd");
        bankAccount.setPhoneNumber("04946126262");
        bankAccount.setUserName("kritish");

        String accountNumber = bankAccount.getAccountNumber();
        String hashSSN = bankAccount.getHashedSsn();
    }
}
