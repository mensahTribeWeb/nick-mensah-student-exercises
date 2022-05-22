package com.techelevator;

public class BankAccount {
    //Properties
    private String accountHolderName;
    private String accountNumber;
    private int balance ;

    //Overloaded Constructors
   public BankAccount(String accountHolderName, String accountNumber){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }
    public BankAccount(String accountHolderName, String accountNumber, int balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    //Methods
    public int deposit(int amountToDeposit){

           return balance += amountToDeposit;
    }
    public int withdraw(int amountToWithdraw){

       return balance-=amountToWithdraw;
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
}
