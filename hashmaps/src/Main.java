import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {

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

        // Creating a LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Adding key-value pairs
        linkedHashMap.put("Alice", 25);
        linkedHashMap.put("Bob", 30);
        linkedHashMap.put("Charlie", 35);

        // Accessing elements
        System.out.println("Age of Charlie: " + linkedHashMap.get("Charlie"));

        // Iterating over key-value pairs
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }

        // Creating a Hashtable
        Map<String, Integer> hashtable = new Hashtable<>();

        // Adding key-value pairs
        hashtable.put("Alice", 25);
        hashtable.put("Bob", 30);
        hashtable.put("Charlie", 35);

        // Accessing elements
        System.out.println("Age of Alice: " + hashtable.get("Alice"));

        // Iterating over key-value pairs
        for (Map.Entry<String, Integer> entry : hashtable.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }

        // Creating a ConcurrentHashMap
        Map<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();

        // Adding key-value pairs
        concurrentHashMap.put("Alice", 25);
        concurrentHashMap.put("Bob", 30);
        concurrentHashMap.put("Charlie", 35);

        // Accessing elements
        System.out.println("Age of Bob: " + concurrentHashMap.get("Bob"));

        // Iterating over key-value pairs
        for (Map.Entry<String, Integer> entry : concurrentHashMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }
    }
}