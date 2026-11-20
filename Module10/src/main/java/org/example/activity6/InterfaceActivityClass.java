package org.example.activity6;

// 6.4 Create Interface ActivityClass

public class InterfaceActivityClass {

    // 6.4.1 create public static void main

    public static void main(String[] args){

        // 6.4.2 call bike methods

        Vehicle bike = new Bike();

        bike.start();
        bike.stop();

        // 6.4.3 call car methods

        Vehicle car = new Car();

        car.start();
        car.stop();

    }

}
