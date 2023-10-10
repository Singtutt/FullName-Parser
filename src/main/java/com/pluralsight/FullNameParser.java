package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome! Please enter a name in either 'First Last' or ' First Middle Last' format: ");
        String inputName = scanner.nextLine().trim();

//  Define each part of the users input
        String[] nameParts = inputName.split(" ");

        if (nameParts.length == 2) {
            String firstName = nameParts[0];
            String lastName = nameParts[1];

            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
        } else if (nameParts.length == 3) {
            String firstName = nameParts[0];
            String middleName = nameParts[1];
            String lastName = nameParts[2];

            System.out.println("First Name: " + firstName);
            System.out.println("Middle Name: " + middleName);
            System.out.println("Last Name: " + lastName);
        } else {
            System.out.println("Invalid format. Please enter a name in either 'First Last' or ' First Middle Last' format.");
        }

        scanner.close();
    }
}
