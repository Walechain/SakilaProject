public class Main {
    public static void main(String[] args) {
        // Creating objects using different constructors
        Car car1 = new Car(); // Using default constructor
        Car car2 = new Car("Toyota", "Camry", 2020); // Using parameterized constructor

        // Displaying car information
        System.out.println("Car 1:");
        car1.displayInfo();
        System.out.println("\nCar 2:");
        car2.displayInfo();
    }
}