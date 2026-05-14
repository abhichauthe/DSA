// write a java solution to reverse a given number
/*Input: N = 12345
Output:54321
Explanation: The reverse of 12345 is 54321.

Input: N = 7789
Output: 9877
Explanation: The reverse of number 7789 is 9877.
 */

public class Reverse_a_number {
    public static void main(String[] args){
        int num = 54321;
        int ans = rev(num);
        System.out.println("Reverise of a Number is " + ans);
        int ans1 = Integer.MAX_VALUE;
        if(num > Integer.MAX_VALUE){
            System.out.println(0);
        }
        System.out.println(ans1);
    }
    public static int rev(int num){
        int rev = 0;
        while(num != 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num/=10;
        }
        return rev;
    }
    // when the integer is more than Integer max limit or it's minium than it's integer min limit
    // so we are using a check most probably solve on leetcode question
    public static int rev1(int num){
        int rev = 0;
        while(num != 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            if(rev > Integer.MAX_VALUE / 10 ||  rev < Integer.MIN_VALUE / 10){
                return 0;
            }
            num/=10;
        }
        return rev;
    }
}
