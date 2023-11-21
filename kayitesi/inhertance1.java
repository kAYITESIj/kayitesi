class inhertance1{
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive(); // Accessing the method from the parent class
        myCar.accelerate(); // Accessing the method from the child class
    }
}

class Vehicle {
    void drive() {
        System.out.println("Vehicle is being driven.");
    }
}

// Child class inheriting from Vehicle
class Car extends Vehicle {
    void accelerate() {
        System.out.println("Car is accelerating.");
    }
}

// Main class to demonstrate single inheritance
