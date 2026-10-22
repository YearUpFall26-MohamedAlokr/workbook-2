package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a CellPhone object
        CellPhone phone = new CellPhone();
        // Get input from user
        System.out.print("What is the serial number? ");
        int serialNumber = scanner.nextInt();
        phone.setSerialNumber(serialNumber);

        scanner.nextLine();

        System.out.print("What model is the phone? ");
        String model = scanner.nextLine();
        phone.setModel(model);


        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();
        phone.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        phone.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();
        phone.setOwner(owner);

        // Display phone information using getters
        System.out.println("\nCell Phone Information");
        System.out.println("----------------------");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
        System.out.println("----------------------");
        System.out.print("Enter Phone Number you want to dial : ");
        phone.dial(scanner.nextLine());
        CellPhone phone2 = new CellPhone(12343, "Samsung", "T-mobile", "646-998-3765", "Someone");
        phone.display(phone2);
        System.out.println("----------------------");
        phone2.display(phone);
        phone.dial(phone2.getPhoneNumber());
        phone2.dial(phone.getPhoneNumber());
        scanner.close();
    }
}
