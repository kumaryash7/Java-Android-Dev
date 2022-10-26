package com.company;
class Library{
    String[] books;
    int no_of_books;



    Library(){
        this.books = new String[100];

    }

    void addBook(String book){
        this.books[no_of_books]=book;
        no_of_books++;

    }

   void ShowAailableBooks(){
       System.out.println(" available books are :");
       for (String book:this.books) {
           if(book==null){
               break;
           }
           System.out.println(" *"+ book);
       }
   }

   void issueBook(String book){
       for (String b:this.books) {
           if(b == book){

           System.out.println(" the Book has been issued");

       }
   }
   }
}
public class CWH_30 {
    public static void main(String[] args) {
Library centralLibrary = new Library();
centralLibrary.addBook(" mocking bird");
centralLibrary.addBook(" c++");
centralLibrary.addBook(" Algorithms");
centralLibrary.ShowAailableBooks();
    }
        }
