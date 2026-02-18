import java.util.Arrays;

class second {
    public static int getSecondLargest(int[] nums) {
        if (nums.length < 2) return -1; // Or throw exception

        int largest = nums[0];
        int secondLargest = -1;
        int max =0;

        for(int  i=1 ; i < nums.length; i++){
            if(largest < nums[i]){
                secondLargest = largest;
                largest = nums[i];
            }
            else if(nums[i] > secondLargest && nums[i] != largest){
                secondLargest = nums[i];
            }
        }
        
        return secondLargest;
    }

    public static void main(String[] args) {
        //Solution sol = new Solution();

        // Test Cases to cover all edge cases
        int[] case1 = {12, 35, 1, 10, 34, 1};       // Standard: Should return 34
        int[] case2 = {10, 10, 10};                // All same: Should return -1 (no 2nd largest)
        int[] case3 = {10, 5};                     // Only two: Should return 5
        int[] case4 = {-1, -2, -3, -4};            // Negatives: Should return -2

        System.out.println("Test 1 (34): " + getSecondLargest(case1));
        System.out.println("Test 2 (-1): " + getSecondLargest(case2));
        System.out.println("Test 3 (5): " + getSecondLargest(case3));
        System.out.println("Test 4 (-2): " + getSecondLargest(case4));
    }
}