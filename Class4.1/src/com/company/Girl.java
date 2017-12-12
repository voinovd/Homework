package com.company;

import java.util.List;

public class Girl extends Child {
    @Override
    protected void walk() {
        System.out.print("Girl walk");

    }

    @Override
    public List<Toy> getToMe(String colour) {
        return null;
    }
}
