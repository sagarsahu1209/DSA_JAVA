package Arrays.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {

       /* int[] arr = {-18, -12, -4, 0, 2, 3, 4, 9, 15, 16, 18, 22, 45, 89};*/
        int[] arr = {99, 85, 72, 63, 50, 41, 32, 19, 7, 0, -5, -12};
        int target = 19;

        int ans = orderAgnostic(arr, target);
        System.out.println("Element found at index: " + ans); // Outputs 9
    }

    static int orderAgnostic(int[] a, int target) {
        int start = 0;
        int end = a.length - 1;

        // Checking if array is ascending or descending
        boolean isAsc = a[start] < a[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (a[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (a[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (a[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
