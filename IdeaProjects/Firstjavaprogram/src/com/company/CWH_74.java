package com.company;


import java.util.ArrayList;

class  Book{
    public String name,author,issued_TO,issued_ON;

}

class MyLibrary{
    public ArrayList<Book> books;
    public  MyLibrary(ArrayList<Book>  books){
        this.books = books;

    }
  public  void addBook(Book book){
      System.out.println("This Book Has Been Added To The Library");
        this.books.add(book);

  }

  public  void returnBook(Book b){
      System.out.println(" The Book Has Been Returned");
      this.books.add(b);
  }

  public  void issueBook(Book book){
      System.out.println("This Book Has been Issued From The Library");
      this.books.remove(book);
  }
}
public class CWH_74 {
    public static void main(String[] args) {
        // SOLVING A QUESTION ---->> MAKING A LIBRARY
    }
    ArrayList<Book> bk = new ArrayList<>();

    MyLibrary l = new MyLibrary(bk);

}
