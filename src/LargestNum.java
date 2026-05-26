// write a java program to find the largest element in an arry

import java.util.Arrays;

public class LargestNum {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 0};
        int ans = largest(arr);
        System.out.println("largest element in an array :" + ans);

        int ans1 = largestElement1(arr);
        System.out.println("Largest element in an array :" + ans1);
    }
    public static int largest(int[] arr){
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
           if(arr[i] > max){
               max = arr[i];
           }
        }
        return max;
    }
    public static int largestElement1(int[] arr){
        Arrays.sort(arr);
         return arr[arr.length - 1];
    }


}
