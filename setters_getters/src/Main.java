public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        // Set values using setter methods
        person.setName("Alice");
        person.setAge(30);

        // Get values using getter methods
        String name = person.getName();
        int age = person.getAge();

        // Print the retrieved values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}