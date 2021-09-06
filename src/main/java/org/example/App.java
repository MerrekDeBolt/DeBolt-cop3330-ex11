package org.example;

/*
 *  UCF COP3330 Fall 2021 Exercise 11 Solution
 *  Copyright 2021 Merrek DeBolt
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args)
    {
        String input;
        double euros, dollars, exchangeRate;

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many euros are you exchanging?");
        input = scanner.nextLine();
        euros = Double.parseDouble(input);

        System.out.println("What is the exchange rate?");
        input = scanner.nextLine();
        exchangeRate = Double.parseDouble(input);

        dollars = euros * exchangeRate;

        System.out.println(String.format("%.2f", euros) + " euros at an exchange rate of " + exchangeRate + " is");
        System.out.println(String.format("%.2f", dollars) + " U.S. dollars.");
    }
}
