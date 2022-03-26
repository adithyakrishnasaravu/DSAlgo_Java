package Learning_Four;

import java.util.Scanner;

public class String_Example_ofFunction {
    public static void main(String[] args) {
        // String messsage = greet();
        // System.out.println(messsage);
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name and you will get a nice greeting!: ");
        String message = greet_well(sc.next());
        System.out.println(message);
    }
    

    // static String greet() {
    //     String greeting = "how are you";
    //     return greeting;
    // }

    static String greet_well(String a) {
        String text = "Hi! " + a + ", hope you are doing amazing." ;
        return text;
    }
}