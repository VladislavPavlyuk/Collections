package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

 //Lists class demonstrating various List collection operations.
 // Lists maintain insertion order and allow duplicate elements.

public class Lists implements IListDemonstrator {

    // Creates ArrayList with sample elements
    private static List<String> createArrayList() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Apple");
        return arrayList;
    }

    // Prints list information
    private static void printListInfo(List<String> list) {
        System.out.println("Initial list: " + list);
        System.out.println("Size: " + list.size());
    }

    // Accesses element by index
    private static void accessElementByIndex(List<String> list, int index) {
        System.out.println("Element at index " + index + ": " + list.get(index));
    }

    // Checks if element exists
    private static void checkElementExists(List<String> list, String element) {
        System.out.println("Contains '" + element + "': " + list.contains(element));
    }

    // Removes element from list
    private static void removeElement(List<String> list, String element) {
        list.remove(element);
        System.out.println("After removing '" + element + "': " + list);
    }

    // Iterates through list
    private static void iterateList(List<String> list) {
        System.out.print("Iterating: ");
        for (String fruit : list) {
            System.out.print(fruit + " ");
        }
        System.out.println();
    }

    // Demonstrates ArrayList operations
    @Override
    public void demonstrateArrayList() {
        System.out.println("\n=== ArrayList Demonstration ===");
        
        List<String> arrayList = createArrayList();
        printListInfo(arrayList);
        accessElementByIndex(arrayList, 1);
        checkElementExists(arrayList, "Banana");
        removeElement(arrayList, "Cherry");
        iterateList(arrayList);
    }

     // Demonstrates LinkedList operations.
     // LinkedList is backed by a doubly-linked list, providing fast insertion/deletion.

    @Override
    public void demonstrateLinkedList() {
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

     // Demonstrates Vector operations.
     // Vector is synchronized and thread-safe, similar to ArrayList.

    @Override
    public void demonstrateVector() {
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

    // Creates and returns a list of users
    private static List<User> createUserList() {
        List<User> users = new ArrayList<>();
        users.add(new User("Maria", 25, "+38-555-0101"));
        users.add(new User("Anna", 30, "+38-555-0102"));
        users.add(new User("Mykola", 28, "+38-555-0103"));
        return users;
    }

    // Prints all users in the list
    private static void printUsers(List<User> users) {
        System.out.println("Users in list:");
        for (User user : users) {
            System.out.println("  " + user);
        }
    }

    // Finds user by phone number
    private static User findUserByPhone(List<User> users, String phone) {
        return users.stream()
                .filter(user -> user.getPhone().equals(phone))
                .findFirst()
                .orElse(null);
    }

    // Demonstrates working with User objects in a List
    @Override
    public void demonstrateUserList() {
        System.out.println("\n=== List with User Objects ===");
        
        List<User> users = createUserList();
        printUsers(users);
        
        String searchPhone = "+38-555-0102";
        User foundUser = findUserByPhone(users, searchPhone);
        if (foundUser != null) {
            System.out.println("\nFound user: " + foundUser);
        }
    }

    // Creates and returns ArrayList<String> (list1)
    private static ArrayList<String> createList1() {
        ArrayList<String> list1 = new ArrayList<>();
        System.out.println("a. Created list1: " + list1);
        return list1;
    }

    // Adds all elements from array to list using Collections.addAll
    private static void addArrayElementsToList(ArrayList<String> list, String[] array) {
        Collections.addAll(list, array);
        System.out.println("b. Added array elements to list1: " + list);
        System.out.println("   Array: " + Arrays.toString(array));
    }

    // Creates a new ArrayList initialized with another list
    private static ArrayList<String> createList2FromList1(ArrayList<String> list1) {
        ArrayList<String> list2 = new ArrayList<>(list1);
        System.out.println("c. Created list2 initialized with list1: " + list2);
        return list2;
    }

    // Creates a list using Arrays.asList
    private static List<String> createList3WithArraysAsList() {
        List<String> list3 = Arrays.asList("Xylophone", "Yacht", "Zebra");
        System.out.println("d. Created list3 using Arrays.asList(): " + list3);
        return list3;
    }

    // Inserts one list into the middle of another list
    private static void insertListIntoMiddle(ArrayList<String> targetList, List<String> sourceList) {
        int middleIndex = targetList.size() / 2;
        targetList.addAll(middleIndex, sourceList);
        System.out.println("e. Inserted list3 into the middle of list2 (at index " + middleIndex + "): " + targetList);
    }

    // Sorts list in descending order
    private static void sortListDescending(ArrayList<String> list) {
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("f. Sorted list2 in descending order: " + list);
    }

    // Removes every second element from list using ListIterator
    private static void removeEverySecondElement(ArrayList<String> list) {
        System.out.println("\ng. Removing every second element using ListIterator:");
        System.out.println("   Before removal: " + list);
        
        ListIterator<String> iterator = list.listIterator();
        int index = 0;
        while (iterator.hasNext()) {
            iterator.next();
            if (index % 2 == 1) {
                iterator.remove();
                System.out.println("   Removed element at index " + index);
            }
            index++;
        }
        
        System.out.println("   After removal: " + list);
        System.out.println("   Final size: " + list.size());
    }

    // Demonstrates basic List operations
    @Override
    public void demonstrateBasicListOperations() {
        System.out.println("\n=== Basic List Operations Demonstration ===");
        
        ArrayList<String> list1 = createList1();
        String[] stringArray = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
        addArrayElementsToList(list1, stringArray);
        
        ArrayList<String> list2 = createList2FromList1(list1);
        List<String> list3 = createList3WithArraysAsList();
        insertListIntoMiddle(list2, list3);
        sortListDescending(list2);
        removeEverySecondElement(list2);
    }

     // Runs all List demonstrations.

    @Override
    public void demonstrateAll() {
        demonstrateArrayList();
        demonstrateLinkedList();
        demonstrateVector();
        demonstrateUserList();
        demonstrateBasicListOperations();
    }
}
