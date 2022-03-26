package Learning_Seven_BinarySearch;

public class OrderAgnostic_binarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -2, -5, -10, -12};
        int ans =  orderAgnosticBS(arr, 0);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[]arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}
