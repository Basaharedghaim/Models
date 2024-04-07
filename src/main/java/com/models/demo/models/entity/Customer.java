package com.models.demo.models.entity;

import com.fasterxml.jackson.annotation.JsonSetter;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="customer_table")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(name = " Id",example = "1")
    private Long id;
    @Schema(name = "first Name",example = "John")
           private String firstName;
    @Schema(name = "Last Name",example = "Doe")
           private String lastName;
    @Schema(name = "gender",example = "Male")
           private String gender;

    @Schema(name = "email",example = "JohnDoe@gmail.com")
           private String email;
           private double balance;

    @ManyToMany
    private Set<Book> books = new HashSet<>();

            public Customer() {
            }

            public Customer(String firstName, String lastName, String gender,String email,double balance) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.gender = gender;
                this.email=email;
                this.balance=balance;
            }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Long getId() {
                return id;
            }

            public String getFirstName() {
                return firstName;
            }

            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            public String getLastName() {
                return lastName;
            }

            public void setLastName(String lastName) {
                this.lastName = lastName;
            }

            public String getGender() {
                return gender;
            }

            public void setGender(String gender) {
                this.gender = gender;
            }

            public double getBalance() {
                return balance;
            }

            public void setBalance(double balance) {
                this.balance = balance;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }


}
