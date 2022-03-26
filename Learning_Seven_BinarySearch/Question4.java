package Learning_Seven_BinarySearch;

import java.util.Arrays;

import Learning_Six_LinearSearch.SearchinRange;

public class Question4 {
    public static void main(String[] args) {
        //Q4. Find First and Last Position of Element in Sorted Array
        int [] arr =  {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;

        //Index of first and last position of target in array
        System.out.println(Arrays.toString(searchRange(arr, target)));

    }

    static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

        //check for first occurence if target first
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        else{
            ans[1] = -1;
        }
        return ans;

    }


    //This fuction just return just the index value of target
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            //find the middle elemnt
            //int mid = (start + end) / 2; //might be possible that the (start+end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid -1;
            } 
            
            else if (target > nums[mid]) {
                start = mid + 1;
            }

            else{
                //potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
