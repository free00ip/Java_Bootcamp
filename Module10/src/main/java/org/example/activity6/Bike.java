package org.example.activity6;

// 6.2 Create class bike which implements Vehicle and apply custom implementation of start and stop method

public class Bike implements Vehicle {

    public void start(){
        System.out.println("Bike starts its work");
    }
    public void stop(){
        System.out.println("Bike stops its work");
    }

}
