package Learning_Nine;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        System.out.println(first_missingPositive(nums));
        System.out.println(Arrays.toString(nums));
    }

    static int first_missingPositive(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] -1;
            if (arr[i]>0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else{
                i++;
            }    
        }

        for (int j = 0; j < arr.length; j++) {

            if (arr[j] != j+1) {
                return j+1;
            }
        }
        return arr.length + 1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
