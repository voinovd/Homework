package com.company;
        import java.util.Arrays;
        import java.util.Random;
public class Main {

    public static void main(String[] args) {
        int[] newarray=new int[20];
        Random rand = new Random();

        int max = 100;
        int min = 1;
        for (int i=0; i< 20;i++){

            newarray[i]=rand.nextInt(max) + min;

        System.out.print(newarray[i]+" ");
        }
    }
}