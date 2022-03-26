package Learning_Four;

import java.util.Arrays;

public class Changevalue {
    public static void main(String[] args) {
        // create an array
        int[] arr = {1, 2,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void  change(int[] nums) {
        nums[0] = 99; //if you make a change to the object via this ref variable, the same obj will be changed.
    }
}
