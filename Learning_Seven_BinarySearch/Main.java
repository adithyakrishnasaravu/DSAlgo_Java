package Learning_Seven_BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-12, -10, -5, -2, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int ans = binarySearch(arr, -2);
        System.out.println(ans);
    }

    //return the index
    //return -1 if it doesn't exist
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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
}