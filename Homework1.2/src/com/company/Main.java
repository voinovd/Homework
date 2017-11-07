package com.company;
import java.util.Arrays;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        int[] array = new int[20];
        Random rand = new Random();
        int max = 100;
        int min = 1;
        for (int i = 0; i < 20; i++) {
            array[i] = rand.nextInt(max) + min;
            System.out.print(array[i] + " ");
        }

        float[] newarray = new float[10];
        Random newrand = new Random();
        int newmax = 75;
        int newmin = 25;
        for (int i = 0; i < 10; i++) {
            newarray[i] = rand.nextInt(newmax) + newmin;
            System.out.println(newarray[i] + " ");
        }
        System.out.println("Съешь ещё этих мягких французских булок, да выпей же чаю");
    }
}