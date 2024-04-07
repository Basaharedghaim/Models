package com.models.demo.models.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.models.demo.models.entity.Account;
import jakarta.persistence.Entity;


public class Request {
    private String customerName;
    private double amount;
    private Account account;

    public Request() {
    }

    public Request(String customerName, double amount, Account account) {
        this.customerName = customerName;
        this.amount = amount;
        this.account = account;

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





    @Override
    public String toString() {
        return "Request{" +
                "customerName='" + customerName + '\'' +
                ", amount=" + amount +
                ", account=" + account +
                '}';
    }
}
