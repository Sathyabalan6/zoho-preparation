import java.util.*;

public class sortED {
    public static void sortOddEven(int[] nums) {

        int[] odd  = new int[nums.length / 2 + 1];
        int[] even = new int[nums.length / 2 + 1];

        int j = 0;
        int k = 0;


        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 1){
                odd[j] = nums[i];
                j++;
            }
            else{
                even[k] = nums[i];
                k++;
            }
        }
        Arrays.sort(odd);
        Arrays.sort(even);

        for(int i = 0; i < nums.length; i++){
            
        }

        // for(int i : odd){
        //     System.out.println(i);
        // }

        // for(int i : even){
        //     System.out.println(i);
        // }

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        sortOddEven(arr);
        //System.out.println()
    }
}


 // for(int i=0; i < nums.length; i+=2){
        //     odd[j] = nums[i]; 
        //     even[j] = nums[i + 1];
        //     j++;
        // }
        // int k =0;
        // for(int i = 0 ; i < nums.length; i+=2){
        //     nums[i] = odd[k];
        //     k++; 
        // }