package factorymethod;

abstract class Vehicle {
    public abstract int getWheel();
    public String toString() {
        return "Vehicle has " + this.getWheel();
    }
}

class Car extends Vehicle {
    int wheel;
    Car(int wheel) {
        this.wheel = wheel;
    }
    @Override
    public int getWheel() {
        return this.wheel;
    }
}

class Bike extends Vehicle {
    int wheel;
    Bike(int wheel) {
        this.wheel = wheel;
    }
    @Override
    public int getWheel() {
        return this.wheel;
    }
}

class VehicleFactory {
    public static Vehicle getInstance(String vehicleName, int wheel ) {
        if (vehicleName.equalsIgnoreCase("car")) return new Car(wheel);
        if (vehicleName.equalsIgnoreCase("bike")) return new Bike(wheel);
        return null;
    }
}

public class FactoryClass {

    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getInstance("car", 4);
        System.out.println(car.toString());;
        Vehicle bike = VehicleFactory.getInstance("biKe", 2);
        System.out.println(bike.toString());

    }
}
