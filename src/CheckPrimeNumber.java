import java.util.Scanner;

/*
Given an integer N, check whether it is prime or not. A prime number is a number that is only divisible by 1 and itself and the total number of divisors is 2..

Example 1:
Input:N = 2

Output:True

Explanation: 2 is a prime number because it has two divisors: 1 and 2 (the number itself).

Example 2:
Input:N =10

Output: False

Explanation: 10 is not prime, it is a composite number because it has 4 divisors: 1, 2, 5 and 10.
 */
public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pleas Enter a Number:- ");
        int num = sc.nextInt();
//        boolean ans = prime(num);
//        System.out.println(ans);
        boolean ans = checkPrime(num);
        System.out.println(ans);
    }

    // below one is brute force soloution of the same
    public static boolean prime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        }

        return false;
    }

    // below one is the optimal soloution of the same
    public static boolean checkPrime(int num) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                count++;

                if (num % i != i) {
                    count++;
                }

            }
        }
        return count == 2;
    }
}
