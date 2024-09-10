package oops;
import java.util.HashMap;

public class stringvowels {

    public static HashMap<Character, Integer> countVowels(String input) {
        // Create a HashMap to store the count of each vowel
        HashMap<Character, Integer> vowelCountMap = new HashMap<>();
        
        // Initialize the HashMap with the vowels and set their counts to 0
        vowelCountMap.put('a', 0);
        vowelCountMap.put('e', 0);
        vowelCountMap.put('i', 0);
        vowelCountMap.put('o', 0);
        vowelCountMap.put('u', 0);
        
        // Convert the string to a character array
        char[] strArray = input.toCharArray();
        
        // Iterate over each character in the array
        for (char c : strArray) {
            // If the character is a vowel, increment its count in the HashMap
            if (vowelCountMap.containsKey(c)) {
                vowelCountMap.put(c, vowelCountMap.get(c) + 1);
            }
        }
        
        return vowelCountMap;
    }
    
    public static void main(String[] args) {
        String inputString = "hello world";
        HashMap<Character, Integer> result = countVowels(inputString);
        
        // Print the result
        for (HashMap.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

