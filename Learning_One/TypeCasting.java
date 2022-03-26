package Learning_One;
import java.util.Scanner;

/**
 * TypeCasting
 */
public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // float num = input.nextFloat();
        // System.out.println(num);


        //Type casting - CONVERTING INT TO FLOAT

        // int num  = (int)(67.65f);
        // System.out.println(num);

        //Automatic type promotion in expressions

        // int a = 257;
        // byte b = (byte)(a); // what is happening? - 257 % 256 = 1

        // byte a =20;
        // byte b = 45;
        // byte c =100;
        // int d = a * b / c ;
        // System.out.println(d);

        // int number = 'A';
        // System.out.println("ನಮಸ್ಕಾರ");

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 45.55f;
        double d = 0.34214;
        double result = (f * b) + (i / c) + (d - s);
        // float + int + double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d - s));
        System.out.println(result);

    }   

}