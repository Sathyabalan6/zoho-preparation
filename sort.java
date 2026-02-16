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