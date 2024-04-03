public class Main {
    public static void main(String[] args) {
        // Creating objects of different subclasses
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        // Calling the overridden method
        animal1.makeSound(); // Output will be "Dog barks"
        animal2.makeSound(); // Output will be "Cat meows"
    }
}