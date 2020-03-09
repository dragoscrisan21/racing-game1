package org.fasttrackit;

public class Vehicle {

    //Instance Variables - variabile de instanta, un obiect real din clasa Car!!
    String name;
    String color;
    boolean damage;
    double fuelLevel;
    double totalDistance = 0;
    int maxSpeed;
    int racingNumber;
    double mileage;

    // semnatura metodei; metoda-public; denumirea metodei-accelerate; lista de parametrii-intre paranteze
    public double accelerate (double speed, double durationInHours) {

        //TODO use more fuel if speed > 120km/h
    }

        System.out.println(name + "is accelerating with " + speed + "km/h for " + durationInHours + "h") {

            if (fuelLevel <= 0) {
                System.out.println("Not enough fuel");
                return 0; }
            if (speed > maxSpeed); {
                    System.out.println("Max speed exceeded ");
                    return 0;

            } else if (speed == maxSpeed) {
                System.out.println("Careful! Max speed reached");
            }
            else {
                System.out.println("Careful! Max speed reached");
            }



        //traveled distance - variabila locala
        double traveledDistance = speed * durationInHours;

        System.out.println("traveled Distance " + traveledDistance);

        totalDistance += traveledDistance;

        System.out.println("Total traveled distance " + totalDistance);

        double usedFuel = traveledDistance * mileage / 100;

        fuelLevel = fuelLevel - usedFuel;
        // same result as instruction above
        //fuelLevel -= usedFuel;

        System.out.println("Remainning Fuel " + fuelLevel);

        return traveledDistance;

    }

    public void decelerate() {
        System.out.println("This is just a test");
    }

}
