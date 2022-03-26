package Learning_Seven_BinarySearch;

public class Question5 {
    public static void main(String[] args) {
        //Q5. find position of element in infinite array
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));

    }
    static int ans(int[] arr , int target) {
        //first find range
        //start with chunck of size 2
        int start = 0;
        int end = 1;


        //condition for the target to lie in range is target > end
        while (target > arr[end]) {
            int temp = end + 1; //this is my new start
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);


    }
    static int binarySearch(int[] arr, int target, int start, int end) {

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
