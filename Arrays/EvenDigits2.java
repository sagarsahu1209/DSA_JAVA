package Arrays;

public class EvenDigits2 {
    public static void main(String[] args) {
        int[] arr={12,345,2,-63,7896};
        System.out.println(findNumbers(arr));

      /*  System.out.println(Digits2(-789678)); //return number of digits*/
    }

    static int findNumbers(int[] nums){
        int count=0;
       for(int num :nums) {
          if(even(num) == true){
              count++;
          }

       }
       return count;
    }


    static boolean even(int num) {
        int count = 0;
        if (Digits2(num) % 2 == 0) {
            return true;
        }
        return false;
    }


    /*static int Digits(int num){

        if(num<0){
            num=num*-1;
        }

        if(num==0){
            return 1;
        }
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }*/

    static int Digits2(int num){
        if(num<0){
            num=num*-1;
        }
        if(num==0){
            return 1;
        }
        return(int)(Math.log10(num))+1;
    }
}
