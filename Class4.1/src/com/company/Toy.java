package com.company;

import java.util.ArrayList;
import java.util.List;

public class Toy {
    private String name;
    private String colour;
    private static List<Toy> toyList = new ArrayList<Toy>();

    public static List<Toy> getToyList() {
        return toyList;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Toy{");
        sb.append("name='").append(name).append('\'');
        sb.append(", colour='").append(colour).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Toy(String name, String colour) {
        toyList.add(this);
        this.name = name;
        this.colour = colour;
    }

}
