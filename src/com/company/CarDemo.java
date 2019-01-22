
package com.company;

public class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car ();

        myCar.setMake("BMW");
        myCar.setModel("M3");
        myCar.setColor("Black");

        System.out.println ("My car's make is " +myCar.getMake());
        System.out.println ("My car's model is " +myCar.getModel());
        System.out.println ("My car's color is " +myCar.getColor());

    }
}
