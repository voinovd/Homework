package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        sc.close();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int n = rand.nextInt(max) + min;
            System.out.print(n+" ");
        }

    }
}
