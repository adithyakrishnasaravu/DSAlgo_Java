package Learning_Five_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /* Matrix format
            1 2 3
            4 5 6
            7 8 9
        */
        Scanner sc = new Scanner(System.in);
        // int[][] arr = new int[3][];

        // int [][] arr2d = {
        //     {1,3,3}, //0the index
        //     {4,5}, //1st index
        //     {3,5,7,8,9} //2nd index ->arr2d[1] = {4,5}
        // };

        int[][] arr = new int[3][4];

        //input
        for (int row = 0; row < arr.length; row++) {
            //length of array refers to number of rows
            //for each column in every row take input so,
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
                //System.out.print(arr[row][col] + " ");
            }
            //System.out.println();
        }

        //output
        // for (int row = 0; row < arr.length; row++) {
        //     System.out.println(Arrays.toString(arr[row]));
        // }

        //output as enhanced for loop
        for (int[]  a: arr){
            System.out.println(Arrays.toString(a));
        }
    }   
}
