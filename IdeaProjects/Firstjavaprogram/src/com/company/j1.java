package com.company;
class Q{
 public    int age;


    public void setAge(int age){
        this.age= age;
    }

    public int getAge(){
        return age;
    }

}
public class j1 {

    public static void main(String [] args){

        Q q= new Q();
        q.setAge(100);
        System.out.println(q.getAge());


    }
}
