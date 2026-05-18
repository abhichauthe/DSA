import java.util.Arrays;

// write a java program to swap the indices of two element or swapping the element
public class SwapElement {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,19};
        System.out.println(Arrays.toString(arr));
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
