package com.ahmedabiodun;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter an integer: ");
        int integer = scanner.nextInt();
        scanner.nextLine();

        if (integer % 2 == 1) {
            System.out.println("Weird");
        } else if ((integer % 2 == 0) && (integer >= 2) && (integer <= 5)) {
            System.out.println("Not Weird");
        } else if ((integer % 2 == 0) && (integer >= 6) && (integer <= 20)) {
            System.out.println("Weird");
        } else if ((integer % 2 == 0) && (integer > 20)) {
            System.out.println("Not Weird");
        } else {
            System.out.println("Please enter a positive integer...");
        }
    }
}
