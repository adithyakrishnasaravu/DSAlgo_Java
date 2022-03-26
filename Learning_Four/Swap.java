package Learning_Four;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Code for swapping numbers
        // int temp = a;
        // a = b;
        // b = temp;

        swap(a, b);
        System.out.println(a + " " + b);
        // It will not swap.
    }
    // Wrting swap in a function
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
