package Learning_Four;

import java.lang.reflect.Method;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        //fun(2,3,4,5,6);
        //multiple(2, 3 , "adithya", "hflk", "fjdhfid");
        demo(1, 2, 3);
    }   

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }


    static void multiple(int a , int b, String ...v ){

    }
    
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
