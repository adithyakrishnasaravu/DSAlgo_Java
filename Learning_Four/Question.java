package Learning_Four;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // To be run for isPrime() function
        // int n = sc.nextInt();
        // boolean ans = isPrime(n);
        // System.out.println(ans);


        // to be run for armstrong() function
        // for (int i = 100; i < 1000; i++) {
        //     if (armstrong(i)){
        //         System.out.println(i + " ");
        //     }
        // }
    }

    // Function to print all the three digit armstrong numbers
    static boolean armstrong(int a){
        int original = a;
        int sum = 0;
        while (a > 0){
            int dig = a%10;
            sum = sum + dig * dig * dig;
            a /= 10;
            //System.out.println(dig);
            
        }
        return sum == original ;
        
    }

    // Function to check prime numbers
    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        int c = 2;
        while (n >= c * c) {
            if (n%c == 0){
                return false;
            }
            c++;
        }
        return c * c > n ;
    }
}
