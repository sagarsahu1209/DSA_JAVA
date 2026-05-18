package Loops;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args){
        Scanner in= new Scanner( System.in);
        long num= in.nextLong();
        long temp =0;
        while(num != 0){
            long rem = num % 10;
            temp = temp *10 + rem;
            num=num/10;
        }
        System.out.println(temp);
    }
}
