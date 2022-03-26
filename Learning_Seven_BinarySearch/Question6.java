package Learning_Seven_BinarySearch;

public class Question6 {
    public static void main(String[] args) {
        //Peak Index in a Mountain Array
        int [] arr = {1, 2, 3, 5, 6, 4, 3, 2};
    }

    public int peakIndexInMountainArray(int[] arr) {
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

}
