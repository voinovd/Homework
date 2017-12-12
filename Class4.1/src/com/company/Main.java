package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    Girl girl = new Girl();
    Boy boy = new Boy();
    girl.walkInForest();
    boy.walkInForest();

    List<Toy> toys = new ArrayList<Toy>();
    toys.add(new Toy("Лошадка", "Blue"));
    toys.add(new Toy("Слоник", "Pink"));
    toys.add(new Toy("Лопатка", "Blue"));
    toys.add(new Toy("Ведёрко", "Pink"));

    System.out.println(Arrays.toString(boy.getToMe().toArray()));
    System.out.println(Arrays.toString(girl.getToMe().toArray()));
    }
}
