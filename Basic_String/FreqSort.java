import java.util.*;

class FreqSort {    
   public List<Character> frequencySort(String s) {
         Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        
        List<Character> uniqueChars = new ArrayList<>(freqMap.keySet());

        // Step 3: Sort by frequency (descending) and alphabetically
        Collections.sort(uniqueChars, (a, b) -> {
            int freqCompare = freqMap.get(b) - freqMap.get(a);
            if (freqCompare == 0) {
                return a - b;
            }
            return freqCompare;
        });

        return uniqueChars;
    }

    // Main method to test the function
    public static void main(String[] args) {
        FreqSort sol = new FreqSort();
        String s = "tree";
        List<Character> result = sol.frequencySort(s);
        System.out.println(result);
    }
}
