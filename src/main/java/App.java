/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Koby Montenegro
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.print("Enter the principal: ");
        Scanner scanner = new Scanner(System.in);
        double principal = scanner.nextDouble();

        System.out.print("What is the rate? ");
        double rate = scanner.nextFloat();
        rate = rate/10;

        System.out.print("What is the number of years? ");
        Double years = scanner.nextDouble();

        System.out.print("What is the number of times the interest is compounded per year? ");
        Double compound = scanner.nextDouble();

        double total = principal * Math.pow(1 + ((rate/100)/compound), compound * years);

        System.out.print(principal + " invested at " + rate + "% for " + years + " years compunded " + compound + " times per year is $");
        System.out.printf("%.2f.", total);

        scanner.close();
    }
}