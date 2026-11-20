package org.example.activity6;

// 6.3 Create class car which implements Vehicle and apply custom implementation of start and stop method

public class Car implements Vehicle {

    public void start(){
        System.out.println("Car starts its work");
    }
    public void stop(){
        System.out.println("Car stops its work");
    }

}
