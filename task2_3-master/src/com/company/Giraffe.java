package com.company;

public class Giraffe {

    private String name;
    private int age;

    public Giraffe() {
    }

    public void eat() {
        System.out.println("Girraff is eating..");
    }

    public void drink() {
        System.out.println("Giraffe is drinking..");
    }

    public void sleep() {
        System.out.println("Giraffe is sleeping..");
    }

    public void getBorring() {
        System.out.println("Giraffe is getBorring..");
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


}
