package com.company;  // CONSTRUCTORS
class MyEmployee{
    private int id;
    private String name;

    public MyEmployee(){     // IN JAVA CONSTRUCTOR IS PRECEEDED VIA ACCESS MODIFIER
        id = 45;
        name=" yash";

    }

  public String getName(){      // in java this is called setters and getters
      return name;

  }
 public void setName(String n){
      this.name =n;

 }
 public void setId(int i){
      this.id =i;

 }
public int getId(){
      return id;

}
public void display(){
    System.out.println("hello");
}

}
public class CWH_20 {
    public static void main(String[] args) {
MyEmployee harry = new MyEmployee();
        System.out.println(harry.getId());
        System.out.println(harry.getName());
        harry.display();
    }
}
