/*
Find GCD of two numbers
Problem Statement: Given two integers N1 and N2, find their greatest common divisor.

Examples
Example 1:
Input: N1 = 9, N2 = 12

Output: 3
Explanation:
Factors of 9: 1, 3, 9
Factors of 12: 1, 2, 3, 4, 6, 12
Common Factors: 1, 3
Greatest common factor: 3 (GCD)

Example 2:
Input: N1 = 20, N2 = 15

Output: 5
Explanation:
Factors of 20: 1, 2, 4, 5, 10, 20
Factors of 15: 1, 3, 5, 15
Common Factors: 1, 5
Greatest common factor: 5 (GCD)
 */
public class GCD {
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 12;

//        int ans = greatesCommonFactor(num1,num2);
//        System.out.println(ans);
        int ans2 = findGcd(num1,num2);
        System.out.println(ans2);
        }

        // Below approach is brute Force approach
        public static int greatesCommonFactor(int num1,int num2){
        int gcd = 1;
        for(int i = 1; i<Math.min(num1,num2); i++){
            if(num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
    // optimal appraoch
    /*
    Euclidean Algorithm:

     The Euclidean Algorithm is a method for finding the greatest common divisor (GCD)
      of two numbers. It operates on the principle that the GCD of two numbers remains
     the same even if the smaller number is subtracted from the larger number.

     To find the GCD of n1 and n2 where n1 > n2:
     1. Repeatedly subtract the smaller number from the larger number until one of them becomes 0.
     2. Once one becomes 0, the other is the GCD of the original numbers.

    Example:
         n1 = 20, n2 = 15
         gcd(20, 15) = gcd(20 - 15, 15) = gcd(5, 15)
         gcd(5, 15)  = gcd(15 - 5, 5)  = gcd(10, 5)
         gcd(10, 5)  = gcd(10 - 5, 5) = gcd(5, 5)
         gcd(5, 5)   = gcd(5 - 5, 5)  = gcd(0, 5)

         Hence, return 5 as the GCD.
     */

    public static int findGcd(int num1,int num2){
        while(num1 > 0 && num2 > 0){
            // if a is grater than num1
            // substract num1 from num2 and update num1

            if(num1 > num2){
                num1 = num1 % num2;
            }else{
                num2 = num2 % num1;
            }

            if(num1 == 0){
                return num2;
            }
        }
        return num2;
    }


}
