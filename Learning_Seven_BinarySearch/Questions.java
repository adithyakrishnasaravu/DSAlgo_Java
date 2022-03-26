package Learning_Seven_BinarySearch;

public class Questions {
    public static void main(String[] args) {
        //Q1. Ceiling of  a number
        //Q2. Floor of a number
        int[] nums = {2, 3, 5, 9, 14, 16, 18};
        int target = 10;
        //Here ceiling means smallest element is array greater than equal to target.
        System.out.println("The ceiling of " + target + " is " + nums[ceiling(nums, target)]);

        //Here floor means greatest element is array less than equal to target.
        System.out.println("The floor of " + target + " is " + nums[floor(nums, target)]);
    }

    //------------------------------------------------------------------------------------
    static int ceiling(int[] arr, int target) {
        //but what if the target is greater than the greatest number in the array, in that case no ceiling.
        if (target > arr[arr.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            //find the middle elemnt
            //int mid = (start + end) / 2; //might be possible that the (start+end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } 
            
            if (target > arr[mid]) {
                start = mid + 1;
            }

            if (target == arr[mid]){
                //ans found
                return mid;
            }
        }
        return start;
    }

    //-----------------------------------------------------------------------------------------
    static int floor(int[] arr, int target) {
        //but what if the target is lower than the lowest number in the array, in that case no floor.
        if (target < arr[0]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            //find the middle elemnt
            //int mid = (start + end) / 2; //might be possible that the (start+end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } 
            
            if (target > arr[mid]) {
                start = mid + 1;
            }

            if (target == arr[mid]){
                //ans found
                return mid;
            }
        }
        return end;
    }
    

}
