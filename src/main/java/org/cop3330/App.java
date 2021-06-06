/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Justin Parrondo
 */

package org.cop3330;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        System.out.print("Your choice: ");

        String choice = in.nextLine().toLowerCase();

        String inputTemp = "Fahrenheit";
        String outputTemp = "Celsius";

        if (choice.equals("f")) {
            String temp = inputTemp;
            inputTemp = outputTemp;
            outputTemp = temp;
        } else if (!choice.equals("c")) {
            System.out.println("Not an option!");
            return;
        }

        System.out.printf("Please enter the temperature in %s: ", inputTemp);
        double temperature = in.nextDouble();
        double answer;

        if (choice.equals("f")) {
            answer = temperature * 9 / 5 + 32;
        } else {
            answer = (temperature - 32) * 5 / 9;
        }

        System.out.printf("The temperature in %s is %d.\n", outputTemp, (int) answer);
    }
}
