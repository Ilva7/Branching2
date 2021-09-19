package com.company;

import java.util.Scanner;

public class Assignment3 {

    public static void main(String[] args) {

        Scanner date = new Scanner(System.in);
        System.out.println("Please enter the day:");
        int day = date.nextInt();
        System.out.println("Please enter the month:");
        int month = date.nextInt();
        System.out.println("Please enter the year:");
        int year = date.nextInt();
        System.out.println("Please choose the date format: 1 for YYYY/MM/DD; 2 for YYYY.MM.DD");
        short choose = date.nextShort();
        if (choose == 1)
            System.out.println("You entered" + " " + year + "/" + month + "/" + day);
        if (choose == 2)
            System.out.println("You entered" + " " + year + "." + month + "." + day + ".");
        if (!(day >= 1 && day <= 31 && month >= 1 && month <= 12 && year >= 1))
            System.out.println("Invalid date format");
        date.close();
    }
}
