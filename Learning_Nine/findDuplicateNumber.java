package Learning_Nine;

import java.util.ArrayList;
import java.util.Arrays;

public class findDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {3,2,2};
        // System.out.println(duplicateNumber(nums));
        // System.out.println(Arrays.toString(nums));
        // System.out.println(allDuplicateNums(nums));
        System.out.println(Arrays.toString(setMismatch(nums)));
    }

    static int duplicateNumber(int[] arr){
        int i = 0;
        while (i < arr.length) {

            if (arr[i] != i + 1) {
                int correct = arr[i] - 1 ;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else{
                    return arr[i];
                }
            }
            else{
                i++;
            }    
        }
        
        return -1;
    }

    static ArrayList<Integer> allDuplicateNums(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else{
                i++;
            }    
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1) {
                list.add(arr[j]);
            }
        }        
        return list;
    }


    static int[] setMismatch(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1 ;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else{
                i++;
            }    
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1) {
                return new int[] {arr[j], j+1};
            }
        }
        
        return new int[] {-1,-1};
    }
    
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
