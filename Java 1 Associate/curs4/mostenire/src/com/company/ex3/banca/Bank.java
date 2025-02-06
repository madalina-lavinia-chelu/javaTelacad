package com.company.ex3.banca;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List <BankAccount> listWithAccount = new ArrayList <>();

    public Bank(List <BankAccount> listWithAccount) {
        this.listWithAccount = listWithAccount;
    }
    protected void addAccount(BankAccount account){
        listWithAccount.add(account);
    }
    protected BankAccount getAccountsForPerson(String CNP){
        return listWithAccount.stream()
                .filter(e -> e.getOwner().getCNP().equals(CNP))
                .findFirst()
                .orElse(null);

    }

}
