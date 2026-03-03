/**
 * OOPS Banner App - Use Case 5: Array Initialization
 * 
 * This class demonstrates the OOPS Banner App using inline array initialization.
 * UC5 improves upon UC4 by combining array declaration and initialization
 * with String.join() method calls in a single statement.
 * 
 * Key Concepts:
 * - Inline array initialization with values
 * - String.join() calls directly in array initializer
 * - More concise and readable code
 * - Eliminates need for separate population statements
 * 
 * Improvement: More compact and readable code through inline initialization
 * 
 * @author Siva Sidvi Memidala
 * @version 5.0
 */
public class OOPSBannerApp {
    
    /**
     * Main method - Entry point of the application
     * Displays the "OOPS" banner using inline array initialization.
     * 
     * @param args Command line arguments (not used in this version)
     */
    public static void main(String[] args) {
        // Array with inline initialization using String.join() calls
        String[] bannerLines = {
            String.join("  ", "O   O", "O   O", "P P P", "S S S"),
            String.join("  ", "O   O", "O   O", "P   P", "S"),
            String.join("  ", "O   O", "O   O", "P P P", "S"),
            String.join("  ", "O   O", "O   O", "P", "S"),
            String.join("  ", "O   O", "O   O", "P", "S   S"),
            String.join("  ", "O   O", "O   O", "P", "S"),
            String.join("  ", "O O", "O O", "P", "S S S")
        };
        
        // Print banner using enhanced for-loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
