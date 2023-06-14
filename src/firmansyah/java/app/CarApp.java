package firmansyah.java.app;

import firmansyah.java.data.Car;
import firmansyah.java.data.Civic;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Civic();
        car.drive();
        System.out.println(car.getTire());
    }
}
