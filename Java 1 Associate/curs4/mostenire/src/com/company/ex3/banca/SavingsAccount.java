package com.company.ex3.banca;

public class SavingsAccount extends BankAccount{


    public SavingsAccount(String accountNumber, double balance, Person owner) {
        super(accountNumber, balance, owner);
    }


    protected void withdraw(double amount){

        if(this.balance - amount < 500) {
            System.out.println("Aceasta suma nu se poate extrage");
            System.out.println("\tRetragere permisă doar dacă soldul rămas este > 500 RON.");
        }
        else
            this.balance -= amount;
    }

}
