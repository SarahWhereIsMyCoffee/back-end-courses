package it.sevenbits.practiceFive;

import java.util.UUID;

public class Account implements Comparable<Account>{
    private String id;
    private long balance;

    public Account(long balance) {
        id = UUID.randomUUID().toString();
        this.balance = balance;
    }

    public synchronized void addToBalance(long value) throws Exception {
        long balance = this.balance;
        Thread.sleep(1);
        this.balance = balance + value;
    }

    @Override
    public String toString() {
        return String.format("%s", balance);
    }

    @Override
    public int compareTo(Account account) {
        return Long.compare(balance, account.balance);
    }
}