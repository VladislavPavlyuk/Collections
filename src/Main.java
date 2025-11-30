import collections.Lists;
import collections.Maps;
import collections.Sets;

/**
 * Main class demonstrating Java Collections Framework.
 * This application showcases Lists, Maps, and Sets with various examples.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("Java Collections Framework Demonstration");
        System.out.println("========================================");
        
        // Demonstrate Lists
        System.out.println("\n" + "=".repeat(50));
        System.out.println("LISTS DEMONSTRATION");
        System.out.println("=".repeat(50));
        Lists.demonstrateAll();
        
        // Demonstrate Maps
        System.out.println("\n" + "=".repeat(50));
        System.out.println("MAPS DEMONSTRATION");
        System.out.println("=".repeat(50));
        Maps.demonstrateAll();
        
        // Demonstrate Sets
        System.out.println("\n" + "=".repeat(50));
        System.out.println("SETS DEMONSTRATION");
        System.out.println("=".repeat(50));
        Sets.demonstrateAll();
        
        System.out.println("\n" + "=".repeat(50));
        System.out.println("Demonstration completed successfully!");
        System.out.println("=".repeat(50));
    }
}
