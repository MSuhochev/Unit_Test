package test.hw_2;

import HW_2.Motorcycle;
import HW_2.Vehicle;
import HW_2.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class VehicleTest {
    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Dodge", "Ram", 2010);

        assertTrue(car instanceof Vehicle);
    }


    // Проверить, что объект Car создается с 4-мя колесами.
    @Test
    public void testCarIsFourWheels() {
        Car car = new Car("Kia", "Seed jd", 2015);

        assertEquals(4, car.getNumWheels());
    }


    // Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    public void testMotoIsTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Ducati", "Desert X", 2022);

        assertEquals(2, motorcycle.getNumWheels());
    }


    /* Проверить, что объект Car развивает скорость 60 в режиме тестового вождения
    (используя метод testDrive()). */
    @Test
    public void testSpeedCar() {
        Car car = new Car("Kia", "Seed jd", 2015);

        car.testDrive();

        assertEquals(60, car.getSpeed());
    }


    /* Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового
    вождения (используя метод testDrive()). */
    @Test
    public void testSpeedMotorcycle() {
        Motorcycle motorcycle = new Motorcycle("Ducati", "Desert X", 2022);

        motorcycle.testDrive();

        assertEquals(75, motorcycle.getSpeed());
    }

    /* Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция
    движения транспорта) машина останавливается (speed = 0).*/
    @Test
    public void testParkingCar() {
        Car car = new Car("Kia", "Seed jd", 2015);

        car.testDrive();
        car.park();

        assertEquals(0, car.getSpeed());
    }

    /* Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция
    движения транспорта) мотоцикл останавливается (speed = 0).*/
    @Test
    public void testParkingMotorcycle() {
        Motorcycle motorcycle = new Motorcycle("Ducati", "Desert X", 2022);

        motorcycle.testDrive();
        motorcycle.park();

        assertEquals(0, motorcycle.getSpeed());
    }

}