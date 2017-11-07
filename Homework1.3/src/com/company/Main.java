package com.company;

import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(s);
        String s1=sc.nextLine();
        sc.close();
        if(s.contains(s1)) {
            System.out.println("Содержит");
        }


    }

}