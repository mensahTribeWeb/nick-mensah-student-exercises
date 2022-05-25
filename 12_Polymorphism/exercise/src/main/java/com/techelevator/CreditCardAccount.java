package com.techelevator;

public class CreditCardAccount implements Accountable{
    //Properties
    private String accountHolder;
    private String accountNumber;
    private int debt;

    //Constructors

    public CreditCardAccount(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    //Methods
    public int pay(int amountToPay){
        debt = debt-=amountToPay;
        return -debt;
    }

    public int charge(int amountToCharge){
        debt+=amountToCharge;
        return -debt;
    }
    //Override
    @Override
   public int getBalance(){
        return -debt;
    }
    //Getters

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getDebt() {
        return debt;
    }
}
