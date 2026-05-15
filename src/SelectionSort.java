import java.util.Arrays;

/* In Selection sort what we are doing we are finding the minimum or maximum
 element and put it into it's correct position
*/
public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection(int[] arr){
        for(int i = 0; i<arr.length; i++){
            int last = arr.length-i - 1;
            int maxElement = getMaxIndex(arr,0,last);
            swap(arr,last,maxElement);

        }
    }
    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

    public static int getMaxIndex(int[] arr,int start ,int end) {
        int max = start;
        for(int i = start; i <= end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }

        return max;

    }

}
