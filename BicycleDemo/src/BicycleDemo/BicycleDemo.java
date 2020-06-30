package BicycleDemo;


/**********************************************************************
 * Program:PRG/421 Week 1 Coding Assignment BicycleDemo
 * Purpose: Incorporating an abstract class. adapting a private variable
 * of integer type named bicycleCount, making changes to constructor to add 1
 * to the bicycleCount each time a new object of type Bicycle is created.
 * Incorporating a public getter method to return current value of bicycleCount
 * and two derived classes from Bicycle: MountainBike and RoadBike.
 * Programmer: Cesar Cervantes
 * Class:PRG/421r13, Java Programming II
 * Instructor: Jeff Lee
 * Creation Date: June 10th, 2019
 **********************************************************************/

class BicycleDemo {
    public static void main(String[] args) {

        // Create two different
        // Bicycle objects
        MountainBike bike1 = new MountainBike(); // Replaced default Bicycle class with derived MountainBike class to reflect values respectively
        RoadBike bike2 = new RoadBike(); // Replaced default Bicycle class with derived RoadBike class to reflect values respectively

        // Invoke methods on
        // those objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
    }
}