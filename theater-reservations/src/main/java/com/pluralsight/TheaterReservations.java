package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TheaterReservations {
    static void main(String[] args) {
//        Please enter your name: Geri Johnson↵
//        What date will you be coming (MM/dd/yyyy): 05/13/2023↵
//        How many tickets would you like? 3↵
//        3 tickets reserved for 2023-05-13 under Johnson, Geri
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        String[] names = name.split(Pattern.quote(" "));
        String FinalName = names[1]+" , "+names[0];
        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String date = input.nextLine();
        String[] dates = date.split(Pattern.quote("/"));
        String FinalDate = dates[2]+"/"+dates[1]+"/"+dates[0]+"/n";
        System.out.print("How many tickets would you like? ");
        int tickets = input.nextInt();
        if (tickets <= 1 )
        System.out.println(tickets + " ticket reserved for " +FinalDate+"under "+FinalName+".");
        else {
            System.out.println(tickets + " tickets reserved for " +FinalDate + " under "+FinalName+".");
        }
    }
    static void zeke(){
        Scanner input = new Scanner(System.in);
    }
}
