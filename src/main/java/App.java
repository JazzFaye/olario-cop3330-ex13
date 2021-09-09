/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

import java.util.Scanner;   //Use class scanner

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //Scanner to obtain input

        System.out.println("What is the principal amount? ");
        String amount = sc.nextLine();  //Read input from the user
        double P = Double.parseDouble(amount);  //Convert input from string to double

        System.out.println("What is the rate? ");
        String rate = sc.nextLine();    //Read input from the user
        double Rate = Double.parseDouble(rate); //Convert input from string to double

        System.out.println("What is the number of years? ");
        String years = sc.nextLine();   //Read input from the user
        double t = Double.parseDouble(years);   //Convert input from string to double

        System.out.println("What is the number of times the interest is compounded per year? ");
        String interest = sc.nextLine();    //Read input from the user
        double n = Double.parseDouble(interest);    //Convert input from string to double

        double r = Rate / 100;  //Formula to prompt for the rate as a percentage
        //The following are the formulas to obtain the amount at the end of the investment
        double a = (1 + (r/n));
        double b = n * t;
        double A = P * Math.pow(a,b);   //Using Math. pow to calculate a number raise to the power of some other number.
        // Display the principal amount, rate, number of years, the number of times the interest is compounded per year and the amount at the end of the investment.
        System.out.printf("$%.0f invested at %.1f%% for %.0f years compounded %.0f times per year is $%.2f.", P, Rate, t, n, A);
    }
}
