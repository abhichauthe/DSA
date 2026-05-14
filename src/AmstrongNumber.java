// write a java program to find the Amstrong number in java
/*
Example 1:
Input:N = 153
Output:True
Explanation: 1^3+5^3+3^3 = 1 + 125 + 27 = 153

Example 2:
Input:N = 371
Output: True
Explanation: 3^3+7^3+1^3 = 27 + 343 + 1 = 371
 */
public class AmstrongNumber {
    public static void main(String[] args) {
        int num  = 372;
//         amstrong(num);

        if(isAmstrong(num)){
            System.out.println("Given number is Amstrong number");
        }else{
            System.out.println("Given number is not Amstrong number");
        }
    }
    // this is the soloution where actually i know how many digits are present in it
    public static void amstrong(int num){
        int sum = 0;
        int temp = num;
        while(num != 0){
            int rem = num % 10;
            sum = rem * rem * rem + sum;
            num/=10;
        }
        if(temp == sum){
            System.out.println("Given number is amstrong number");
        }else{
            System.out.println("Given number is not amstrong number");
        }

    }
    // so now i don't know how many digit is present init so i have to solve accordingly
    public static boolean isAmstrong(int num){
        int temp  = num;
        // count of digits
        int digits = (int) Math.log10(num) + 1;

        int sum = 0;
        while(num != 0){
            int rem = num % 10;
            sum += (int) Math.pow(rem,digits);
            num/=10;
        }
        return temp == sum;
    }
}
