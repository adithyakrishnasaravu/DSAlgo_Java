package Learning_Nine;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        // bubbleSort(arr);
        // System.out.println(Arrays.toString(arr));
        
        // selectionSort(arr);
        // System.out.println(Arrays.toString(arr));
        
        // insertionSort(arr);
        // System.out.println(Arrays.toString(arr));

        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    static void cyclicSort(int[] arr){
        // Cyclic sort is for arrays inf the form of (1 to n)
        int i = 0;
        while (i < arr.length) {
            int correct_index = arr[i] - 1;
            if (arr[i] != arr[correct_index]) {
                swap(arr, i, correct_index);
            } else{
                i++;
            }    
        }
    }

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                } else{
                    break;
                }
            }
        }
    }

    static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            //find the maximum remaining array and swap with correct index.
            int last = nums.length-i-1;
            int maxindex = getMaxIndex(nums, 0, last);

            swap(nums, maxindex, last);
        }
    }

    static int getMaxIndex(int[] nums, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (nums[max] < nums[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
    static void bubbleSort(int[] arr) {
        boolean swapped;
        // run the steps n-1 times.
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each step max item will come at last respective index
            for (int j = 1; j < arr.length - i; j++) {
                //swap if the item is smaller than the previos item
                if (arr[j] < arr[j-1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //if you did not swap for a particular value if i, it means the array is sorted hence stop the program
            if(swapped == false){
                break;
            }

        }
    }
}
