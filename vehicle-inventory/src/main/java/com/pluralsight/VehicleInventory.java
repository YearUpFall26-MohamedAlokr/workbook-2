package com.pluralsight;

import java.util.Scanner;

public class VehicleInventory {
    static Scanner input = new Scanner(System.in);
    static Vehicle[] vehicles = new Vehicle[20];
    static int vehicleCount = 6;
    static void main(String[] args) {
        vehicles[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        vehicles[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        vehicles[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        vehicles[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        vehicles[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        vehicles[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);

        boolean running = true;
        while (running) {
        System.out.println("What do you want to do?");
        System.out.println("1 - List all vehicles");
        System.out.println("2 - Search by make/model");
        System.out.println("3 - Search by price range");
        System.out.println("4 - Search by color");
        System.out.println("5 - Add a vehicle");
        System.out.println("6 - Quit");
        System.out.println("Enter your command:");
        int command = input.nextInt();
        input.nextLine();

        switch (command) {

            case 1:
                listAllVehicles();
                break;

            case 2:
                findVehiclesByMakeModel();
                break;

            case 3:
                findVehiclesByPriceRange();
                break;

            case 4:
                findVehiclesByColor();
                break;

            case 5:
                addVehicle();
                break;

            case 6:
                running = false;
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }
    }

    public static void listAllVehicles() {

        for (int i = 0; i < vehicleCount; i++) {

            System.out.printf(
                    "%d | %s | %s | %d | $%.2f%n",
                    vehicles[i].getVehicleId(),
                    vehicles[i].getMakeModel(),
                    vehicles[i].getColor(),
                    vehicles[i].getOdometerReading(),
                    vehicles[i].getPrice()
            );
        }
    }

    public static void findVehiclesByMakeModel() {

        System.out.print("Enter make/model: ");
        String search = input.nextLine();

        for (int i = 0; i < vehicleCount; i++) {

            if (vehicles[i].getMakeModel()
                    .toLowerCase()
                    .contains(search.toLowerCase())) {

                System.out.println(
                        vehicles[i].getVehicleId() + " " +
                                vehicles[i].getMakeModel()
                );
            }
        }
    }

    public static void addVehicle() {

        System.out.print("Vehicle ID: ");
        long id = input.nextLong();
        input.nextLine();

        System.out.print("Make/Model: ");
        String makeModel = input.nextLine();

        System.out.print("Color: ");
        String color = input.nextLine();

        System.out.print("Odometer: ");
        int odometer = input.nextInt();

        System.out.print("Price: ");
        double price = input.nextDouble();
        input.nextLine();

        vehicles[vehicleCount] =
                new Vehicle(id, makeModel, color, odometer, price);

        vehicleCount++;

        System.out.println("Vehicle added.");
    }

    public static void findVehiclesByPriceRange() {

        System.out.print("Minimum price: ");
        double min = input.nextDouble();

        System.out.print("Maximum price: ");
        double max = input.nextDouble();
        input.nextLine();

        for (int i = 0; i < vehicleCount; i++) {

            if (vehicles[i].getPrice() >= min &&
                    vehicles[i].getPrice() <= max) {

                System.out.println(
                        vehicles[i].getVehicleId() + " " +
                                vehicles[i].getMakeModel() +
                                " $" + vehicles[i].getPrice()
                );
            }
        }
    }

    public static void findVehiclesByColor() {

        System.out.print("Enter color: ");
        String color = input.nextLine();

        for (int i = 0; i < vehicleCount; i++) {

            if (vehicles[i].getColor().equalsIgnoreCase(color)) {

                System.out.println(
                        vehicles[i].getVehicleId() + " " +
                                vehicles[i].getMakeModel()
                );
            }
        }
    }


}
