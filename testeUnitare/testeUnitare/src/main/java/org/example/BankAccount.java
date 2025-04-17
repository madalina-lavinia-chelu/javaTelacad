package org.example;

public class BankAccount {
    private String owner;
    private double balance;
    private boolean isLocked;

    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
        this.isLocked = false;
    }

    public void deposit(double amount) {
        if (isLocked) throw new IllegalStateException("Account is locked");
        if (amount <= 0) throw new IllegalArgumentException("Amount must be positive");
        balance += amount;
    }

    public void withdraw(double amount) {
        if (isLocked) throw new IllegalStateException("Account is locked");
        if (amount <= 0) throw new IllegalArgumentException("Amount must be positive");
        if (amount > balance) throw new IllegalArgumentException("Insufficient funds");
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void lock() {
        isLocked = true;
    }

    public void unlock() {
        isLocked = false;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public String getOwner() {
        return owner;
    }
}
