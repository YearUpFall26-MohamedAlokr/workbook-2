package com.pluralsight;

public class Vehicle {
    long vehicleId;
    String makeModel;
    String color;
    int odometerReading;
    double price;

    public Vehicle(long vehicleId, String makeModel, String color, int odometerReading, double price) {
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }
    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }
    public long getVehicleId() {
        return vehicleId;
    }
    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }
    public String getMakeModel() {
        return makeModel;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }
    public int getOdometerReading() {
        return odometerReading;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }


}
