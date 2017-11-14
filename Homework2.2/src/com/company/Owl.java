package com.company;

public class Owl {
    private String name;
    private int age;
    private String breed;

    public Owl(){}

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getAge() {return age; }

    public void setAge(int age) { this.age = age; }

    public String getBreed() { return breed; }

    public void setBreed(String breed) { this.breed = breed; }

    public void hunt(){
        System.out.println(name + " охотится");
    }
    public void devourPrey(){
        System.out.println(name + " пожирает добычу");
    }
    public void sleep(){
        System.out.println(name + " спит");
    }
}
