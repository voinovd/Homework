package com.company;

public class Main {

    public static void main(String[] args) {
        String[] stringArray = new String[100];

        for ( int i = 0; i < stringArray.length; i++ ){
            System.out.println(stringArray[i]);
        }

        for (String str : stringArray ) {
            System.out.println(str);
        }
    }
}
