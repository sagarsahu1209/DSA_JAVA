package TwoDArrays;

import java.util.Arrays;
public class SearchingIn2DArray {
    public static void main(String[] args) {
      int[][] arr={
              {2,3,4},
              {15,34,13},
              {0,87,0,-7},
              {23,45,67,890,90},
      };
        int key= -90;
        int[] ans=Search(arr,key);
        System.out.println(Arrays.toString(ans));

             /* In Java, printing a raw array variable directly like
                System.out.println(ans) outputs a useless memory hash code (e.g., [I@5acf98e4).
                To bypass this, you call Arrays.toString().
                This utility method opens up the ans array, grabs the numbers inside,
                and formats them into readable text with brackets and a comma.
            */
    }

    static int[] Search(int[][] a, int target){
    for(int row=0; row<a.length;row++){ //a.length asks a 2D array, "How many rows do you contain?"

       /* col < a[row].length;:
            This is crucial for jagged arrays.
            a[row].length checks the exact length of the current row.
            If row is 0, it limits the loop to 3 columns.
            If row is 3, it dynamically expands the limit to 5 columns.*/

        for(int col=0;col< a[row].length;col++){
            if(a[row][col]==target){
                return new int[]{row,col};
            }
        }
    }
    return new int []{-1,-1};
    }

}

