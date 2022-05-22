package com.techelevator;

public class CheckingAccount extends BankAccount {
//Constructors
    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
        getBalance();
    }
    public CheckingAccount(String accountHolderName, String accountNumber){
        super(accountHolderName, accountNumber);
        getBalance();
    }

    @Override
    public int withdraw(int amountToWithdraw) {
        int overDraftFee = 10;
        if (super.getBalance()-amountToWithdraw <= -100){
            System.out.println("Test1");
            super.getBalance();
        }
        else if((super.getBalance()-amountToWithdraw<0) && (super.getBalance()-amountToWithdraw > -100)){
            System.out.println("Test 2");
                super.withdraw(amountToWithdraw+=overDraftFee);
            }
        else {
            super.withdraw(amountToWithdraw);
            System.out.println("Test 3");
            return super.getBalance();
            }
        return super.getBalance();
    }
}
