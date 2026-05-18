package TwoDArrays;

public class MaxELement {
    public static void main(String[] args) {
        int[][] arr = {                     // Indexing
                {2, 3, 4},                  //{0,1,2}
                {15, 34, 13},               //{0,1,2}
                {0, 87, 0, -7},             //{0,1,2,3}
                {23, 6745, 67, 890, 90},      //{0,1,2,3,4}
        };
        int ans=Max(arr);
        System.out.println(ans);
    }

    static int Max(int[][]a){
        int max=Integer.MIN_VALUE;//Integer.MIN_VALUE is a built-in constant in Java that represents
        // the smallest possible value an integer can hold (specifically, \(-2,147,483,648\)).

     /*
      for(int row=0; row<a.length; row++){
            for(int col=0; col<a[row].length;col++){
                if(a[row][col]> max){
                    max=a[row][col];
                }
            }
        }
      */

        // Enhance for Loop or For each Loop
        for(int[] row: a){ //grab each 1D integer array row inside the 2D array a
            for(int element : row){ //grab each single integer element sitting inside that specific row array
                if(element>max){
                    max=element;
                }
            }
        }
        return max;
    }
}
