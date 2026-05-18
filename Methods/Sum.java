package Methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
      sum();
      int ans = sum2();
        System.out.println(" Sum is " + ans);
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. 1 :");
        int num1=in.nextInt();
        System.out.println("Enter no. 2:");
        int num2=in.nextInt();
        int sum=num1+num2;
        System.out.println("Sum is " + sum);
    }

    static int sum2(){  //Return type is Int
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. 1 :");
        int num1=in.nextInt();
        System.out.println("Enter no. 2:");
        int num2=in.nextInt();
        int sum=num1+num2;
        return sum;
       // System.out.println(); //
    }
}
