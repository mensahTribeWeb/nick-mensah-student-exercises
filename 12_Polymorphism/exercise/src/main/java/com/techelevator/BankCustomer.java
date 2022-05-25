package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
    //Properties
    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<>();

    //Method
    public BankCustomer(){}

    public Accountable[] getAccounts() {
        Accountable [] accountsArr = new Accountable[accounts.size()];
        for (int i =0; i<accounts.size(); i++){
         accountsArr[i] = accounts.get(i);
        }

        return accountsArr;
    }
    public void addAccount(Accountable newAccount){
        accounts.add(newAccount);
    }
    public boolean isVip(){
        int combinedAccountBalance = 0;
        for (Accountable accounts : getAccounts()){
            combinedAccountBalance += accounts.getBalance();
        }
        if (combinedAccountBalance >= 25000){return true;}
        else{return false;}
    }

    //Getters

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }



    //Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
