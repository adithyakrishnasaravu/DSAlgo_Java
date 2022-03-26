package Learning_Six_LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {45, 23, 54},
            {12, 56, 45, 423, 340},
            {34, 89, 10},
            {18, 2}
        };
        //For search()
        //int target = 34;
        // int[] ans = search(arr, target); //format of return value {row, col}
        // System.out.println(Arrays.toString(ans));

        //For max()
        System.out.println("The maximum value in the 2D Array is " + max(arr));

        //For min()
        System.out.println("The minimum value in the 2D Array is " + min(arr));
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    //for finding maximum in 2D Array
    static int max(int[][] arr) {
        int maximum = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > maximum) {
                    maximum = arr[row][col];
                }
            }
        }
        return maximum;
    }

    //for finding minimum value in 2D Array
    static int min(int[][] arr) {
        int minimum = Integer.MAX_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] < minimum) {
                    minimum = arr[row][col];
                }
            }
        }
        return minimum;
    }


}
