package Learning_Five_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Integer {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            //Syntax
            ArrayList<Integer> list = new ArrayList<>(10);
            // list.add(65);
            // list.add(28);
            // System.out.println(list);
            // list.set(0, 99);
            // System.out.println(list);

            //input
            for (int i = 0; i < 5; i++) {
                list.add(scan.nextInt());
            }

            for (int i = 0; i < 5; i++) {
                System.out.println(list.get(i));
            }
            System.out.println(list);

    }
}
