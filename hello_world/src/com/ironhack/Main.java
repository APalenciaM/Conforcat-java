package com.ironhack;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        System.out.println("HelloWorld");

        String var1 = "Hello World!";
        char var2 = 'C';
        int var3 = 1;
        int var4 = -1;
        double var5 = 1.52;
        boolean var6 = true;
        float var7 = 5.45f;

        System.out.println(1 + 2);
        System.out.println(1 - 5);
        System.out.println(1 * 5);
        System.out.println(1 / 5);
        System.out.println(11 % 5);
        int edad1 = 20;
        int edad2 = 25;

        if (edad1 > edad2){
            System.out.println("la edad1 es mayor que la edad2");
        }else if(edad1 == edad2)
        {
            System.out.println("La edad1 es igual que la edad");
        }else{
            System.out.println("La edad1 es menor que la edad2");
        }


        String weekday = "Tuesday";
        switch (weekday){
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;
            default:
                System.out.println("Day not found");
                break;

        }
        System.out.println(productFormatter2("Adrià Palencia I Martín","28/06/22"));

        System.out.println(Math.pow(2,3));

    }

    public static String concatenateStrings(String word1,String word2){
        return word1+word2;
    }

    public static int calculateLength(String word){
        return word.length();
    }

    public static String productFormatter(String productName,String date){
        String newFormat;

        productName = productName.replace( " ","_");
         newFormat = productName+" "+date;
        return newFormat.toUpperCase();
    }

    public static String productFormatter2(String productName,String date){
        return (productName.replace( " ","_")+date).toUpperCase();
    }
}
