/**
 * OOPS Banner App - Use Case 7: Character Pattern Class
 * 
 * This class demonstrates the OOPS Banner App using a static inner class
 * to encapsulate character patterns. UC7 transitions from procedural static
 * methods to an Object-Oriented approach with dedicated data structures.
 * 
 * Key Concepts:
 * - Static inner class for encapsulating character data
 * - Object-oriented design for pattern management
 * - Single Responsibility Principle
 * - Improved scalability and maintainability
 * 
 * Improvement: Better OOP design using dedicated classes for data management
 * 
 * @author Siva Sidvi Memidala
 * @version 7.0
 */
public class OOPSBannerApp {
    
    /**
     * Static inner class to encapsulate character pattern data
     */
    static class CharacterPatternMap {
        private char character;
        private String[] patterns;
        
        /**
         * Constructor for CharacterPatternMap
         * @param character the character represented
         * @param patterns array of strings for each line
         */
        public CharacterPatternMap(char character, String[] patterns) {
            this.character = character;
            this.patterns = patterns;
        }
        
        /**
         * Gets the pattern for a specific line
         * @param line the line number (0-based)
         * @return the pattern string for that line
         */
        public String getPattern(int line) {
            if (line >= 0 && line < patterns.length) {
                return patterns[line];
            }
            return "";
        }
        
        /**
         * Gets the character
         * @return the character
         */
        public char getCharacter() {
            return character;
        }
    }
    
    /**
     * Initializes character patterns for the letters O, O, P, S
     * @return array of CharacterPatternMap objects
     */
    private static CharacterPatternMap[] initializePatterns() {
        CharacterPatternMap[] maps = new CharacterPatternMap[4];
        
        // First O pattern
        maps[0] = new CharacterPatternMap('O', new String[]{
            "O   O", "O   O", "O   O", "O   O", "O   O", "O   O", "O O"
        });
        
        // Second O pattern
        maps[1] = new CharacterPatternMap('O', new String[]{
            "O   O", "O   O", "O   O", "O   O", "O   O", "O   O", "O O"
        });
        
        // P pattern
        maps[2] = new CharacterPatternMap('P', new String[]{
            "P P P", "P   P", "P P P", "P", "P", "P", "P"
        });
        
        // S pattern
        maps[3] = new CharacterPatternMap('S', new String[]{
            "S S S", "S", "S", "S", "S   S", "S", "S S S"
        });
        
        return maps;
    }
    
    /**
     * Main method - Entry point of the application
     * Displays the "OOPS" banner using CharacterPatternMap class.
     * 
     * @param args Command line arguments (not used in this version)
     */
    public static void main(String[] args) {
        // Initialize character patterns
        CharacterPatternMap[] patterns = initializePatterns();
        
        // Build and display the banner
        for (int line = 0; line < 7; line++) {
            StringBuilder bannerLine = new StringBuilder();
            for (int i = 0; i < patterns.length; i++) {
                if (i > 0) {
                    bannerLine.append("  ");
                }
                bannerLine.append(patterns[i].getPattern(line));
            }
            System.out.println(bannerLine.toString());
        }
    }
}
