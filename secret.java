import java.util.*;

public class SmallestSubstring {
    public static String minWindow(String message, String secret) {
        if (message == null || secret == null || message.length() < secret.length()) {
            return "";
        }
        
        int[] targetFreq = new int[128];
        for (char c : secret.toCharArray()) {
            targetFreq[c]++;
        }

        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int startIdx = 0;
        int count = 0; // Number of characters from secret currently in window

        while (right < message.length()) {
            char rChar = message.charAt(right);
            
            // If this char is needed for the secret, increment count
            if (targetFreq[rChar] > 0) {
                count++;
            }
            // Decrement frequency (even if it goes negative, it means we have extras)
            targetFreq[rChar]--;

            // When we have a valid window
            while (count == secret.length()) {
                // Update the best result
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    startIdx = left;
                }

                // Try to shrink from the left
                char lChar = message.charAt(left);
                targetFreq[lChar]++;
                
                // If the count drops, it means we lost a required character
                if (targetFreq[lChar] > 0) {
                    count--;
                }
                left++;
            }
            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : message.substring(startIdx, startIdx + minLen);
    }

    public static void main(String[] args) {
        String message = "ADOBECODEBANC";
        String secret = "ABC";
        System.out.println("Smallest Window: " + minWindow(message, secret));
        // Output: BANC
    }
}