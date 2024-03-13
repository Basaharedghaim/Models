package models;

import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.List;

public class Customer {
           private static int lastAssignedId = 100;
           private int id;
           private String firstName;
           private String lastName;
           private String gender;
           private List<Book> bookList;
            public Customer() {
            }

            public Customer(String firstName, String lastName, String gender) {
                id=++lastAssignedId;
                this.firstName = firstName;
                this.lastName = lastName;
                this.gender = gender;
            }

            public int getId() {
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
                public List<Book> getBookList() {
                    return bookList;
                }
                public void setBookList(List<Book> bookList) {
                    this.bookList = bookList;
                }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", bookList=" + bookList +
                '}';
    }
}
