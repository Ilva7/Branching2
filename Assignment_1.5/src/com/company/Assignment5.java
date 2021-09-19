package com.company;

import java.util.Scanner;

public class Assignment5 {

    public static void main(String[] args) {
	Scanner hours = new Scanner (System.in);
        System.out.println("Please write working hours in a day:");
        int wHours = hours.nextInt();
        if (wHours >=1 && wHours<= 8)
            System.out.println("The amount of salary (EUR):" + " " + wHours * 10);
        else if (wHours > 8 && wHours <= 24)
            System.out.println("The amount of salary (EUR):" + " " + (80 + (wHours - 8)*15));

        else if (wHours < 1 || wHours > 24)
            System.out.println("Invalid working hour amount. Max 24h");
        hours.close();
    }
}
