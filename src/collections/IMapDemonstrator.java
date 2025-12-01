package collections;

import java.util.Map;

/**
 * Interface for demonstrating Map collection operations.
 * Maps store key-value pairs and do not allow duplicate keys.
 */
public interface IMapDemonstrator {
    
    /**
     * Demonstrates HashMap operations.
     */
    void demonstrateHashMap();
    
    /**
     * Demonstrates LinkedHashMap operations.
     */
    void demonstrateLinkedHashMap();
    
    /**
     * Demonstrates TreeMap operations.
     */
    void demonstrateTreeMap();
    
    /**
     * Demonstrates working with User objects as Map values.
     */
    void demonstrateUserMap();
    
    /**
     * Helper method to print all elements of a map using EntrySet.
     *
     * @param map the map to print
     * @param mapName the name of the map for display purposes
     */
    void printMapEntries(Map<Integer, String> map, String mapName);
    
    /**
     * Demonstrates basic Map operations.
     */
    void demonstrateBasicMapOperations();
    
    /**
     * Runs all Map demonstrations.
     */
    void demonstrateAll();
}

