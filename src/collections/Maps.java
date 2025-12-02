package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//Maps class demonstrating various Map collection operations.

public class Maps implements IMapDemonstrator {

    // Creates HashMap with sample entries
    private static Map<String, Integer> createHashMap() {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 5);
        hashMap.put("Banana", 3);
        hashMap.put("Cherry", 8);
        hashMap.put("Date", 2);
        return hashMap;
    }

    // Prints map information
    private static void printMapInfo(Map<String, Integer> map) {
        System.out.println("Initial map: " + map);
        System.out.println("Size: " + map.size());
    }

    // Accesses value by key
    private static void accessValueByKey(Map<String, Integer> map, String key) {
        System.out.println("Quantity of " + key + ": " + map.get(key));
    }

    // Checks if key or value exists
    private static void checkKeyValueExists(Map<String, Integer> map, String key, Integer value) {
        System.out.println("Contains key '" + key + "': " + map.containsKey(key));
        System.out.println("Contains value " + value + ": " + map.containsValue(value));
    }

    // Updates value in map
    private static void updateValue(Map<String, Integer> map, String key, Integer newValue) {
        map.put(key, newValue);
        System.out.println("After updating " + key + " quantity: " + map);
    }

    // Removes entry from map
    private static void removeEntry(Map<String, Integer> map, String key) {
        map.remove(key);
        System.out.println("After removing '" + key + "': " + map);
    }

    // Iterates through map entries
    private static void iterateMap(Map<String, Integer> map) {
        System.out.println("Iterating through map:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("  " + entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Demonstrates HashMap operations
    @Override
    public void demonstrateHashMap() {
        System.out.println("\n=== HashMap Demonstration ===");
        
        Map<String, Integer> hashMap = createHashMap();
        printMapInfo(hashMap);
        accessValueByKey(hashMap, "Apple");
        checkKeyValueExists(hashMap, "Banana", 8);
        updateValue(hashMap, "Apple", 10);
        removeEntry(hashMap, "Date");
        iterateMap(hashMap);
    }

    //Demonstrates LinkedHashMap operations.
    @Override
    public void demonstrateLinkedHashMap() {
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

    // Demonstrates TreeMap operations.

    @Override
    public void demonstrateTreeMap() {
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

    //Demonstrates working with User objects as Map values.

    @Override
    public void demonstrateUserMap() {
        System.out.println("\n=== Map with User Objects ===");
        
        Map<String, User> userMap = new HashMap<>();
        
        // Add users with phone as key
        userMap.put("+38-555-0101", new User("Maria", 25, "+38-555-0101"));
        userMap.put("+38-555-0102", new User("Anna", 30, "+38-555-0102"));
        userMap.put("+38-555-0103", new User("Mykola", 28, "+38-555-0103"));
        
        System.out.println("Users in map:");
        userMap.forEach((phone, user) -> 
            System.out.println("  " + phone + " -> " + user)
        );
        
        // Lookup user by phone
        String searchPhone = "+38-555-0102";
        User foundUser = userMap.get(searchPhone);
        if (foundUser != null) {
            System.out.println("\nFound user by phone '" + searchPhone + "': " + foundUser);
        }
        
        // Check if user exists
        System.out.println("Contains user with phone '+38-555-0101': " +
            userMap.containsKey("+38-555-0101"));
    }

    //Helper method to print all elements of a map using EntrySet.

    @Override
    public void printMapEntries(Map<Integer, String> map, String mapName) {
        System.out.println(mapName + " entries:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("  " + entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Creates LinkedHashMap<Integer, String> (map1)
    private static LinkedHashMap<Integer, String> createMap1() {
        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();
        System.out.println("a. Created LinkedHashMap map1: " + map1);
        return map1;
    }

    // Adds all months of the year to map
    private static void addMonthsToMap(LinkedHashMap<Integer, String> map) {
        map.put(1, "January");
        map.put(2, "February");
        map.put(3, "March");
        map.put(4, "April");
        map.put(5, "May");
        map.put(6, "June");
        map.put(7, "July");
        map.put(8, "August");
        map.put(9, "September");
        map.put(10, "October");
        map.put(11, "November");
        map.put(12, "December");
        System.out.println("b. Added all months of the year to map1: " + map);
    }

    // Prints first and last month
    private static void printFirstAndLastMonth(LinkedHashMap<Integer, String> map) {
        System.out.println("c. First month (key 1): " + map.get(1));
        System.out.println("   Last month (key 12): " + map.get(12));
    }

    // Replaces month at key 6 with 'VACATION'
    private static void replaceMonthWithVacation(LinkedHashMap<Integer, String> map) {
        String previousMonth = map.put(6, "VACATION");
        System.out.println("d. Replaced month at key 6 (was: " + previousMonth + ") with 'VACATION'");
        System.out.println("   map1 after replacement: " + map);
        System.out.println("   Month at key 6: " + map.get(6));
    }

    // Creates HashMap<Integer, String> (map2)
    private static HashMap<Integer, String> createMap2() {
        HashMap<Integer, String> map2 = new HashMap<>();
        System.out.println("\ne. Created HashMap map2: " + map2);
        return map2;
    }

    // Copies all values from map1 to map2
    private static void copyMap1ToMap2(HashMap<Integer, String> map2, LinkedHashMap<Integer, String> map1) {
        map2.putAll(map1);
        System.out.println("f. Copied all values from map1 to map2: " + map2);
    }

    // Creates map3 with student names and contact sets
    private static Map<String, Set<String>> createStudentContactsMap() {
        Map<String, Set<String>> map3 = new HashMap<>();
        
        Set<String> student1Contacts = Set.of(
            "+38-555-0101",
            "anna@student.itstep.org",
            "anna.student.skype"
        );
        
        Set<String> student2Contacts = Set.of(
            "+38-555-0202",
            "maria@student.itstep.org",
            "maria.student.skype"
        );
        
        Set<String> student3Contacts = Set.of(
            "+38-555-0303",
            "mykola.@student.itstep.org",
            "mykola.student.skype"
        );
        
        map3.put("Anna", student1Contacts);
        map3.put("Maria", student2Contacts);
        map3.put("Mykola", student3Contacts);
        
        return map3;
    }

    // Prints student contacts map
    private static void printStudentContactsMap(Map<String, Set<String>> map3) {
        System.out.println("map3 entries:");
        for (Map.Entry<String, Set<String>> entry : map3.entrySet()) {
            System.out.println("  Student: " + entry.getKey());
            System.out.println("    Contacts: " + entry.getValue());
        }
    }

    // Prints contacts for a specific student
    private static void printStudentContacts(Map<String, Set<String>> map3, String studentName) {
        System.out.println("\nAccessing contacts for '" + studentName + "':");
        Set<String> contacts = map3.get(studentName);
        if (contacts != null) {
            contacts.forEach(contact -> System.out.println("  - " + contact));
        }
    }

    // Demonstrates basic Map operations
    @Override
    public void demonstrateBasicMapOperations() {
        System.out.println("\n=== Basic Map Operations Demonstration ===");
        
        LinkedHashMap<Integer, String> map1 = createMap1();
        addMonthsToMap(map1);
        printFirstAndLastMonth(map1);
        replaceMonthWithVacation(map1);
        
        HashMap<Integer, String> map2 = createMap2();
        copyMap1ToMap2(map2, map1);
        
        System.out.println("\ng. Printing maps using EntrySet:");
        printMapEntries(map1, "map1 (LinkedHashMap - preserves insertion order)");
        System.out.println();
        printMapEntries(map2, "map2 (HashMap - order not guaranteed)");
        
        System.out.println("\nh. Creating map3 with student names and contact sets:");
        Map<String, Set<String>> map3 = createStudentContactsMap();
        printStudentContactsMap(map3);
        printStudentContacts(map3, "Mykola");
    }

    //Runs all Map demonstrations.

    @Override
    public void demonstrateAll() {
        demonstrateHashMap();
        demonstrateLinkedHashMap();
        demonstrateTreeMap();
        demonstrateUserMap();
        demonstrateBasicMapOperations();
    }
}
