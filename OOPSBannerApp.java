/**
 * OOPS Banner App - Use Case 8: HashMap & Render
 * 
 * This class demonstrates the OOPS Banner App using HashMap for pattern storage
 * and retrieval. UC8 is the final use case that combines all concepts from
 * previous iterations into a highly maintainable and scalable solution.
 * 
 * Key Concepts:
 * - HashMap for efficient pattern lookup and management
 * - Centralized pattern storage accessible by character
 * - Separation of pattern storage and display logic
 * - Advanced OOP principles (encapsulation, abstraction)
 * - Nested loops for rendering assembled banner
 * 
 * Improvement: Most efficient and scalable approach using HashMap
 * 
 * @author Siva Sidvi Memidala
 * @version 8.0
 */
import java.util.HashMap;
import java.util.Map;

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
     * Initializes the character pattern map using HashMap
     * @return HashMap with character keys and CharacterPatternMap values
     */
    private static Map<Character, CharacterPatternMap> initializePatternMap() {
        Map<Character, CharacterPatternMap> patternMap = new HashMap<>();
        
        // O pattern
        patternMap.put('O', new CharacterPatternMap('O', new String[]{
            "O   O", "O   O", "O   O", "O   O", "O   O", "O   O", "O O"
        }));
        
        // P pattern
        patternMap.put('P', new CharacterPatternMap('P', new String[]{
            "P P P", "P   P", "P P P", "P", "P", "P", "P"
        }));
        
        // S pattern
        patternMap.put('S', new CharacterPatternMap('S', new String[]{
            "S S S", "S", "S", "S", "S   S", "S", "S S S"
        }));
        
        return patternMap;
    }
    
    /**
     * Renders the banner using character sequence from a word
     * @param word the word to display (e.g., "OOPS")
     * @param patternMap the map containing character patterns
     */
    private static void renderBanner(String word, Map<Character, CharacterPatternMap> patternMap) {
        // Render each line of the banner
        for (int line = 0; line < 7; line++) {
            StringBuilder bannerLine = new StringBuilder();
            
            // For each character in the word
            for (int charIndex = 0; charIndex < word.length(); charIndex++) {
                char currentChar = word.charAt(charIndex);
                
                // Add separator between characters
                if (charIndex > 0) {
                    bannerLine.append("  ");
                }
                
                // Get pattern for current character and line
                CharacterPatternMap patternObj = patternMap.get(currentChar);
                if (patternObj != null) {
                    bannerLine.append(patternObj.getPattern(line));
                }
            }
            
            System.out.println(bannerLine.toString());
        }
    }
    
    /**
     * Main method - Entry point of the application
     * Displays the "OOPS" banner using HashMap-based pattern management.
     * 
     * @param args Command line arguments (not used in this version)
     */
    public static void main(String[] args) {
        // Initialize pattern map
        Map<Character, CharacterPatternMap> patternMap = initializePatternMap();
        
        // Render the banner
        renderBanner("OOPS", patternMap);
    }
}
