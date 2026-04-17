import java.util.HashSet;

public class Main {
    public static int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            // Agar character repeat ho raha hai
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left)); // Left side se hatao
                left++; // Window choti karo
            }
            
            // Naya character add karo
            set.add(s.charAt(right));
            
            // Max length update karo
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String test = "abcabcbb";
        System.out.println("Longest Substring Length: " + lengthOfLongestSubstring(test));
        // Answer should be 3 (for "abc")
    }
}
