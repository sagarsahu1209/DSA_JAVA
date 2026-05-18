package TwoDArrays;
import java.util.Arrays;
import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
                              //Direct initialization and Accessing and modification

/*        int[][] arr={
                {1,2,3},//0th index
                {4,5},//1st index
                {7,8,9},//2nd index
        };
        System.out.println(arr[2][0]);
        arr[0][1]=99;
        System.out.println(arr[0][1]);*/


                                             // INPUT
        Scanner in=new Scanner(System.in);
        int [][] arr =new int[3][];
        System.out.println(arr.length);// no. of rows
        for(int row = 0; row < arr.length; row++){
            //for each column in every row
            for(int col=0; col < arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }

                                             // OUTPUT(TRADITIONAL WAY)

/*        for(int row = 0; row < arr.length; row++){
            //for each column in every row
            for(int col=0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }*/

                                             // OUTPUT
/*

        for(int row = 0; row < arr.length; row++)
            System.out.println(Arrays.toString(arr[row]));
*/

                                            // OUTPUT(ENHANCED FOR LOOP)

        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
