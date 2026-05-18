import java.util.Arrays;

// write a java program to reverse the given array
public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        reverse1(arr);
    }
    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            swap(arr,start,end);
            start++;
            end--;
        }


    }
    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void reverse1(int [] arr){
        for(int i =arr.length; i > 0; i--){
            System.out.print(i + " ");
        }
    }
}
