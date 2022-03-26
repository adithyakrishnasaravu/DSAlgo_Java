package Learning_Four;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        // Can store a returned value in sum2()
        // int ans = sum2();
        // System.out.println(ans);

        int ans = sum3(20, 30);
        System.out.println(ans);
    }

    // static int sum2() {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the first number: ");
    //     int num1 = sc.nextInt();
    //     System.out.print("Enter the second number: ");
    //     int num2 = sc.nextInt();
    //     int sum = num1 + num2 ;
    //     return sum;
    // }

    // pass the value of numbers when you are calling the method in main()
    static int sum3(int a , int b) {
        int sum = a + b;
        return sum;

    }


    // static void sum() {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the first number: ");
    //     int num1 = sc.nextInt();
    //     System.out.print("Enter the second number: ");
    //     int num2 = sc.nextInt();
    //     int sum = num1 + num2 ;
    //     System.out.println("the sum of the two numbers is " + sum);
    // }

    /*
        Format of a function:
        return_type name () {
            //body
            return statement;
        }
    */
    
}
