package com.company;

public class Assignment2 {

    public static void main(String[] args) {
	int time = 20;
    if (0 < time && time < 12) {
        System.out.println("Good Morning Sunshine!");
    }
    else if (13 <= time && time <= 19) {
        System.out.println("Good Afternoon. Work Hard!");
    }
    else if (20 <= time && time <= 24) {
        System.out.println("Good Evening. Get some rest!");
    }
    else if (0 > time || time > 24) {
        System.out.println("Time format is not correct. Please try again!");
    }
    }
}
