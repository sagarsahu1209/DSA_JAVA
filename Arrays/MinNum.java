package Arrays;

public class MinNum {
    public static void main(String[] args) {
        int[] arr = {672, 37, 14, 56,0,-7,87};
        min(arr);
        System.out.println(min(arr));
    }
    // work on edge cases like array being null,etc
    static int min(int[] Array) {
        if(Array.length==0){
            return -1;
        }
        int min = Array[0];
        for (int i = 0; i < Array.length; i++) {                    //to find min within particular range ex. 2 to 4
            if (Array[i] < min) {                                   //change  for(int i = 2; i < 4; i++)
                min = Array[i];
            }
        }
        return min;

    }
}
