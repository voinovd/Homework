package com.company;

public class Cat {

    private String name;
    private int age;

    private static int catCount = 0;

    Cat(){
        catCount++;
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

    public static int getCatCount() {
        return catCount;
    }
}
