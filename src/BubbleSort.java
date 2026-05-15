/*
what is bubble sort :- Bubble sort is simple sorting algorithm that repeatedly steps through
a list ,campers adjcent elements and swap them if they are in wrong order.

Complexity
Time Complexity:Worst & Average Case:

Best Case: (when the array is already sorted)
Space Complexity: (in-place sorting algorithm)
 */

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
   public static void bubble(int[] arr){
        boolean swapped;
        for(int i = 0; i<arr.length; i++){
            swapped = false;
            for(int j = 1; j < arr.length- i; j++){
                if(arr[j] < arr[j - 1]){
                    swap(arr,j,j-1);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }


   }
   public static void swap(int[] arr,int first ,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
   }


}
