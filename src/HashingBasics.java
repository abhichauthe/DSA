// Basics of Hashing
/*
    Let’s first try to understand the importance of hashing using an example:
Given an array of integers: [1, 2, 1, 3, 2] and we are given some queries: [1, 3, 4, 2, 10]. For each query, we need to find out how many times the number appears in the array. For example, if the query is 1 our answer would be 2, and if the query is 4 the answer will be 0.
Similarly, the following will be the answers to the given queries:
 */
public class HashingBasics {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,2};
        int num1 = 3;
        int ans = hashing(arr,num1);
        System.out.println("frequency of a Given Number is " + ans);
    }
    public static int hashing(int[] num,int num1){
        int count = 0;
        for(int i = 0; i<num.length; i++){
            if(num[i] == num1){
                count++;
            }
        }
        return count;
    }

}
