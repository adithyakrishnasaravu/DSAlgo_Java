package Learning_Ten_Stringbuilders;

import javax.swing.text.AbstractDocument.BranchElement;

public class Patterns {
    public static void main(String[] args) {
        pattern3(5);
    }

    static void pattern1(int n) {
        for (int row = 1; row < n; row++) {
            //for every row run the column
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            //after one row is printed add a newline.
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            //for every row run the column
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            //after one row is printed add a newline.
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int row = 1; row <= n; row++) {
            //for every row run the column
            for (int col = n; col >= row; col--) {
                System.out.print("*");
            }
            //after one row is printed add a newline.
            System.out.println();
        }
    }
}
