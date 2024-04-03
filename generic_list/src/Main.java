import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creating a generic list of strings
        List<String> stringList = new ArrayList<>();

        // Adding elements to the list
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");

        // Accessing elements of the list
        System.out.println("Elements of the list:");
        for (String fruit : stringList) {
            System.out.println(fruit);
        }

        // Adding more elements to the list
        stringList.add("Mango");
        stringList.add("Grapes");

        // Accessing elements by index
        System.out.println("\nElement at index 2: " + stringList.get(2));

        // Removing an element
        stringList.remove("Banana");

        // Displaying the updated list
        System.out.println("\nUpdated list after removing 'Banana':");
        for (String fruit : stringList) {
            System.out.println(fruit);
        }
    }
}