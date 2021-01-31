package com.qascript.examples;

import com.qascript.examples.Car;

public class Hyundai {

    public static void main(String[] args){
        Car hyundai = new Car();
        hyundai.setCapacity(4000);
        hyundai.setColor("black");
        hyundai.setWeight(100.00);
        hyundai.setMileage(20.00);
        hyundai.setSize(500);
        hyundai.displayCarSpecs();
    }

}
