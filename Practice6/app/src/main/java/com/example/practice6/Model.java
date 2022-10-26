package com.example.practice6;

public class Model {
    String name;
    int age;

  // MAKING CONSTRUCTORS AND GETTER ANDS SETTERS
    public Model(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Model(int age) {
        this.age = age;
    }
}
