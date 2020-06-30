package BicycleDemo;

abstract class Bicycle {  // changed to abstract class to pass on values on to derived classes of Bicycle

    int cadence = 0;
    int speed = 0;
    int gear = 1;
    private static int bicycleCount = 0;  // Declared private static int so value is not modified

    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public static int getBicycleCount() {  // Declared public static int getter to return current bicycleCount value
        return ++bicycleCount; // Returns increment of 1 per bicycle object.
    }

    void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear + " bike number: " + getBicycleCount()); // Added getBicycleCount() to display current bike number per Bicycle object
    }
}