package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        String s4 = sc.nextLine();
        String s5 = sc.nextLine();
        sc.close();
        String[] array = {s1, s2, s3, s4, s5};
        Arrays.sort(array, array.length);
            System.out.println(array);
        }
    }
