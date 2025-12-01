package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

 // Sets class demonstrating various Set collection operations.
 // Sets do not allow duplicate elements and do not maintain index-based access.

public class Sets implements ISetDemonstrator {

     // Demonstrates HashSet operations.
     // HashSet does not maintain insertion order, provides O(1) average time complexity.

    @Override
    public void demonstrateHashSet() {
        System.out.println("\n=== HashSet Demonstration ===");
        
        // Create a HashSet
        Set<String> hashSet = new HashSet<>();
        
        // Add elements
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Apple"); // Duplicate will be ignored
        
        System.out.println("Initial set: " + hashSet);
        System.out.println("Size: " + hashSet.size());
        System.out.println("Note: 'Apple' was added twice but appears only once");
        
        // Check if element exists
        System.out.println("Contains 'Banana': " + hashSet.contains("Banana"));
        System.out.println("Contains 'Date': " + hashSet.contains("Date"));
        
        // Remove element
        hashSet.remove("Cherry");
        System.out.println("After removing 'Cherry': " + hashSet);
        
        // Iterate through set
        System.out.print("Iterating: ");
        for (String fruit : hashSet) {
            System.out.print(fruit + " ");
        }
        System.out.println();
    }

    /**
     * Demonstrates LinkedHashSet operations.
     * LinkedHashSet maintains insertion order of elements.
     */
    @Override
    public void demonstrateLinkedHashSet() {
        System.out.println("\n=== LinkedHashSet Demonstration ===");
        
        // Create a LinkedHashSet
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        
        // Add elements (order will be preserved)
        linkedHashSet.add(30);
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(40);
        
        System.out.println("Initial set (preserves insertion order): " + linkedHashSet);
        
        // Add duplicate (will be ignored)
        linkedHashSet.add(10);
        System.out.println("After trying to add duplicate 10: " + linkedHashSet);
        
        // Check if set is empty
        System.out.println("Is empty: " + linkedHashSet.isEmpty());
        
        // Iterate in insertion order
        System.out.print("Elements in insertion order: ");
        linkedHashSet.forEach(element -> System.out.print(element + " "));
        System.out.println();
    }

    /**
     * Demonstrates TreeSet operations.
     * TreeSet maintains elements in sorted order.
     */
    @Override
    public void demonstrateTreeSet() {
        System.out.println("\n=== TreeSet Demonstration ===");
        
        // Create a TreeSet (automatically sorted)
        Set<String> treeSet = new TreeSet<>();
        
        // Add elements in random order
        treeSet.add("Zebra");
        treeSet.add("Apple");
        treeSet.add("Monkey");
        treeSet.add("Dog");
        
        System.out.println("Initial set (sorted automatically): " + treeSet);
        
        // Get first and last elements
        System.out.println("First element: " + treeSet.iterator().next());
        
        // Check if element exists
        System.out.println("Contains 'Monkey': " + treeSet.contains("Monkey"));
        
        // Remove element
        treeSet.remove("Zebra");
        System.out.println("After removing 'Zebra': " + treeSet);
        
        // Iterate in sorted order
        System.out.print("Elements in sorted order: ");
        treeSet.forEach(element -> System.out.print(element + " "));
        System.out.println();
    }

    /**
     * Demonstrates set operations: union, intersection, difference.
     */
    @Override
    public void demonstrateSetOperations() {
        System.out.println("\n=== Set Operations (Union, Intersection, Difference) ===");
        
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        
        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        
        // Union (all elements from both sets)
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union (set1 ∪ set2): " + union);
        
        // Intersection (common elements)
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection (set1 ∩ set2): " + intersection);
        
        // Difference (elements in set1 but not in set2)
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference (set1 - set2): " + difference);
    }

    /**
     * Demonstrates working with User objects in a Set.
     */
    @Override
    public void demonstrateUserSet() {
        System.out.println("\n=== Set with User Objects ===");
        
        Set<User> userSet = new HashSet<>();
        
        // Create and add users
        User alice = new User("Alice", 25, "+1-555-0101");
        User bob = new User("Bob", 30, "+1-555-0102");
        User charlie = new User("Charlie", 28, "+1-555-0103");
        
        userSet.add(alice);
        userSet.add(bob);
        userSet.add(charlie);
        
        // Try to add duplicate (same fields)
        User aliceDuplicate = new User("Alice", 25, "+1-555-0101");
        userSet.add(aliceDuplicate);
        
        System.out.println("Users in set:");
        userSet.forEach(user -> System.out.println("  " + user));
        System.out.println("Size: " + userSet.size());
        System.out.println("Note: Duplicate user with same fields was not added");
        
        // Check if user exists
        User searchUser = new User("Bob", 30, "+1-555-0102");
        System.out.println("Contains Bob: " + userSet.contains(searchUser));
    }

