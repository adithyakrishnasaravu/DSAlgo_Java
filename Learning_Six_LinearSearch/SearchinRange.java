package Learning_Six_LinearSearch;

public class SearchinRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 18;
        System.out.println(searchinRange(arr, 1, 4, target));
    }   
  
    static int searchinRange(int[] arr, int start, int end, int target){
        if (arr.length == 0) {
            return -1; 
        }

        //run a for loop
        for (int index = start; index <= end; index++) {
            //check for element at every index if it is == target
            int element = arr[index]    ;
            if (element == target) {
                return index; //Returns where exactly has the element been found(index).
            }
        }
        //This line will execute if none of the return statements have execute, hence target no found
        return -1;
    }

}
