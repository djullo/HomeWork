package com.ua.robot.homeWork11;

public class Main {
    public static void main(String[] args) {
        Truck ural = new Truck();
        ural.setName("Ural");
        ural.setColor("Blue");
        ural.setBrand("Laz");
        ural.setYear(1983);
        ural.setLoadCapacity(23);
        ural.setNumberOfWheels(12);
        ural.toneCar();
        System.out.println(ural);

        Passenger mazda = new Passenger();
        mazda.setName("Gringo");
        mazda.setColor("Green");
        mazda.setBrand("Boom");
        mazda.setYear(1990);
        mazda.setNumberOfSeats(23);
        mazda.setNumberOfWindows(6);
        mazda.toneCar();
        System.out.println(mazda);

    }

}
