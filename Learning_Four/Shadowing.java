package Learning_Four;

public class Shadowing {
    static int x = 5;
    public static void main(String[] args) {
        System.out.println(x); // 5
        int x = 40;
        System.out.println(x); // 40 (Here intial x value is shadowed)
        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}
