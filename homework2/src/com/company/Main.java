package com.company;

public class Main {
    public static void main(String[] args) {
        Owl[] owls=getOwls();
           }

    public static Owl[] getOwls() {
        Owl[] owls = new Owl[4];

        owls[0] = new Owl();
        owls[0].setName("Букля");
        owls[0].setAge(2);
        owls[0].setBreed("Порода 1");
        owls[0].sleep();

        owls[1] = new Owl();
        owls[1].setName("Пухля");
        owls[1].setAge(1);
        owls[1].setBreed("Порода 2");
        owls[1].hunt();

        owls[2] = new Owl();
        owls[2].setName("Духля");
        owls[2].setAge(3);
        owls[2].setBreed("Порода 3");
        owls[2].devourPrey();

        owls[3] = new Owl();
        owls[3].setName("Рухля");
        owls[3].setAge(5);
        owls[3].setBreed("Порода 4");
        owls[3].sleep();
        return owls;
    }
}
