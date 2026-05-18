package Arrays;

public class EvenDigits1 {

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, -63, 7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count=0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
    }
        return count;
    }
    //function to check whether a number contain even digits or not
    static boolean even(int num) {
        int ans = Digits(num);
        /*if (ans % 2 == 0) {
            return true;
        }
        return false;*/

        return ans % 2 ==0;
    }
    //count digits in a number
    static int Digits(int num){
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        return count;
        }
    }

