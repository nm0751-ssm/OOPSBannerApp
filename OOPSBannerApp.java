/**
 * OOPS Banner App - Use Case 2: String Concatenation
 * 
 * This class demonstrates the OOPS Banner App using string concatenation.
 * UC2 displays the "OOPS" word as an ASCII art banner using the + operator.
 * 
 * Key Concepts:
 * - String concatenation with the + operator
 * - Hardcoded pattern strings for each line
 * - Multiple println() calls for multi-line output
 * 
 * Drawback: Creates intermediate String objects in memory due to immutability
 * 
 * @author Siva Sidvi Memidala
 * @version 2.0
 */
public class OOPSBannerApp {
    
    /**
     * Main method - Entry point of the application
     * Displays the "OOPS" banner using string concatenation.
     * 
     * @param args Command line arguments (not used in this version)
     */
    public static void main(String[] args) {
        // Line 1
        System.out.println("O   O" + "  " + "O   O" + "  " + "P P P" + "  " + "S S S");
        // Line 2
        System.out.println("O   O" + "  " + "O   O" + "  " + "P   P" + "  " + "  S");
        // Line 3
        System.out.println("O   O" + "  " + "O   O" + "  " + "P P P" + "  " + "    S");
        // Line 4
        System.out.println("O   O" + "  " + "O   O" + "  " + "P" + "      " + "    S");
        // Line 5
        System.out.println("O   O" + "  " + "O   O" + "  " + "P" + "      " + "S   S");
        // Line 6
        System.out.println("O   O" + "  " + "O   O" + "  " + "P" + "      " + "  S");
        // Line 7
        System.out.println(" O O " + "  " + " O O " + "  " + "P" + "      " + "S S S");
    }
}
