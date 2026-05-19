// write a java progarm to find the given target element in an given range
public class linearSearchInRange {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int target = 10;
        int ans = linearSearch(arr,target,2,4);
        System.out.println(ans);
    }
    public static int linearSearch(int[] arr,int target,int start,int end){
        for(int i = start ; i<=end; i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
