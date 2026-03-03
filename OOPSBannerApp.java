/**
 * OOPS Banner App - Use Case 4: Array & Loops
 * 
 * This class demonstrates the OOPS Banner App using arrays and loops.
 * UC4 improves upon UC3 by storing banner lines in a String array and
 * using a loop to print them instead of multiple individual print statements.
 * 
 * Key Concepts:
 * - String array for storing banner lines
 * - Enhanced for-loop for clean output traversal
 * - Better modularity and reusability
 * - Centralized data structure for banner patterns
 * 
 * Improvement: Better modularity through arrays and loops
 * 
 * @author Siva Sidvi Memidala
 * @version 4.0
 */
public class OOPSBannerApp {
    
    /**
     * Main method - Entry point of the application
     * Displays the "OOPS" banner using arrays and enhanced for-loop.
     * 
     * @param args Command line arguments (not used in this version)
     */
    public static void main(String[] args) {
        // Array to store banner lines
        String[] bannerLines = new String[7];
        
        // Populate the array with banner lines
        bannerLines[0] = String.join("  ", "O   O", "O   O", "P P P", "S S S");
        bannerLines[1] = String.join("  ", "O   O", "O   O", "P   P", "S");
        bannerLines[2] = String.join("  ", "O   O", "O   O", "P P P", "S");
        bannerLines[3] = String.join("  ", "O   O", "O   O", "P", "S");
        bannerLines[4] = String.join("  ", "O   O", "O   O", "P", "S   S");
        bannerLines[5] = String.join("  ", "O   O", "O   O", "P", "S");
        bannerLines[6] = String.join("  ", "O O", "O O", "P", "S S S");
        
        // Print banner using enhanced for-loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
