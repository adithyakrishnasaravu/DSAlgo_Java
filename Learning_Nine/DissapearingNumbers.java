package Learning_Nine;

import java.util.ArrayList;

public class DissapearingNumbers {
    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println(dissapearedNumbers(nums));
    }

    static ArrayList<Integer> dissapearedNumbers(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1 ;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else{
                i++;
            }    
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                list.add(j+1);
            }
        }
        
        //case2
        return list;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
