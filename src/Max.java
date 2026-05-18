// write a java program to find the maximum value of the given array.

import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1,20,45,50,77,99};
        int ans = max(arr);
        System.out.println("maximum value int the given array is  " + ans);
    }

    public static int max(int[] arr){
        int maxVal = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
