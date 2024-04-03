// Another child class inheriting from the parent class
class Cat extends Animal {
    // Method overriding: overriding the sound() method of the parent class
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}