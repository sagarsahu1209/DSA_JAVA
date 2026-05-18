package Loops;

import java.util.Scanner;

public class FibonaciNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int a = 0;
        int b = 1;
        int count =2;
        while(count <= num){
            int sum= a+b;
            a = b;
            b = sum;
            count++;
        }
        System.out.println(a + " ");
    }
}