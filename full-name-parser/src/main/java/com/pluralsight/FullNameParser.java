package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name : ");
        String fullName = scanner.nextLine().trim();

        String first = fullName.split(" ")[0];
        String second = fullName.split(" ")[1];
        String third = "";

        if (fullName.split(" ").length > 2) {
            third = fullName.split(" ")[2];
        }


        System.out.println("First Name: " + first);

        if (fullName.split(" ").length > 2) {
            System.out.println("Middle Name: " + second);
            System.out.println("Last Name: " + third);
        }else {
            System.out.println("Middle Name: None ");
            System.out.println("Last Name: " + second);

        }



    }


}
