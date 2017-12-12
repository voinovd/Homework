package com.company;

import java.util.Scanner;

public class Human {

    public int age;
    public String hairColor;

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public String getProfession() { return profession; }

    Scanner sc = new Scanner(System.in);
    String profession=sc.nextLine();

    public void setProfession(String profession) { this.profession = profession; }

    public String getHairColor() { return hairColor; }

    public void setHairColor(String hairColor) { this.hairColor = hairColor; }

}
