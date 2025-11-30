package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Maps class demonstrating various Map collection operations.
 * Maps store key-value pairs and do not allow duplicate keys.
 */
public class Maps {

    /**
     * Demonstrates HashMap operations.
     * HashMap does not maintain insertion order, provides O(1) average time complexity.
     */
    public static void demonstrateHashMap() {
        System.out.println("\n=== HashMap Demonstration ===");
        
        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        
        // Add key-value pairs
        hashMap.put("Apple", 5);
        hashMap.put("Banana", 3);
        hashMap.put("Cherry", 8);
        hashMap.put("Date", 2);
        
        System.out.println("Initial map: " + hashMap);
        System.out.println("Size: " + hashMap.size());
        
        // Access value by key
        System.out.println("Quantity of Apples: " + hashMap.get("Apple"));
        
        // Check if key exists
        System.out.println("Contains key 'Banana': " + hashMap.containsKey("Banana"));
        System.out.println("Contains value 8: " + hashMap.containsValue(8));
        
        // Update value
        hashMap.put("Apple", 10);
        System.out.println("After updating Apple quantity: " + hashMap);
        
        // Remove entry
        hashMap.remove("Date");
        System.out.println("After removing 'Date': " + hashMap);
        
        // Iterate through map
        System.out.println("Iterating through map:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("  " + entry.getKey() + " -> " + entry.getValue());
        }
    }

    /**
     * Demonstrates LinkedHashMap operations.
     * LinkedHashMap maintains insertion order of entries.
     */
    public static void demonstrateLinkedHashMap() {
        System.out.println("\n=== LinkedHashMap Demonstration ===");
        
        // Create a LinkedHashMap
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        
        // Add entries (order will be preserved)
        linkedHashMap.put("First", "One");
        linkedHashMap.put("Second", "Two");
        linkedHashMap.put("Third", "Three");
        linkedHashMap.put("Fourth", "Four");
        
        System.out.println("Initial map (preserves insertion order): " + linkedHashMap);
        
        // Access entries
        System.out.println("Value for 'Second': " + linkedHashMap.get("Second"));
        
        // Iterate in insertion order
        System.out.println("Entries in insertion order:");
        linkedHashMap.forEach((key, value) -> 
            System.out.println("  " + key + " -> " + value)
        );
    }

    /**
     * Demonstrates TreeMap operations.
     * TreeMap maintains entries in sorted order based on keys.
     */
    public static void demonstrateTreeMap() {
        System.out.println("\n=== TreeMap Demonstration ===");
        
        // Create a TreeMap (automatically sorted by key)
        Map<String, Integer> treeMap = new TreeMap<>();
        
        // Add entries in random order
        treeMap.put("Zebra", 1);
        treeMap.put("Apple", 2);
        treeMap.put("Monkey", 3);
        treeMap.put("Dog", 4);
        
        System.out.println("Initial map (sorted by key): " + treeMap);
        
        // Get first and last entries
        System.out.println("First key: " + treeMap.keySet().iterator().next());
        
        // Access entries
        System.out.println("Value for 'Dog': " + treeMap.get("Dog"));
        
        // Iterate in sorted order
        System.out.println("Entries in sorted order:");
        treeMap.entrySet().forEach(entry -> 
            System.out.println("  " + entry.getKey() + " -> " + entry.getValue())
        );
    }

    /**
     * Demonstrates working with User objects as Map values.
     */
    public static void demonstrateUserMap() {
        System.out.println("\n=== Map with User Objects ===");
        
        Map<String, User> userMap = new HashMap<>();
        
        // Add users with email as key
        userMap.put("alice@example.com", new User("Alice", 25, "alice@example.com"));
        userMap.put("bob@example.com", new User("Bob", 30, "bob@example.com"));
        userMap.put("charlie@example.com", new User("Charlie", 28, "charlie@example.com"));
        
        System.out.println("Users in map:");
        userMap.forEach((email, user) -> 
            System.out.println("  " + email + " -> " + user)
        );
        
        // Lookup user by email
        String searchEmail = "bob@example.com";
        User foundUser = userMap.get(searchEmail);
        if (foundUser != null) {
            System.out.println("\nFound user by email '" + searchEmail + "': " + foundUser);
        }
        
        // Check if user exists
        System.out.println("Contains user with email 'alice@example.com': " + 
            userMap.containsKey("alice@example.com"));
    }

    /**
     * Runs all Map demonstrations.
     */
    public static void demonstrateAll() {
        demonstrateHashMap();
        demonstrateLinkedHashMap();
        demonstrateTreeMap();
        demonstrateUserMap();
    }
}
