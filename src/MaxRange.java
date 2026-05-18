// write a java program to find the maximum value in given range of the element
public class MaxRange {
    public static void main(String[] args) {
        int[] arr = {10,20,30 ,40 ,50,99};
        int ans = max(arr,1,3);
        System.out.println("maximum value int the given range is " + ans);

    }
    public static int max(int[] arr,int start,int end){
        int maxVal = arr[start];
        for(int i = start; i <= end; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}

