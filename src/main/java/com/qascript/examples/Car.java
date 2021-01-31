package com.qascript.examples;

public class Car {

    private String color;
    private int size;
    private int capacity;
    private double weight;
    private double mileage;

    public void start(){
    }

    public void brake(){
    }

    public void gear(){
    }

    public void accelerate(){
    }

    public void displayCarSpecs(){
        System.out.println("Color of the car is: "+ color);
        System.out.println("Size of the car is: "+ size);
        System.out.println("Weight of the car is: "+ weight);
        System.out.println("Capacity of the car is: "+ capacity);
        System.out.println("Mileage of the car is: "+ mileage);

    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
}
