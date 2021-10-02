package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1;
        int num2;

        //First num
        System.out.println("Please enter your first number:\n");
        num1 = input.nextInt();
        //Second num
        System.out.println("Please enter your second number:\n");
        num2 = input.nextInt();
        //importing operation scanner
        Scanner op = new Scanner(System.in);

        System.out.println("Now enter your operation:\n");
        String operation = op.next();

        // setting up operations
        if (operation.equals("-")) {
            System.out.println("Your subtracted number is: " + (num1 - num2));
        }
        if (operation.equals("+")) {
            System.out.println("Your added number is: " + (num1 + num2));
        }
        if (operation.equals("/")) {
            System.out.println("Your divided number is: " + (num1 / num2));
        }
        if (operation.equals("*")) {
            System.out.println("Your multiplied number is: " + (num1 * num2));
        }

        // Im not sure on this one....
        if (operation.equals("n*n")) {
            System.out.println("Your squared number is: " + (Math.sqrt(num1 * num2)));
        }

    }
}
