package Learning_Six_LinearSearch.Questions_LeetCode;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        
    }

    static int maximumWealth(int[][] accounts) {
        int maxValue = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum_of_accs = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum_of_accs += accounts[person][account];
                
            }

            //System.out.println("The wealth of person " + (person+1) + "is " + sum_of_accs);
            if (sum_of_accs > maxValue) {
                maxValue = sum_of_accs;
            }
        }
        return maxValue;


    }
}
