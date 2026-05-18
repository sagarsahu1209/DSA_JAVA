package Arrays;
/*https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/*/

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums={12,345,2,63,7896};
        int even= findNumbers(nums);
        System.out.println(" Even No. Digit in Array is " +even);


    }
    static int findNumbers(int[] nums){
     if(nums.length==0){
         return -1;
        }

     int EvenD=0;
     for( int element:nums){
         int count=0;
         while(element>0){
             element=element/10;
             count++;
         }
         if(count % 2==0){
             EvenD++;
         }
     }
     return EvenD;
    }
    
}
