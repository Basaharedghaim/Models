package com.models.demo.models.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Book implements Comparable<Book> {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private  Long id;
     @Schema(name = " BookTitle",example = "House Of Dragons")
     private String title;
     private String authorName;
     @Enumerated(EnumType.STRING)
     private Types types;
     private double price;
     @ManyToMany
     private Set<Customer> customers = new HashSet<>();

     public Book() {
     }

     public Book(String title, String authorName, Types types, double price) {
          this.title = title;
          this.authorName = authorName;
          this.types = types;
          this.price=price;
     }

     public Set<Customer> getCustomers() {
          return customers;
     }

     public void setCustomers(Set<Customer> customers) {
          this.customers = customers;
     }

     public  Long getId() {
          return id;
     }

     public String getTitle() {
          return title;
     }

     public void setTitle(String title) {
          this.title = title;
     }

     public String getAuthorName() {
          return authorName;
     }

     public void setAuthorName(String authorName) {
          this.authorName = authorName;
     }

     public Types getTypes() {
          return types;
     }

     public void setTypes(Types types) {
          this.types = types;
     }

     public double getPrice() {return price;}

     public void setPrice(double price) {this.price = price;}

     @Override
     public String toString() {
          return "Book{" +
                  "id=" + id +
                  ", title='" + title + '\'' +
                  ", authorName='" + authorName + '\'' +
                  ", types=" + types +
                  ", price=" + price +
                  '}';
     }
     public boolean equals(Object o) {
          if (this == o) {
               return true;
          } else if (o != null && this.getClass() == o.getClass()) {
               Book book = (Book)o;
               // Check for null values and then compare
               return Objects.equals(this.title, book.title) && Objects.equals(this.authorName, book.authorName);
          } else {
               return false;
          }
     }

     public int hashCode() {
          // Use Objects.hash() to handle null values
          return Objects.hash(this.title, this.authorName);
     }



     @Override
               public int compareTo(Book that) {
          if(this.price==that.price)
               return 0;
          else if (this.price>that.price) {
               return 1;
          }
          else return -1;
               }
          }
