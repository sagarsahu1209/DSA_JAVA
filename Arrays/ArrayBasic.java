package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasic {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];
//        System.out.println(" Enter 5 number");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//
//        }
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//            //takes array object and convert it into readable string
//        }

        //Array of objects
        String[] str= new String[3];
        for(int i=0;i<str.length;i++){
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));
        str[2]="ccc";
        System.out.println(str);
    }

}
