package Learning_Six_LinearSearch;

public class evenDigits_Question1 {
    //Given an array nums of integers,
    //return how many of them contain an even number of digits.
    public static void main(String[] args) {
        int a = 12;
        int[] arr = {181, 25, 270, 652, 11, 8};
        //System.out.println(even_number_digits(arr));
        //System.out.println(numberofdigits(0));
        System.out.println(digits2(-423462));
    }
    
    static int even_number_digits(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (numberofdigits(num) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    //function to check if number has even number of digits or not.
    static int numberofdigits(int num) {

        //What if the number is negative - edgecase1
        if (num < 0) {
            num = num * -1;
        }

        //What if number id 0 itself - edgecase2
        if (num == 0) {
            return 1;
        }


        //Approach1 : Count the number of digits.
        int c = 0;
        while (num > 0) {
            c++;
            num /= 10; 
        }
        //The above can be written as:
        return c;
    }

    //Approach2: Single step optimized with Math operator.
    static int digits2(int num) {

        if (num < 0) {
            num = num * -1;
        }

        //What if number id 0 itself - edgecase2
        if (num == 0) {
            return 1;
        }

        return (int)(Math.log10(num) + 1);
    }
}