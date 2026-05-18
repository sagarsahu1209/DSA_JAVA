package Arrays;

public class maxItem {
    public static void main(String[] args) {
        int[] arr = {1, 672, 37, 14, 56,87};
        max(arr); //{0,  1 , 2 ,  3,  4, 5} -> index of  array
    }
    // work on edge cases like array being null,etc
    static void max(int[] Array) {
        int max = Array[0];
        for (int i = 0; i < Array.length; i++) {                    //to find max within particular range ex. 2 to 4
            if (Array[i] > max) {                                   //change  for(int i = 2; i < 4; i++)
                max = Array[i];
            }

        }
        System.out.println("max:" + max);
    }
}
