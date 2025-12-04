import collections.IListDemonstrator;
import collections.IMapDemonstrator;
import collections.ISetDemonstrator;
import collections.Lists;
import collections.Maps;
import collections.Sets;

 // Main class demonstrating Java Collections Framework.
public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("Java Collections Framework Demonstration");
        System.out.println("========================================");


        // Demonstrate Lists using interface
        System.out.println("\n" + "=".repeat(50));
        System.out.println("LISTS DEMONSTRATION");
        System.out.println("=".repeat(50));
        IListDemonstrator listDemonstrator = new Lists();
        listDemonstrator.demonstrateAll();


        // Demonstrate Sets using interface
        System.out.println("\n" + "=".repeat(50));
        System.out.println("SETS DEMONSTRATION");
        System.out.println("=".repeat(50));
        ISetDemonstrator setDemonstrator = new Sets();
        setDemonstrator.demonstrateAll();


        // Demonstrate Maps using interface
        System.out.println("\n" + "=".repeat(50));
        System.out.println("MAPS DEMONSTRATION");
        System.out.println("=".repeat(50));
        IMapDemonstrator mapDemonstrator = new Maps();
        mapDemonstrator.demonstrateAll();


        System.out.println("\n" + "=".repeat(50));
        System.out.println("Demonstration completed successfully!");
        System.out.println("=".repeat(50));
    }
}
