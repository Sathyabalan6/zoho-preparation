import java.util.*;

class Unique {
    public void printUniqueWithIndices(int[] arr) {
        // Step 1: Find the max value to size the frequency array correctly
        int max = 0;
        for (int num : arr) if (num > max) max = num;

        int[] freq = new int[max + 1];

        // Step 2: Count frequencies
        for (int num : arr) {
            freq[num]++;
        }

        System.out.println("Unique Elements and their Indices:");

        // Step 3: Find elements with frequency 1 and search for their index
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 1) {
                // Now find where this number 'i' is in the original 'arr'
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == i) {
                        System.out.println("Value: " + i + " | Index: " + j);
                        break; // Move to the next unique element
                    }
                }
            }
        }
    }

    public static void main(String args[]) {
        int[] arr = {10, 10, 25, 36, 9, 87, 5, 4, 1, 1, 55, 8, 9, 5, 66, 5, 22, 10, 32, 65, 9, 8, 96};
        Unique u = new Unique();
        u.printUniqueWithIndices(arr);
    }
}