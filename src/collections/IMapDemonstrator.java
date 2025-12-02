package collections;

import java.util.Map;

//Interface for demonstrating Map collection operations.

public interface IMapDemonstrator {
    
    // Demonstrates HashMap operations.
    void demonstrateHashMap();
    
    // Demonstrates LinkedHashMap operations.
    void demonstrateLinkedHashMap();
    
    //Demonstrates TreeMap operations.
    void demonstrateTreeMap();
    
    // Demonstrates working with User objects as Map values.
    void demonstrateUserMap();
    
    //Helper method to print all elements of a map using EntrySet.
    void printMapEntries(Map<Integer, String> map, String mapName);
    
    //Demonstrates basic Map operations.
    void demonstrateBasicMapOperations();
    
    //Runs all Map demonstrations.
    void demonstrateAll();
}


