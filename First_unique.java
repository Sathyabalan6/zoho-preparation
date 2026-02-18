class First_unique{


    public static int unique(String str){
        int[] count = new int[26];
        for(char c : str.toCharArray()){
            count[c - 'a']++;
        }
        for(int i =0; i < count.length; i++){
            if(count[str.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args){
        String str = "sasath";
        int index = unique(str);
        System.out.println(index);
    }
}