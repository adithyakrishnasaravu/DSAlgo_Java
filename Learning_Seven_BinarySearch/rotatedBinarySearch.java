package Learning_Seven_BinarySearch;

public class rotatedBinarySearch {
    public static void main(String[] args) {
        //Search on Rotated Sorted Array
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
        System.out.println(search(arr, 2));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // if you did'nt find a pivot it means array is not rotated
        if (pivot == -1) {
            //normal binary search
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        //if pivot is found, you have 2 ascending sorted arrays
        //Case1
        if (nums[pivot] == target) {
            return pivot;
        }
        //Case2
        if (target >= nums[0]) {
            // end = pivot -1;
            //or search space is (start, pivot-1)
            return binarySearch(nums, target, 0, pivot-1);
        }

        //Case3
        //or search space is (pivot+1, end)
        return binarySearch(nums, target, pivot+1, nums.length - 1);
         
    }
    // this will not work for duplicate vlaues.
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            //4 cases here
            //Case1
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            //Case2
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            //Case3
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            }
            //Case4
            else{
                start = mid + 1;
            }

        }

        return -1;
    }


    static int binarySearch(int[] arr, int target,int start, int end) {

        while(start <= end) {
            //find the middle elemnt
            //int mid = (start + end) / 2; //might be possible that the (start+end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid -1;
            } 
            
            else if (target > arr[mid]) {
                start = mid + 1;
            }

            else{
                //ans found
                return mid;
            }
        }
        return -1;
    }

    //=-------------------------------------------------------------------------------
    //Optimized way of code and better way to do rotatedBinarySearch, rather than three functions

}
