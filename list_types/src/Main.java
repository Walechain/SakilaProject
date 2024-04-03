import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating an ArrayList
        List<String> arrayList = new ArrayList<>();

        // Adding elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        // Printing elements of the ArrayList
        System.out.println("ArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // Creating a LinkedList
        List<Integer> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        // Printing elements of the LinkedList
        System.out.println("\nLinkedList:");
        for (int number : linkedList) {
            System.out.println(number);
        }

    }
}