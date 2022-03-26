package Learning_Five_Arrays;

import java.util.Arrays;

public class Column_NoFixedSize {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 3, 6, 8},
            {6, 9, 15},
            {4, 6, 7, 9, 10, 14},
            {69, 75, 14, 36}
        };

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