    // Prepares lists for set operations
    private static List<String> prepareLists(ArrayList<String> list1, ArrayList<String> list2) {
        String[] stringArray = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
        list1.addAll(Arrays.asList(stringArray));
        list2.addAll(list1);
        List<String> list3 = Arrays.asList("Xylophone", "Yacht", "Zebra");
        int middleIndex = list2.size() / 2;
        list2.addAll(middleIndex, list3);
        
        System.out.println("Prepared lists:");
        System.out.println("  list1: " + list1);
        System.out.println("  list2: " + list2);
        System.out.println("  list3: " + list3);
        
        return list3;
    }

    // Creates HashSet<String> (set1)
    private static HashSet<String> createSet1() {
        HashSet<String> set1 = new HashSet<>();
        System.out.println("\na. Created HashSet set1: " + set1);
        return set1;
    }

    // Adds 2 arbitrary strings to set
    private static void addArbitraryStringsToSet(HashSet<String> set) {
        set.add("Orange");
        set.add("Grape");
        System.out.println("b. Added 2 arbitrary strings to set1: " + set);
    }

    // Adds all elements from lists to set
    private static void addListsToSet(HashSet<String> set, ArrayList<String> list1, ArrayList<String> list2) {
        set.addAll(list1);
        set.addAll(list2);
        System.out.println("c. Added all elements from list1 and list2 to set1: " + set);
    }

    // Prints set values
    private static void printSetValues(Set<String> set, String setName) {
        System.out.println("d. " + setName + " values:");
        for (String element : set) {
            System.out.println("   - " + element);
        }
        System.out.println("   " + setName + " size: " + set.size());
    }

    // Creates LinkedHashSet<String> (set2)
    private static LinkedHashSet<String> createSet2() {
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        System.out.println("\ne. Created LinkedHashSet set2: " + set2);
        return set2;
    }

    // Adds all elements from lists to LinkedHashSet
    private static void addListsToLinkedHashSet(LinkedHashSet<String> set, ArrayList<String> list2, List<String> list3) {
        set.addAll(list2);
        set.addAll(list3);
        System.out.println("f. Added all elements from list2 and list3 to set2: " + set);
    }

    // Compares HashSet and LinkedHashSet
    private static void compareSets(HashSet<String> set1, LinkedHashSet<String> set2) {
        System.out.println("\nComparison:");
        System.out.println("  set1 (HashSet) - order not guaranteed: " + set1);
        System.out.println("  set2 (LinkedHashSet) - insertion order preserved: " + set2);
    }

    // Demonstrates basic Set operations
    @Override
    public void demonstrateBasicSetOperations() {
        System.out.println("\n=== Basic Set Operations Demonstration ===");
        
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        List<String> list3 = prepareLists(list1, list2);
        
        HashSet<String> set1 = createSet1();
        addArbitraryStringsToSet(set1);
        addListsToSet(set1, list1, list2);
        printSetValues(set1, "Set1");
        
        LinkedHashSet<String> set2 = createSet2();
        addListsToLinkedHashSet(set2, list2, list3);
        printSetValues(set2, "Set2");
        compareSets(set1, set2);
    }

    // Creates HashSet<User> (userSet)
    private static HashSet<User> createUserSet() {
        HashSet<User> userSet = new HashSet<>();
        System.out.println("b. Created HashSet<User> userSet: " + userSet);
        return userSet;
    }

    // Creates User instances for demonstration
    private static User[] createUserInstances() {
        User user1 = new User("John", 25, "+1-555-0100");
        User user2 = new User("John", 25, "+1-555-0100");
        User user3 = new User("John", 30, "+1-555-0100");
        
        System.out.println("\nc. Created User instances:");
        System.out.println("   user1: " + user1);
        System.out.println("   user2: " + user2 + " (same fields as user1)");
        System.out.println("   user3: " + user3 + " (different age)");
        
        return new User[]{user1, user2, user3};
    }

    // Adds users to set and returns addition results
    private static boolean[] addUsersToSet(HashSet<User> userSet, User[] users) {
        System.out.println("\nd. Adding users to userSet...");
        boolean[] results = new boolean[users.length];
        for (int i = 0; i < users.length; i++) {
            results[i] = userSet.add(users[i]);
            System.out.println("   user" + (i + 1) + " added: " + results[i]);
        }
        return results;
    }

    // Prints users in set
    private static void printUsersInSet(HashSet<User> userSet) {
        System.out.println("\ne. Users in userSet:");
        userSet.forEach(user -> System.out.println("   " + user));
        System.out.println("   Set size: " + userSet.size());
    }

