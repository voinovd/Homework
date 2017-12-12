package logic;

import java.util.ArrayList;
import java.util.List;

public class MainJava {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Cat cat = new Cat();
        Bird bird = new Bird();
        Fish fish = new Fish();
        fish.canSwim();
        cat.drinkMilk();
        bird.canFly();
        Swimable shark = new Fish();
        shark.canSwim();
        List<String> list = new List<>();
    }

}

