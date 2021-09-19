package com.company;

import java.util.Scanner;

public class Assignment4 {

    public static void main(String[] args) {
	Scanner date = new Scanner (System.in);
        System.out.println("Please type the day number:");
    int day = date.nextInt();
        if (day >= 1 && day <= 31)
            System.out.println("The month is: January");
        else if (day >= 32 && day <= 59)
            System.out.println("The month is February");
        else if (day >= 60 && day <= 90)
            System.out.println("The month is March");
        else if (day >= 91 && day <= 120)
            System.out.println("The month is April");
        else if (day >= 121 && day <= 151)
            System.out.println("The month is May");
        else if (day >= 152 && day <= 181)
            System.out.println("The month is June");
        else if (day >= 182 && day <= 212)
            System.out.println("The month is July");
        else if (day >= 213 && day <= 243)
            System.out.println("The month is August");
        else if (day >= 244 && day <= 273)
            System.out.println("The month is September");
        else if (day >= 274 && day <= 304)
            System.out.println("The month is October");
        else if (day >= 305 && day <= 334)
            System.out.println("The month is November");
        else if (day >= 335 && day <= 365)
            System.out.println("The month is December");
        else if (day > 365)
            System.out.println("Invalid number. Please choose from 1 to 365 or use a different tool for the leap year.");
        date.close();
    }
}
