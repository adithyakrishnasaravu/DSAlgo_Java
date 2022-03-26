package Learning_Seven_BinarySearch;

public class Question3 {
    public static void main(String[] args) {
        //Q3. Find the smallest letter greater than the target
        String[] letters = {"c","f","j"};
        int target = 10;
    }


    public char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {
            //find the middle element
            //int mid = (start + end) / 2; //might be possible that the (start+end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } 
            else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
    
}
