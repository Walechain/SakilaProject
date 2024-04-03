public class Main {
    public static void main(String[] args) {
        // Creating an object of the subclass Dog
        Dog dog = new Dog();

        // Calling methods from the superclass Animal
        dog.eat();   // Output: Animal is eating
        dog.sleep(); // Output: Animal is sleeping

        // Calling method specific to the subclass Dog
        dog.bark();  // Output: Dog is barking
    }
}