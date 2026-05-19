/*
Given an array nums of integers, return how many of them contain an even number of digits.
Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation:
12 contains 2 digits (even number of digits).
345 contains 3 digits (odd number of digits).
2 contains 1 digit (odd number of digits).
6 contains 1 digit (odd number of digits).
7896 contains 4 digits (even number of digits).
Therefore only 12 and 7896 contain an even number of digits.
 */

public class EvenDigit {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        int ans = findNumbers(arr);
        System.out.println(ans);
    }
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    private static boolean even(int  num) {
        int numOfDigit = digits(num);
        /*
        if(numOfDigit % 2 == 0){
            return true;
        }
        return false;
         */
        return numOfDigit % 2 == 0;

    }

//    private static int digits(int num) {
//        int digit = 0;
//        while(num != 0){
//            digit++;
//            num/=10;
//        }
//        return digit;
//    }
    public static int digits(int num){
        int digit =(int)Math.log10(num);
        return digit;
    }
}
