// write a java program to find the print all the diviser of a number
/*
Problem Statement: Given an integer N, return all divisors of N.
A divisor of an integer N is a positive integer that divides N without leaving a remainder. In other words, if N is divisible by another integer without any remainder, then that integer is considered a divisor of N.

Examples
Input: N = 36
Output: [1, 2, 3, 4, 6, 9, 12, 18, 36]
Explanation: The divisors of 36 are 1, 2, 3, 4, 6, 9, 12, 18, 36.
Input: N = 12
Output: [1, 2, 3, 4, 6, 12]
Explanation: The divisors of 12 are 1, 2, 3, 4, 6, 12
 */
public class PrintNumber {
    public static void main(String[] args) {
        int n = 36;
        for(int i = 1; i<= Math.sqrt(n); i++){
            if(n % i == 0){
                System.out.print( i + " ");
                // Avoid duplicate for perfect square
                if(i != n/i){
                    System.out.println((n / i ) + " ");
                }
            }
        }
    }

}