    // Prints hash codes of users
    private static void printHashCodes(User[] users) {
        System.out.println("\n   Hash codes:");
        for (int i = 0; i < users.length; i++) {
            System.out.println("   user" + (i + 1) + ".hashCode(): " + users[i].hashCode());
        }
    }

    // Explains hashCode() using only name field
    private static void explainNameOnlyHashCode(User[] users) {
        System.out.println("\nf. If hashCode() uses only name field:");
        System.out.println("   hashCode() would be: name.hashCode()");
        System.out.println("   In this case:");
        System.out.println("   - user1.hashCode() == user2.hashCode() == user3.hashCode() (all have name 'John')");
        System.out.println("   - HashSet would use equals() to check if they're the same");
        System.out.println("   - Since equals() checks all fields, user1 and user2 would be equal");
        System.out.println("   - user3 would be different (different age)");
        System.out.println("   - Result: userSet would contain user1 (or user2) and user3");
        
        System.out.println("\n   Simulating name-only hashCode() behavior:");
        HashSet<String> nameSet = new HashSet<>();
        nameSet.add(users[0].getName());
        nameSet.add(users[1].getName());
        nameSet.add(users[2].getName());
        System.out.println("   Unique names in set: " + nameSet);
        System.out.println("   (All users have same name 'John', so only one entry)");
    }

    // Prints current state of userSet
    private static void printCurrentUserSetState(HashSet<User> userSet) {
        System.out.println("\ng. Current users in userSet (with hashCode() using all fields):");
        userSet.forEach(user -> System.out.println("   " + user));
        System.out.println("   Set size: " + userSet.size());
        System.out.println("   Note: Current hashCode() uses all fields (name, old, phone)");
        System.out.println("   Therefore: user1 == user2 (same hashCode and equals), user3 is different");
    }

    // Explains hashCode() using all fields
    private static void explainAllFieldsHashCode() {
        System.out.println("\nh. Current hashCode() implementation uses all fields:");
        System.out.println("   hashCode() = name.hashCode() * 31^2 + old * 31 + phone.hashCode()");
        System.out.println("   In this case:");
        System.out.println("   - user1.hashCode() == user2.hashCode() (same name, old, phone)");
        System.out.println("   - user3.hashCode() != user1.hashCode() (different old/age)");
        System.out.println("   - Result: userSet contains user1 (or user2) and user3");
    }

    // Prints final state of userSet
    private static void printFinalUserSetState(HashSet<User> userSet) {
        System.out.println("\n   Final state of userSet:");
        userSet.forEach(user -> System.out.println("   " + user));
        System.out.println("   Set size: " + userSet.size());
    }

    // Shows equals() behavior
    private static void showEqualsBehavior(User[] users) {
        System.out.println("\n   Equals() checks:");
        System.out.println("   user1.equals(user2): " + users[0].equals(users[1]));
        System.out.println("   user1.equals(user3): " + users[0].equals(users[2]));
        System.out.println("   user2.equals(user3): " + users[1].equals(users[2]));
    }

    // Prints summary of hashCode() and equals() behavior
    private static void printHashCodeEqualsSummary() {
        System.out.println("\n   Summary:");
        System.out.println("   - hashCode() determines which bucket an object goes into");
        System.out.println("   - equals() determines if objects in the same bucket are duplicates");
        System.out.println("   - Both must be consistent: if equals() returns true, hashCode() must be equal");
        System.out.println("   - Current implementation: hashCode() uses all fields, so user1 and user2 are duplicates");
    }

    // Demonstrates working with User class in HashSet
    @Override
    public void demonstrateUserClassWithHashSet() {
        System.out.println("\n=== User Class with HashSet Demonstration ===");
        
        System.out.println("a. User class created with fields: name, old (age), phone");
        HashSet<User> userSet = createUserSet();
        User[] users = createUserInstances();
        addUsersToSet(userSet, users);
        printUsersInSet(userSet);
        printHashCodes(users);
        explainNameOnlyHashCode(users);
        printCurrentUserSetState(userSet);
        explainAllFieldsHashCode();
        printFinalUserSetState(userSet);
        showEqualsBehavior(users);
        printHashCodeEqualsSummary();
    }

    /**
     * Runs all Set demonstrations.
     */
    @Override
    public void demonstrateAll() {
        demonstrateHashSet();
        demonstrateLinkedHashSet();
        demonstrateTreeSet();
        demonstrateSetOperations();
        demonstrateUserSet();
        demonstrateBasicSetOperations();
        demonstrateUserClassWithHashSet();
    }
}
