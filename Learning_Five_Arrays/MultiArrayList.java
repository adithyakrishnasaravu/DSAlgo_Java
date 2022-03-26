package Learning_Five_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        //initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());   
        }

        //add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(scan.nextInt());
            }
        }

        System.out.println(list);
    }
}
