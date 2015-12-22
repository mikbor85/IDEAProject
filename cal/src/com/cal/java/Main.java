package com.cal.java;

import java.lang.String;
import java.util.Scanner;

public class Calculator2 {

    public static void main(String[] args) {
        String s1 = getInput("Enter a value: ");
        String s2 = getInput("Enter a value: ");
        String s3 = getInput("Choose an operation (+ - * /): ");

        double result = 0;
        try{
            switch (s3) {
                case "+":
                    result = addValues(s1, s2);
                    break;
                case  "-":
                    result = substractValue(s1, s2);
                    break;
                default:
                    System.out.println("No operation!");
                    return;}

                System.out.println("The answer is: " + result);
            } catch (Exception e) {
            System.out.println("Number exception" + e.getMessage());
        }
        }

    private static String getInput(String s) {
    }
}

