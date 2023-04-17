package com.learntocode;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName = myScanner.nextLine();
        String[] fullNameSplit = fullName.split(" ");
        String firstName = fullNameSplit[0];
        String lastName = fullNameSplit[1];
        System.out.println("Enter the date of the show (MM/dd/yyyy): ");
        String dateOfShow = myScanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(dateOfShow, formatter);
        System.out.println("How many tickets would you like? ");
        String ticketAmount = myScanner.nextLine();
        int ticketAmountNumber = Integer.parseInt(ticketAmount);

        if (ticketAmountNumber == 1) {
            System.out.println(ticketAmount + " ticket reserved for " + date + " under " + lastName + " " + firstName);
        } else if (ticketAmountNumber == 0) {
            System.out.println("You have no tickets. ");
        } else {
            {
            System.out.println(ticketAmountNumber + " tickets reserved for " + date + " under " + lastName + " " + firstName);
        }
    }
}}
