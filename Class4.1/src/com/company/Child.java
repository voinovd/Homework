package com.company;

import java.util.List;

public abstract class Child {
    private int age;
    private String name;
    protected abstract void walk();
    public void walkInForest(){
        walk();
        System.out.println(" in forest");
    };
    public List<Toy> getToMe(){

    };

}
