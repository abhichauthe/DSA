// what is floor of a number :- The floor of a number is the greatest integer less than or equal to that number. Essentially, it rounds a real number down to the nearest whole integer.
// ALways remember one thing when we are returning the celing of a number then it's the greatest number which is more the or equal to target.
// floor of a number means the smallest number which is greater than or equal to the target element.

public class Floor {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int target = 45;
        int ans = floor(arr,target);
        System.out.println("Floor of a given number is  " + ans);
    }
    public static int floor(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
       return end;
    }


}
