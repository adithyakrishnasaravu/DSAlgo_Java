package Learning_Seven_BinarySearch;

public class splitArray_LargestSum {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        System.out.println(splitArray(arr, 4));
    }

    static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); // in the end of the loop this will contain the max item from the array
            end += nums[i];
        }

        while (start < end) {
            // try for the middle as potential ans
            int mid = start + (end - start)/2 ;

            //calculate how many pieces you can divide it into with this max sum
            int sum = 0;
            int pieces = 1; //can have atleast 1 piece

            for (int num : nums) {
                if (sum + num > mid) {
                    // you cant add it in subarray, make new one
                    //so in new subarray, if new element is added, initially the sum = num
                    sum = num;
                    pieces++;
                } else{
                    sum += num;
                }
            }

            if (pieces > m) {
                start = mid + 1;
            }
            else{
                end = mid;
            }

            
        }
        return start;// or return end
    }
}
