package Learning_Five_Arrays;

public class MaximumItem {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 4, 3, 7};
        System.out.println(maxRange(arr, 1, 4));
    }

    //function for maxValue in a range
    static int maxRange(int[] arr, int start, int end) {
        int maxVal = arr[0];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    //function for maxValue
    static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
