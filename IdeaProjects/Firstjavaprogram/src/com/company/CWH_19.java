package com.company;

import java.security.PublicKey;         // GETTER AND SETTERS


class Employee{
       int id;
       String  name;

       public String getName(){
           return  name;

       }
       public void setName(String n){   //SETTER
           name=n;

       }
      public void setId(int i){
           id=i;

      }
   public int getId(){       // GETTER
           return  id;

   }

  }
public class CWH_19 {
    public static void main(String[] args) {
Employee harry = new Employee();

harry.setId(5);
harry.getId();
harry.setName("yash");
        System.out.println(harry.id);
    }
}
