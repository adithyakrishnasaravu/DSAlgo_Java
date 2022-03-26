package Learning_Four;

public class Overloading {
    public static void main(String[] args) {
        fun("Adithya");
    }

    // Two or more functions with same name but with diff arguments or diff number of arguments.

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
}
