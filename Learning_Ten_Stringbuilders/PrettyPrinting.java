package Learning_Ten_Stringbuilders;

import java.util.Arrays;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 453.1274f;
        // System.out.printf("formatted number is %.2f", a);
        // System.out.printf("Pi: %.3f", Math.PI);
        // System.out.printf("My name is %s %s", "Adithya", "Krishna");
        // System.out.println("a" + "b");


        //Performance
        // String series ="";
        // for (int i = 0; i < 26; i++) {
        //     char ch = (char)('a' + i);
        //     // System.out.println(ch);
        //     series += ch;
        // }
        // System.out.println(series);

        System.out.println("a" + 'a');
        // If one of the datatype is String (which is dominating), anything along with gets printed
        String name = "Adithya Krishna Saravu";
        System.out.println( "    Adithya    ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
