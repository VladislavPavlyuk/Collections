package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Sets class demonstrating various Set collection operations.
 * Sets do not allow duplicate elements and do not maintain index-based access.
 */
public class Sets {

    /**
     * Demonstrates HashSet operations.
     * HashSet does not maintain insertion order, provides O(1) average time complexity.
     */
    public static void demonstrateHashSet() {
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
    public static void demonstrateLinkedHashSet() {
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
    public static void demonstrateTreeSet() {
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
    public static void demonstrateSetOperations() {
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
    public static void demonstrateUserSet() {
        System.out.println("\n=== Set with User Objects ===");
        
        Set<User> userSet = new HashSet<>();
        
        // Create and add users
        User alice = new User("Alice", 25, "alice@example.com");
        User bob = new User("Bob", 30, "bob@example.com");
        User charlie = new User("Charlie", 28, "charlie@example.com");
        
        userSet.add(alice);
        userSet.add(bob);
        userSet.add(charlie);
        
        // Try to add duplicate (same email)
        User aliceDuplicate = new User("Alice", 25, "alice@example.com");
        userSet.add(aliceDuplicate);
        
        System.out.println("Users in set:");
        userSet.forEach(user -> System.out.println("  " + user));
        System.out.println("Size: " + userSet.size());
        System.out.println("Note: Duplicate user with same email was not added");
        
        // Check if user exists
        User searchUser = new User("Bob", 30, "bob@example.com");
        System.out.println("Contains Bob: " + userSet.contains(searchUser));
    }

    /**
     * Runs all Set demonstrations.
     */
    public static void demonstrateAll() {
        demonstrateHashSet();
        demonstrateLinkedHashSet();
        demonstrateTreeSet();
        demonstrateSetOperations();
        demonstrateUserSet();
    }
}
