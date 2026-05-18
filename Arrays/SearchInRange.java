package Arrays;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
    int [] arr={18,12,-7,3,14,28};
    int target=-7;
    int start=in.nextInt();
    int end=in.nextInt();
    Search(arr,target,start,end);
        System.out.println(Search(arr,target,start,end));
    }

    static boolean Search(int[] a, int Find,int start, int end){
       if(a.length==0){
           return false;
       }
       for(int i=start;i<=end;i++){
           if(a[i]== Find){
               return true;
           }
       }
       return false;
    }
}
