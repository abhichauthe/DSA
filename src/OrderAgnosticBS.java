public class OrderAgnosticBS {

    public static void main(String[] args) {

        int[] arr = {-3,-2,-1,0,1,2,3,4,5};

        int target = 4;

        int ans = binarySearch(arr, target);

        System.out.println(ans);
    }

    public static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        // check ascending or descending
        boolean isAscending = arr[start] < arr[end];

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(target == arr[mid]) {
                return mid;
            }

            if(isAscending) {

                if(target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {

                if(target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}