public class Main {
    public static void main(String[] args) {
        // Creating objects of the child classes
        Animal animal1 = new Dog(); // Upcasting
        Animal animal2 = new Cat(); // Upcasting

        // Calling the sound() method
        animal1.sound(); // Output will be "Dog barks"
        animal2.sound(); // Output will be "Cat meows"
    }
}