package com.company.ex3.banca;

public abstract class  BankAccount{
    protected String accountNumber;
    protected double balance;
    Person owner;

    public String getAccountNumber() {
        return accountNumber;
    }

    public Person getOwner() {
        return owner;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public BankAccount(String accountNumber, double balance, Person owner) {

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }
    protected void deposit(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("Depunere reușită! Sold nou: " + balance);
        } else {
            System.out.println("Suma trebuie să fie pozitivă!");
        }
    }

    protected abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}
