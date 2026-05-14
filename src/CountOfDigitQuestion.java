/*Count digits in a number
Problem Statement: Given an integer N, return the number of digits in N.
Input:N = 12345
Output:5
Explanation:  The number 12345 has 5 digits.

Example 2:
Input:N = 7789
Output: 4
Explanation: The number 7789 has 4 digits.
 */
public class CountOfDigitQuestion {
    public static void main(String[] args) {
        int num = 0;
//        int digit = countOfDigit(num);
//        System.out.println("count of digit is " + digit);
        System.out.println("Count of Digit is " + countOfDigitOptimal(num));
    }
    public static int countOfDigit(int num){
        int count = 0;
        while(num != 0){
            count++;
            num/=10;
        }

        return count;
    }
    public static int countOfDigitOptimal(int num ){
        if(num == 0){
            return 1;
        }
        int count = (int) (Math.log10(num)) + 1;

        return count;
    }

}
