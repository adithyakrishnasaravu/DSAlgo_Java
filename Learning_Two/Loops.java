package Learning_Two;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        for (int i = 0; i <= 10; i+=1){
            System.out.println(i);
        }

        // int a = 1;
        // do{
        //     System.out.println(a);
        //     a++;
        // } while(a <= 5);


        // Questions

        // Finding maximum of three numbers
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // int max = a;

        // if (max < b){
        //     max = b;
        // }
        // if (max < c){
        //     max = c;
        // }

        // System.out.println(max);

        // Or int max = Math.max(c, Math.max(a,b))
        

        // Uppercase - Lowercase
        char c = sc.next().trim().charAt(0);
        if (c >= 'a' && c <= 'z'){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }

    }
}