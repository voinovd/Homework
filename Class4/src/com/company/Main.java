package com.company;

public class Main {

    public static void main(String[] args) {

        Cat myCat = new Cat();
        myCat.setName("Sansa");
        myCat.setAge(5);
        System.out.println("catCount = "+ Cat.getCatCount());

        Cat anotherCat = new Cat();
        anotherCat.setName("Richard");
        anotherCat.setAge(2);
        System.out.println("catCount = "+ Cat.getCatCount());

    }
}
