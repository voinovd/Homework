package com.company;

public class Tiger {
    private String name;
    private int age;

    public Tiger() {
    }

    public void eat() {
        System.out.println("Tiger is eating..");
    }

    public void drink() {
        System.out.println("Tiger is drinking..");
    }

    public void sleep() {
        System.out.println("Tiger is sleeping..");
    }

    public void getBorring() {
        System.out.println("Tiger is getBorring..");
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
