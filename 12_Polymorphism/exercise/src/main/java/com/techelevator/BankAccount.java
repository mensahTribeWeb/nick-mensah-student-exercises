package com.techelevator;

public class BankAccount implements Accountable{
//Properties
    private String accountHolderName;
    private String accountNumber;
    private int balance;
//Constructors
    public BankAccount(String accountHolder, String accountNumber) {
        this.accountHolderName = accountHolder;
        this.accountNumber = accountNumber;
        this.balance=0;
    }

    public BankAccount(String accountHolder, String accountNumber, int balance) {
        this.accountHolderName = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
//Getters
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }
//Methods
    public int deposit(int amountToDeposit) {
        balance = balance + amountToDeposit;
        return balance;
    }

    public int withdraw(int amountToWithdraw) {
        balance = balance - amountToWithdraw;
        return balance;
    }
    public int transferTo(BankAccount destinationAccount, int transferAmount){
        withdraw(transferAmount);
        destinationAccount.deposit(transferAmount);
        return getBalance();
    }


}
