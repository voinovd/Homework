package com.company;

import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("login");
        String login=sc.nextLine();
        System.out.println("password");
        String password=sc.nextLine();
        System.out.println(login);
        System.out.println(password.replaceAll("[a-zA-Z0-9]+", "*******"));
        sc.close();


    }

}