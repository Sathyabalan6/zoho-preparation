import java.util.*;
class substr {
    public static int lengthOfLongestSubstring(String s) {
        
        int count = 0;
        int[] arr = new int[128];
        int maximum = 0;
        int windowStart = 0;

        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i)]++;
            if(arr[s.charAt(i)] == 1){
                count++;
            }
            else{
                for(int j = windowStart; j < i; j++){
                    arr[s.charAt(j)]--;
                }
                windowStart = i;
                count = 1;
            }
            maximum = Math.max(maximum, count);
        } 
        
        return maximum; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("Length: " + lengthOfLongestSubstring(input));
    }
}