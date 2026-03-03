/**
 * OOPS Banner App - Use Case 6: Static Functions
 * 
 * This class demonstrates the OOPS Banner App using static helper methods.
 * UC6 improves upon UC5 by encapsulating character patterns into reusable
 * static methods that generate pattern strings for each character (O, P, S).
 * 
 * Key Concepts:
 * - Static helper methods for pattern generation
 * - DRY (Don't Repeat Yourself) principle
 * - Modular and reusable design
 * - Abstraction of character patterns
 * 
 * Improvement: Better abstraction and code reusability through static methods
 * 
 * @author Siva Sidvi Memidala
 * @version 6.0
 */
public class OOPSBannerApp {
    
    /**
     * Generates the pattern for character 'O' at a specific line
     * @param line the line number (0-based)
     * @return the pattern string for 'O' at that line
     */
    private static String getOPattern(int line) {
        if (line == 6) {
            return "O O";
        }
        return "O   O";
    }
    
    /**
     * Generates the pattern for character 'P' at a specific line
     * @param line the line number (0-based)
     * @return the pattern string for 'P' at that line
     */
    private static String getPPattern(int line) {
        switch (line) {
            case 0: return "P P P";
            case 1: return "P   P";
            case 2: return "P P P";
            default: return "P";
        }
    }
    
    /**
     * Generates the pattern for character 'S' at a specific line
     * @param line the line number (0-based)
     * @return the pattern string for 'S' at that line
     */
    private static String getSPattern(int line) {
        switch (line) {
            case 0: return "S S S";
            case 1: return "S";
            case 2: return "S";
            case 3: return "S";
            case 4: return "S   S";
            case 5: return "S";
            case 6: return "S S S";
            default: return "";
        }
    }
    
    /**
     * Main method - Entry point of the application
     * Displays the "OOPS" banner using static helper methods.
     * 
     * @param args Command line arguments (not used in this version)
     */
    public static void main(String[] args) {
        // Array with inline initialization using static methods
        String[] bannerLines = new String[7];
        
        // Generate each line using static helper methods
        for (int i = 0; i < 7; i++) {
            bannerLines[i] = String.join("  ", 
                getOPattern(i), 
                getOPattern(i), 
                getPPattern(i), 
                getSPattern(i)
            );
        }
        
        // Print banner using enhanced for-loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
