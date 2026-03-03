/**
 * OOPS Banner App - Use Case 3: String.join()
 * 
 * This class demonstrates the OOPS Banner App using String.join() method.
 * UC3 improves upon UC2 by using String.join() for better memory efficiency.
 * 
 * Key Concepts:
 * - String.join() method for memory-efficient string concatenation
 * - Reduced intermediate String objects in memory
 * - Better performance for multi-part string construction
 * 
 * Improvement: Reduces memory footprint by avoiding intermediate objects
 * 
 * @author Siva Sidvi Memidala
 * @version 3.0
 */
public class OOPSBannerApp {
    
    /**
     * Main method - Entry point of the application
     * Displays the "OOPS" banner using String.join() method.
     * 
     * @param args Command line arguments (not used in this version)
     */
    public static void main(String[] args) {
        // Line 1
        System.out.println(String.join("  ", "O   O", "O   O", "P P P", "S S S"));
        // Line 2
        System.out.println(String.join("  ", "O   O", "O   O", "P   P", "S"));
        // Line 3
        System.out.println(String.join("  ", "O   O", "O   O", "P P P", "S"));
        // Line 4
        System.out.println(String.join("  ", "O   O", "O   O", "P", "S"));
        // Line 5
        System.out.println(String.join("  ", "O   O", "O   O", "P", "S   S"));
        // Line 6
        System.out.println(String.join("  ", "O   O", "O   O", "P", "S"));
        // Line 7
        System.out.println(String.join("  ", "O O", "O O", "P", "S S S"));
    }
}
