package Learning_Four;

public class Scoping {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        String name = "Adithya";
    

        {
            // Block

            // int a = 78; //already initialised outside the block, hence you cant intitialise again.
            a = 100; //it is reassigning the original ref variable to 100
            name = "Deepthi";
            System.out.print(a + " ");
            System.out.print(name);
            int c = 99;
            // values intialised in this block will remain in block

            //Anything initialised outside cant be used inside a block, but anything initialised inside can be used outside.
        }

        // scoping in for loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 90;
            //int a =10; //Anything intialised in for loop remains within the loop and no outside var.
        }

    }
               
}
