package com.techelevator;

public class CreditCard implements Accountable{
    //Properties
    private String accountHolder;
    private String accountNumber;
    private int debt;

    //Constructors

    public CreditCard(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    //Methods
    public int pay(int amountToPay){
        debt-=amountToPay;
        return debt;
    }

    public int charge(int amountToCharge){
        debt+=amountToCharge;
        return debt;
    }
    @Override
    public int transferTo(int transferAmount) {
        return 0;
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
