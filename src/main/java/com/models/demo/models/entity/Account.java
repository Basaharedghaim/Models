package com.models.demo.models.entity;

import jakarta.persistence.Entity;


public class Account {
    private Customer customer;
    private long accNumber;
    private int visaCard;


    public Account() {
    }

    public Account(Customer customer, long accNumber, int visaCard) {
        this.customer = customer;
        this.accNumber = accNumber;
        this.visaCard = visaCard;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public long getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }

    public int getVisaCard() {
        return visaCard;
    }

    public void setVisaCard(int visaCard) {
        this.visaCard = visaCard;
    }

    @Override
    public String toString() {
        return "Account{" +
                "customer=" + customer +
                ", accNumber=" + accNumber +
                ", visaCard=" + visaCard +
                '}';
    }
}
