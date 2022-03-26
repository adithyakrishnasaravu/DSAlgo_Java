package Learning_Six_LinearSearch;

public class Main {
    public static void main(String[] args) {
        int[] nums = {10, 11, 12, 13, 14, 15, -5, -6, -7, -8, -10};
        int target = 777;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    //search the target and return true or false
    static boolean linearSearc3(int[] arr, int target){
        if (arr.length == 0) {
            return false; 
        }

        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            //check for element at every index if it is == target
            int element = arr[index]    ;
            if (element == target) {
                return true;
            }
        }
        //This line will execute if none of the return statements have execute, hence target no found
        return false;
    }
    //------------------------------------------------
    //search the target and return the element
    static int linearSearch2(int[] arr, int target){
        if (arr.length == 0) {
            return -1; 
        }

        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            //check for element at every index if it is == target
            int element = arr[index]    ;
            if (element == target) {
                return element;
            }
        }
        //This line will execute if none of the return statements have execute, hence target no found
        return Integer.MAX_VALUE;
    }
    

    //------------------------------------
    //search inthe array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0) {
            return -1; 
        }

        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            //check for element at every index if it is == target
            int element = arr[index]    ;
            if (element == target) {
                return index;
            }
        }
        //This line will execute if none of the return statements have execute, hence target no found
        return -1;
    }


}
