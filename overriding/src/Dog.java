// Child class inheriting from the parent class
class Dog extends Animal {
    // Method overriding: overriding the sound() method of the parent class
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}