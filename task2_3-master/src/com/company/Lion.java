package com.company;

public class Lion {

    private String name;
    private int age;

    public Lion() {
    }

    public void eat() {
        System.out.println("Lion is eating..");
    }

    public void drink() {
        System.out.println("Lion is drinking..");
    }

    public void sleep() {
        System.out.println("Lion is sleeping..");
    }

    public void getBorring() {
        System.out.println("Lion is getBorring..");
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
