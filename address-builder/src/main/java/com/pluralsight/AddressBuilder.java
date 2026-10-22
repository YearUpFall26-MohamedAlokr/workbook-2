package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Please provide the following information:");
        System.out.print("Full Name: ");
        String FullName = input.nextLine();
        System.out.print("Billing Street: ");
        String BillingStreet = input.nextLine();
        System.out.print("Billing City: ");
        String BillingCity = input.nextLine();
        System.out.print("Billing State: ");
        String BillingState = input.nextLine();
        System.out.print("Billing Zip: ");
        String BillingZip = input.nextLine();
        String BillingAdress=AdressBuilder(BillingStreet,BillingCity,BillingState,BillingZip);

        System.out.print("Shipping Street: ");
        String ShippingStreet= input.nextLine();
        System.out.print("Shipping City: ");
        String ShippingCity= input.nextLine();
        System.out.print("Shipping State: ");
        String ShippingState= input.nextLine();
        System.out.print("Shipping Zip: ");
        String ShippingZip = input.nextLine();
        String ShippingAdress=AdressBuilder(ShippingStreet,BillingCity,BillingState,BillingZip);

        System.out.println("\n"+FullName);
        System.out.println("\n"+"Billing Address:");
        System.out.println(BillingAdress);
        System.out.println("\n"+"Shipping Address:");
        System.out.println(ShippingAdress);
    }
    static String AdressBuilder(String Street,String City,String State,String Zip) {
        StringBuilder sb = new StringBuilder();
        sb.append(Street);
        sb.append("\n");
        sb.append(City);sb.append(",");sb.append(State); sb.append(" ");sb.append(Zip);
        return sb.toString();

    }

}
