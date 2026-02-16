class sort {

    public int[] weight(int[] arr){

        int[] arr_weight = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            int n = arr[i];
            if(isPerfectSquare(n)){
                arr_weight[i] = arr_weight[i] + 5 ; 
            }
            if (n % 4 == 0 && n % 6 == 0){
                arr_weight[i] = arr_weight[i] + 4 ;
            }
            if( n % 2 == 0){
                arr_weight[i] = arr_weight[i] + 3;
            }
        }
        return arr_weight;
    }

    public static boolean isPerfectSquare(int n){
        double sqr = Math.sqrt(n);
        int x = (int) sqr;
        return x * x == n ;
    }

    public static void main(String[] args){

        int[] arr = { 10 , 36 , 54 , 89 , 12};
        sort s = new sort();
        int[] result = s.weight(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.println(arr[i] + " → Weight: " + result[i]);
        }
        
    }
}


/* 1. 5 if a perfect square     
2. 4 if multiple of 4 and divisible by 6
3. 3 if even number */

/*
import java.util.*;

public class NumberWeightSort {
    
    // Function to check if a number is a perfect square
    static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
    
    // Function to calculate weight of a number
    static int calculateWeight(int num) {
        int weight = 0;
        
        // Condition 1: 5 if perfect square
        if (isPerfectSquare(num)) {
            weight += 5;
        }
        
        // Condition 2: 4 if multiple of 4 AND divisible by 6
        if (num % 4 == 0 && num % 6 == 0) {
            weight += 4;
        }
        
        // Condition 3: 3 if even number
        if (num % 2 == 0) {
            weight += 3;
        }
        
        return weight;
    }
    
    public static void main(String[] args) {
        int[] numbers = {10, 36, 54, 89, 12};
        
        // Create array to store number and its weight
        int[][] numWeight = new int[numbers.length][2];
        
        // Calculate weights
        for (int i = 0; i < numbers.length; i++) {
            numWeight[i][0] = numbers[i];
            numWeight[i][1] = calculateWeight(numbers[i]);
        }
        
        // Sort based on weight (increasing order)
        Arrays.sort(numWeight, (a, b) -> a[1] - b[1]);
        
        // Print result
        for (int i = 0; i < numWeight.length; i++) {
            System.out.print("<" + numWeight[i][0] + "," + numWeight[i][1] + ">");
            if (i < numWeight.length - 1) {
                System.out.print(",");
            }
        }
    }
}

//<89,0>,<10,3>,<54,7>,<12,7>,<36,12> */
