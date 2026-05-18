package Methods;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr={1,3,2,45,6};//Creating an array
        Change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Change(int[] nums) {
        nums[0]=99;
    }
}
