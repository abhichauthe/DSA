// write a java question to find the minum in an array
public class Min {
    public static void main(String[] args) {
        int[] arr = {12,23,49,93,7};
        int ans = min(arr);
        System.out.println("Minimum element in an given an array "+ ans);
    }
    public static int min(int[] arr){
        int ans = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
