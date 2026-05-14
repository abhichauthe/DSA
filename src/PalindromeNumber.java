/*
Check if a number is Palindrome or Not
18
Problem Statement: Given an integer N, return true if it is a palindrome else return false.
A palindrome is a number that reads the same backward as forward. For example, 121, 1331, and 4554 are palindromes because they remain the same when their digits are reversed.

Examples
Example 1:
Input:N = 4554
Output:Palindrome Number
Explanation: The reverse of 4554 is 4554 and therefore it is palindrome number

Example 2:
Input:N = 7789
Output: Not Palindrome
Explanation: The reverse of number 7789 is 9877 and therefore it is not palindrome
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 7789;
        boolean ans = palin(num);
        if(palin(num)){
            System.out.println("Given Number is palindrome number");
        }else{
            System.out.println("Given number is not a palindrome Number");
        }
    }
public static boolean palin(int num){
        int temp = num;
        int rev = 0;
        while(num != 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num/=10;
        }
        if(temp == rev){
            return true;
        }
        return false;
    }
}