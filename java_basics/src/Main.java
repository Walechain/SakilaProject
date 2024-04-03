import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a new ArrayList to store the squares
        List<Integer> squares = new ArrayList<>();

// Start a loop from 1 to 5 (inclusive), incrementing by 2 each time
        for (int x = 1; x <= 5; x += 2) {
            // Compute the square of the current value of x and add it to the squares list
            squares.add(x * x);
        }

        // Create a HashMap to store squares of numbers
        Map<Integer, Integer> squaresDict = new HashMap<>();

        // Populate the squaresDict map with squares of numbers from 1 to 5
        for (int x = 1; x <= 5; x++) {
            squaresDict.put(x, x * x);
        }

        // Print the contents of the squaresDict map
        System.out.println("Squares Dictionary:");
        for (Map.Entry<Integer, Integer> entry : squaresDict.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());


        }

        // Creating a HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 35);

        // Accessing elements
        System.out.println("Age of Bob: " + hashMap.get("Bob"));

        // Iterating over key-value pairs
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }

        // Creating a TreeMap
        Map<String, Integer> treeMap = new TreeMap<>();

        // Adding key-value pairs
        treeMap.put("Alice", 25);
        treeMap.put("Bob", 30);
        treeMap.put("Charlie", 35);

        // Accessing elements
        System.out.println("Age of Alice: " + treeMap.get("Alice"));

        // Iterating over key-value pairs
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }

    }
}