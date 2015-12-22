package com.calc.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number");

        String input1 = sc.nextLine();
        double d1 = Double.parseDouble(input1);

        System.out.print("Enter another number: ");

        String input2 = sc.nextLine();
        double d2 = Double.parseDouble(input2);

        double result = d1 + d2;
        System.out.println("The answer:" + result);
        }
    }

