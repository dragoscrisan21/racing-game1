package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        System.out.println( "Welcome to the Racing Game :D" );

        Car carReference = new Car();
        carReference.name = "Audi";
        carReference.color = "Red";
        carReference.maxSpeed = 260;
        carReference.mileage = 6.2;
        carReference.fuelLevel = 100;

        //Concatenare - se face lipire de Stringuri
        //Ceea ce urmeaza dupa String o sa se transforme automat in string!
        System.out.println("Properties of " + carReference.name);
        System.out.println("Color " + carReference.color);
        System.out.println("Maximum Speed " + carReference.maxSpeed);
        System.out.println("Mileage " + carReference.mileage);
        System.out.println("Fuel Level " + carReference.racingNumber);
        System.out.println("Damage " + carReference.damage);

        //Initializarea unui nou obiect!
        Car car2 = new Car();
        car2.name = "Lambourghini";
        car2.damage = true;

        //Instantiere - procesul prin care am creat un obiect real din acea clasa!
        System.out.println("Propertie of " + car2.name);
        System.out.println("Colour " + car2.color);
        System.out.println("Damaged " + car2.damage);

//        carReference.engine = new Engine();
//        carReference.engine.manufacturer = "vw";
//        carReference.engine.capacity = 2000;

        Engine engine1 = new Engine();
        engine1.manufacturer = "vw";
        engine1.capacity = 2000;

        carReference.engine = engine1;

        double currentDistance = carReference.accelerate(60, 1);

        System.out.println("Current Distance " + currentDistance);

        //One object with two references
        System.out.println("Engine info ");
        System.out.println(engine1.capacity);
        System.out.println(carReference.engine.capacity);

        engine1.capacity = 2100;

        System.out.println("Updated engine details ");
        System.out.println(engine1.capacity);
        System.out.println(carReference.engine.capacity);



    }


}
