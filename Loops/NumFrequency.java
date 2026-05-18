package Loops;

import java.util.Scanner;

public class NumFrequency {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long num= in.nextLong();
        int n= in.nextInt();
        int count =0;
        while(num !=0){
            long rem = num % 10;
            if(rem == n){
                count++;
            }
            num=num/10;
        }
        System.out.println("The Frequency of " + n + " is " + count);

    }
}
