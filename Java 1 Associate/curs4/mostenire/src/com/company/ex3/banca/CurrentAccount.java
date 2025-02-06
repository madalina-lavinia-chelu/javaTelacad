package com.company.ex3.banca;

public class CurrentAccount extends BankAccount{
    public CurrentAccount(String accountNumber, double balance, Person owner) {
        super(accountNumber, balance, owner);
    }
    protected void withdraw(double amount){

        if(this.balance - amount <= -1000) {
            System.out.println("Aceasta suma nu se poate extrage");
            System.out.println("\tRetragere permisă chiar dacă soldul devine negativ, dar până la -1000 RON.");
        }
        else
            this.balance -= amount;
    }

}
