import java.util.*;

class palindrom{

    public static ArrayList<String> ispalin(String str){
        
        StringBuilder word = new StringBuilder(str);
        ArrayList<String> result  = new ArrayList<>();

        for(int i = 0 ; i < str.length(); i++){
            for(int j = i; j < str.length(); j++){
                String new_one = str.substring(i , j + 1);

                if(ispal(new_one) && new_one.length() > 1){
                    result.add(new_one);
                }
            }
        }

        return result;
        
    }

    public static boolean ispal(String str){
        
        int l = 0; 
        int r = str.length()-1;

        while(l < r){
            char a1 = str.charAt(l);
            char b1 = str.charAt(r);
            if( a1 != b1){
                return false;
            }
            else{
                l++;
                r--;
            }

        }
        return true;
    }
    
    public static void main(String[] args){
        String str = "abbaeae";
        ArrayList<String> arr = new ArrayList<>();
        arr = ispalin(str);

        System.out.println(arr);

        // for(String s : arr){
        //     System.out.println(arr);
        // }

    }
}