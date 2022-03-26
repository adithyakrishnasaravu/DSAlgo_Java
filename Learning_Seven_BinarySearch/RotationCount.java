package Learning_Seven_BinarySearch;

public class RotationCount {
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        System.out.println(count(nums));
    }

    static int count(int arr[]) {
        int pivot = findPivot(arr);
        return pivot + 1;
    }

    //Use this for non duplicates
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
    
    // Use this for duplicates
    static int findPivot_withDuplicates(int[] arr){
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
            //Here, the Case3 and Case4 of the normal RBS would fail because the
            // start, end and mid element turned out to be same. Therefore skip the duplicates.
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates

                //NOTE: But what if these elements at start and end, 
                // which are being skipped were pivots?

                //check if start is pivot or not.
                if (arr[start] > arr[start+1]){
                    return start;
                }
                start++;

                //check if end is pivot or not
                if (arr[end] < arr[end-1]) {
                    return end - 1;
                }
                end--;
            }
            //left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1 ;
            } else{
                end = mid - 1;
            }

        }

        return -1;
    }
}
