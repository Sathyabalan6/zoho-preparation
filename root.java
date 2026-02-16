import java.util.*;
class root {


    public double root_sqr(int n){
        // double l = 0;
        // double r = n;
        // while (l < r){
        //     double  mid = (l + r) / 2 ;

        //     if(mid * mid == n ){
        //         return mid;
        //     }
        //     if(mid * mid < n){
        //         l = mid + 1 ;
        //     }
        //     if(mid * mid > n){
        //         r = mid - 1; 
        //     }
        // }
        // return 0;

        if(n < 0 ) return 0;
        if( n == 0 || n == 1 ) return 1;

        double guess = n ;
        double nextguess = ( guess + n / guess) / 2.0 ; 

        while( nextguess != guess){
            guess = nextguess;
            nextguess = (guess + n / guess) / 2.0 ; 
        }
        return guess;
    }



    public static void main(String[] args){
        root r = new root();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int a = sc.nextInt();
        double root_of = r.root_sqr(a);
        System.out.println(root_of);
    }
}