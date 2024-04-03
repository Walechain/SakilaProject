public class Main {
    public static void main(String[] args) {
        Child child1 = new Child(10); // Output will be "Parent constructor with one parameter: 10" and "Child constructor with one parameter: 10"
        System.out.println();

        Child child2 = new Child(20, 30); // Output will be "Parent constructor with one parameter: 20", "Child constructor with one parameter: 20", and "Child constructor with two parameters: 20, 30"
    }
}
