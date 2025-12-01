package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
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
        
        // Add users with phone as key
        userMap.put("+1-555-0101", new User("Alice", 25, "+1-555-0101"));
        userMap.put("+1-555-0102", new User("Bob", 30, "+1-555-0102"));
        userMap.put("+1-555-0103", new User("Charlie", 28, "+1-555-0103"));
        
        System.out.println("Users in map:");
        userMap.forEach((phone, user) -> 
            System.out.println("  " + phone + " -> " + user)
        );
        
        // Lookup user by phone
        String searchPhone = "+1-555-0102";
        User foundUser = userMap.get(searchPhone);
        if (foundUser != null) {
            System.out.println("\nFound user by phone '" + searchPhone + "': " + foundUser);
        }
        
        // Check if user exists
        System.out.println("Contains user with phone '+1-555-0101': " + 
            userMap.containsKey("+1-555-0101"));
    }

    /**
     * Helper method to print all elements of a map using EntrySet.
     *
     * @param map the map to print
     * @param mapName the name of the map for display purposes
     */
    public static void printMapEntries(Map<Integer, String> map, String mapName) {
        System.out.println(mapName + " entries:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("  " + entry.getKey() + " -> " + entry.getValue());
        }
    }

    /**
     * Demonstrates basic Map operations including:
     * - Creating LinkedHashMap and HashMap
     * - Working with months of the year
     * - Copying maps
     * - Using EntrySet for iteration
     * - Maps with Set values
     */
    public static void demonstrateBasicMapOperations() {
        System.out.println("\n=== Basic Map Operations Demonstration ===");
        
        // a. Create LinkedHashMap<Integer, String> (map1)
        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();
        System.out.println("a. Created LinkedHashMap map1: " + map1);
        
        // b. Add all months of the year (month number : month name)
        map1.put(0, "January");
        map1.put(1, "February");
        map1.put(2, "March");
        map1.put(3, "April");
        map1.put(4, "May");
        map1.put(5, "June");
        map1.put(6, "July");
        map1.put(7, "August");
        map1.put(8, "September");
        map1.put(9, "October");
        map1.put(10, "November");
        map1.put(11, "December");
        
        System.out.println("b. Added all months of the year to map1: " + map1);
        
        // c. Print first and last month of the year (0 and 11)
        System.out.println("c. First month (key 0): " + map1.get(0));
        System.out.println("   Last month (key 11): " + map1.get(11));
        
        // d. Insert 'VACATION' in place of the 6th month, print it
        String previousMonth = map1.put(6, "VACATION");
        System.out.println("d. Replaced month at key 6 (was: " + previousMonth + ") with 'VACATION'");
        System.out.println("   map1 after replacement: " + map1);
        System.out.println("   Month at key 6: " + map1.get(6));
        
        // e. Create HashMap<Integer, String> (map2)
        HashMap<Integer, String> map2 = new HashMap<>();
        System.out.println("\ne. Created HashMap map2: " + map2);
        
        // f. Insert all values from map1 into map2
        map2.putAll(map1);
        System.out.println("f. Copied all values from map1 to map2: " + map2);
        
        // g. Create method to print all map elements using EntrySet, print map1 and map2
        System.out.println("\ng. Printing maps using EntrySet:");
        printMapEntries(map1, "map1 (LinkedHashMap - preserves insertion order)");
        System.out.println();
        printMapEntries(map2, "map2 (HashMap - order not guaranteed)");
        
        // h. Create map3 (key - student name (String), value - student contacts: 
        //    mobile phone, email, skype (Set<String>))
        System.out.println("\nh. Creating map3 with student names and contact sets:");
        Map<String, Set<String>> map3 = new HashMap<>();
        
        // Create contact sets for students
        Set<String> student1Contacts = Set.of(
            "+1-555-0101",           // mobile phone
            "alice.student@university.edu",  // email
            "alice.student.skype"    // skype
        );
        
        Set<String> student2Contacts = Set.of(
            "+1-555-0202",
            "bob.student@university.edu",
            "bob.student.skype"
        );
        
        Set<String> student3Contacts = Set.of(
            "+1-555-0303",
            "charlie.student@university.edu",
            "charlie.student.skype"
        );
        
        map3.put("Alice", student1Contacts);
        map3.put("Bob", student2Contacts);
        map3.put("Charlie", student3Contacts);
        
        System.out.println("map3 entries:");
        for (Map.Entry<String, Set<String>> entry : map3.entrySet()) {
            System.out.println("  Student: " + entry.getKey());
            System.out.println("    Contacts: " + entry.getValue());
        }
        
        // Demonstrate accessing contacts
        System.out.println("\nAccessing contacts for 'Bob':");
        Set<String> bobContacts = map3.get("Bob");
        if (bobContacts != null) {
            bobContacts.forEach(contact -> System.out.println("  - " + contact));
        }
    }

    /**
     * Runs all Map demonstrations.
     */
    public static void demonstrateAll() {
        demonstrateHashMap();
        demonstrateLinkedHashMap();
        demonstrateTreeMap();
        demonstrateUserMap();
        demonstrateBasicMapOperations();
    }
}
