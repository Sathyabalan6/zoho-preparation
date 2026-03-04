import java.util.*;

public class sortED {
    public static void sortOddEven(int[] nums) {
        int[] odd = new int[nums.length];
        int[] even = new int[nums.length];

        int j = 0; // count for odds
        int k = 0; // count for evens

        // 1. Separate the numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) { // Using != 0 handles negative odd numbers too
                odd[j++] = nums[i];
            } else {
                even[k++] = nums[i];
            }
        }

        // 2. Sort Odds (Ascending)
        // We only sort the part of the array we actually filled
        Arrays.sort(odd, 0, j);

        // 3. Sort Evens (Descending)
        // Easiest way: Sort ascending first, then reverse
        Arrays.sort(even, 0, k);
        for (int i = 0; i < k / 2; i++) {
            int temp = even[i];
            even[i] = even[k - 1 - i];
            even[k - 1 - i] = temp;
        }
        for (int i = 0; i < j; i++) {
            nums[i] = odd[i];
        }
        for (int i = 0; i < k; i++) {
            nums[j + i] = even[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        sortOddEven(arr);
        
        System.out.println("Sorted (Odds Asc, Evens Desc):");
        System.out.println(Arrays.toString(arr));
    }
}