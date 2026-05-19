import java.util.Arrays;

// write a java program to find target element in an given array
public class linearSearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target = 9;
        int[] ans = searchIn2D(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] searchIn2D(int[][] arr, int target){
        for(int row = 0; row <arr.length; row++){
            for(int col = 0; col <arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
