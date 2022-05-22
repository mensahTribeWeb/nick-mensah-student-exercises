package com.techelevator;

public class SavingsAccount extends BankAccount {

    //Constructors
    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }
    @Override
    public int withdraw(int amountToWithdraw){
        int serviceFee = 2;
        if (super.getBalance()-amountToWithdraw >= serviceFee){
            super.withdraw(amountToWithdraw);
            if(super.getBalance() < 150 ){
                super.withdraw(serviceFee);
            }
        }

        return super.getBalance();
    }
}
