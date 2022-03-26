package Learning_Five_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        //array of primitives
        // arr[0] = 23;
        // arr[1] = 45;
        // arr[2] = 34;
        // arr[3] = 56;
        // arr[4] = 64;
        // System.out.println(arr);

        // input using for loop

        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }

        // for (int j = 0; j < arr.length; j++) {
        //     System.out.print(arr[j] + " ");
        // }

        // for (int num : arr){ // for every element of the arrat, print the element.
        //     System.out.print(num); // here num represents element of the array
        // }

        // array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }

        //modify
        str[1] = "Adithya";
        System.out.println(Arrays.toString(str));
    }
}
