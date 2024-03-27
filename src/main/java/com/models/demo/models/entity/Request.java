package com.models.demo.models.entity;

import com.models.demo.models.entity.Account;
import jakarta.persistence.Entity;


public class Request {
    private String customerName;
    private double amount;
    private Account account;
    private Book book;

    public Request() {
    }

    public Request(String customerName, double amount, Account account,Book book) {
        this.customerName = customerName;
        this.amount = amount;
        this.account = account;
        this.book=book;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Request{" +
                "customerName='" + customerName + '\'' +
                ", amount=" + amount +
                ", account=" + account +
                '}';
    }
}
