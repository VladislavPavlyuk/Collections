package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

/**
 * Lists class demonstrating various List collection operations.
 * Lists maintain insertion order and allow duplicate elements.
 */
public class Lists {

    /**
     * Demonstrates ArrayList operations.
     * ArrayList is backed by a dynamic array, providing fast random access.
     */
    public static void demonstrateArrayList() {
        System.out.println("\n=== ArrayList Demonstration ===");
        
        // Create an ArrayList
        List<String> arrayList = new ArrayList<>();
        
        // Add elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Apple"); // Duplicates are allowed
        
        System.out.println("Initial list: " + arrayList);
        System.out.println("Size: " + arrayList.size());
        
        // Access elements by index
        System.out.println("Element at index 1: " + arrayList.get(1));
        
        // Check if element exists
        System.out.println("Contains 'Banana': " + arrayList.contains("Banana"));
        
        // Remove element
        arrayList.remove("Cherry");
        System.out.println("After removing 'Cherry': " + arrayList);
        
        // Iterate through list
        System.out.print("Iterating: ");
        for (String fruit : arrayList) {
            System.out.print(fruit + " ");
        }
        System.out.println();
    }

    /**
     * Demonstrates LinkedList operations.
     * LinkedList is backed by a doubly-linked list, providing fast insertion/deletion.
     */
    public static void demonstrateLinkedList() {
        System.out.println("\n=== LinkedList Demonstration ===");
        
        // Create a LinkedList
        List<Integer> linkedList = new LinkedList<>();
        
        // Add elements
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.addFirst(5);  // Add at the beginning
        linkedList.addLast(40);  // Add at the end
        
        System.out.println("Initial list: " + linkedList);
        
        // Access first and last elements
        System.out.println("First element: " + linkedList.get(0));
        System.out.println("Last element: " + linkedList.get(linkedList.size() - 1));
        
        // Remove elements
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("After removing first and last: " + linkedList);
    }

    /**
     * Demonstrates Vector operations.
     * Vector is synchronized and thread-safe, similar to ArrayList.
     */
    public static void demonstrateVector() {
        System.out.println("\n=== Vector Demonstration ===");
        
        // Create a Vector
        Vector<String> vector = new Vector<>();
        
        // Add elements
        vector.add("Red");
        vector.add("Green");
        vector.add("Blue");
        vector.add("Yellow");
        
        System.out.println("Initial vector: " + vector);
        System.out.println("Capacity: " + vector.capacity());
        System.out.println("Size: " + vector.size());
        
        // Access element by index
        System.out.println("Element at index 2: " + vector.elementAt(2));
        
        // Remove element
        vector.remove("Green");
        System.out.println("After removing 'Green': " + vector);
    }

    /**
     * Demonstrates working with User objects in a List.
     */
    public static void demonstrateUserList() {
        System.out.println("\n=== List with User Objects ===");
        
        List<User> users = new ArrayList<>();
        
        // Create and add users
        users.add(new User("Alice", 25, "+1-555-0101"));
        users.add(new User("Bob", 30, "+1-555-0102"));
        users.add(new User("Charlie", 28, "+1-555-0103"));
        
        System.out.println("Users in list:");
        for (User user : users) {
            System.out.println("  " + user);
        }
        
        // Find user by phone
        String searchPhone = "+1-555-0102";
        User foundUser = users.stream()
                .filter(user -> user.getPhone().equals(searchPhone))
                .findFirst()
                .orElse(null);
        
        if (foundUser != null) {
            System.out.println("\nFound user: " + foundUser);
        }
    }

    /**
     * Demonstrates basic List operations including:
     * - Creating lists from arrays
     * - Initializing lists from other lists
     * - Using Arrays.asList()
     * - Inserting one list into another
     * - Sorting in descending order
     * - Removing elements using ListIterator
     */
    public static void demonstrateBasicListOperations() {
        System.out.println("\n=== Basic List Operations Demonstration ===");
        
        // a. Create ArrayList<String> (list1)
        ArrayList<String> list1 = new ArrayList<>();
        System.out.println("a. Created list1: " + list1);
        
        // b. Create an array of strings and add all elements to list (using one method)
        String[] stringArray = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
        Collections.addAll(list1, stringArray);
        System.out.println("b. Added array elements to list1: " + list1);
        System.out.println("   Array: " + Arrays.toString(stringArray));
        
        // c. Create a new ArrayList<String> (list2), initialized with the previous list
        ArrayList<String> list2 = new ArrayList<>(list1);
        System.out.println("c. Created list2 initialized with list1: " + list2);
        
        // d. Create a list (list3) using Arrays.asList(...)
        List<String> list3 = Arrays.asList("Xylophone", "Yacht", "Zebra");
        System.out.println("d. Created list3 using Arrays.asList(): " + list3);
        
        // e. Insert list3 into the middle of list2
        int middleIndex = list2.size() / 2;
        list2.addAll(middleIndex, list3);
        System.out.println("e. Inserted list3 into the middle of list2 (at index " + middleIndex + "): " + list2);
        
        // f. Sort the list in descending order
        Collections.sort(list2, Collections.reverseOrder());
        System.out.println("f. Sorted list2 in descending order: " + list2);
        
        // g. Remove every second element from the list using ListIterator
        System.out.println("\ng. Removing every second element using ListIterator:");
        System.out.println("   Before removal: " + list2);
        
        ListIterator<String> iterator = list2.listIterator();
        int index = 0;
        while (iterator.hasNext()) {
            iterator.next();
            // Remove every second element (indices 1, 3, 5, ...)
            if (index % 2 == 1) {
                iterator.remove();
                System.out.println("   Removed element at index " + index);
            }
            index++;
        }
        
        System.out.println("   After removal: " + list2);
        System.out.println("   Final size: " + list2.size());
    }

    /**
     * Runs all List demonstrations.
     */
    public static void demonstrateAll() {
        demonstrateArrayList();
        demonstrateLinkedList();
        demonstrateVector();
        demonstrateUserList();
        demonstrateBasicListOperations();
    }
}
