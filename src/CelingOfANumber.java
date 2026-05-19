/*
The ceiling of a number is the smallest integer that is greater than or equal to that number.
It essentially rounds a number up to the next whole integer.
If the number is already an integer, the ceiling is the number itself.
so in celing of a number the actual we are implementing the binary search the only thing that
we are doing is that instead of returning the mid we are returning the start element

 */
public class CelingOfANumber {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int target = 50;
        int ans = celing(arr,target);
        System.out.println("Celing of a number :-  " + ans);
    }
    public static int celing(int[] arr,int target){
        int start = 0;
        int end = arr.length -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
