package Arrays.BinarySearch;
//For ascending order sorted array
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 1, 15, 16, 18, 22, 45, 89};
                  //{ 0 ,  1 ,  2, 3, 4, 5, 6, 7,  8, 9 , 10, 11, 12, 13};
        int target = 16;
        int ans = BinarySearch(arr, target);
        System.out.println(ans);
    }

    static int BinarySearch(int[] a, int target) {
        int start = 0;
        int end = a.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            //This is Done to Avoid Integer Overflow Bug (Not mid=(start+end)/2)
            if (a[mid] > target) {
                end = mid - 1;        // start=mid+1 for descending order
            } else if (a[mid] < target) {
                start = mid + 1;      //end = mid -1 for descending order
            } else {
                return mid;

            }

        }
        return -1;
    }
}
