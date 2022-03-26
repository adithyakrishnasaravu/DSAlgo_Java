package Learning_Two;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Fibonacchi
        // 0 1 1 2 3 5 8 13 21

        // int n = sc.nextInt();
        // int a = 0;
        // int b = 1;
        // int count = 2;


        // while (count <= n){
        //     int temp = b;
        //     b = a + b;
        //     a = temp;
        //     count++;
        //     System.out.println(b);
        // }

        // Find out how many times is '5' present in 84567455.
        // int num = 846747689;

        // int count = 0;
        // while (num > 0) {
        //     int rem = num%10;

        //     if (rem == 5){
        //         count++;
        //     }
        //     num = num / 10;
        // }
        // System.out.println(count);


        // Find reverse of the number 23597
        // Solution 1
        // int num = 23597;
        // while (num > 0) {
        //     int rem = num%10;
        //     System.out.print(rem);
        //     num = num / 10;
        //     if (num <= 0){
        //         break;
        //     }
        // }

        // Solution 2
        int num = 23597;
        int ans = 0;
        while (num > 0){
            int rem = num % 10;
            num /= 10;

            ans = ans*10 +rem;
        }

        System.out.println(ans);
    }
    
}