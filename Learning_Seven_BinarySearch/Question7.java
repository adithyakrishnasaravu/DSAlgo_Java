package Learning_Seven_BinarySearch;

public class Question7 {
    //Q7. Search in Mountain Array
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 3, 1};
        System.out.println(search(nums, 3));
    }

    static int search(int arr[], int target) {
        int peak = peakIndexInMountainArray(arr);
        int first = orderAgnosticBS(arr, target, 0, peak);

        if (first != -1){
            return first;
        } 
        //else search in second half
        return orderAgnosticBS(arr, target, peak+1, arr.length-1);            

    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end ) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                //it means you are in decreasing part of array
                //this may be answer, but look left
                //this is why end != mid - 1
                end = mid;
            }
            else{
                start = mid + 1; //beacuse we know mid+1 element > mid element
            }
        }
        //in the end start == end and pointing towards the largest number in the array.
        return start; //or return end
    }

    static int orderAgnosticBS(int[]arr, int target, int start, int end) {

        // find whether the array is sorted in ascending or descending.
        boolean isAscending = arr[start] < arr[end];


        while(start <= end) {
            //find the middle elemnt
            //int mid = (start + end) / 2; //might be possible that the (start+end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if(isAscending) {
                if (target < arr[mid]) {
                    end = mid -1;
                } 
                
                else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } 
            
            else{
                if (target < arr[mid]) {
                    start = mid + 1;  
                } 
                else{
                    end = mid -1;
                }
            }

        }
        return -1;
    }
}