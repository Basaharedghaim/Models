package models;

import io.swagger.v3.oas.annotations.media.Schema;

public class Book {
     private static int lastAssignedId=1;
     private final int id;
     @Schema(name = " BookTitle",example = "House Of Dragons")
     private String title;
     private String authorName;
     private Types types;
     private double price;

     public Book() {
          this.id=lastAssignedId++;
     }

     public Book(String title, String authorName, Types types,double price) {
          this();
          this.title = title;
          this.authorName = authorName;
          this.types = types;
          this.price=price;
     }

     public  int getId() {
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
}
