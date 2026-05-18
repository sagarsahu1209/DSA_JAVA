package Methods;

public class PrimeOrNot {
    public static void main(String[] args) {
        Prime(10);
    }

    static void Prime(int num){
        int count =0;
        for(int i =1;i<=num;i++) {
            if ((num % i) == 0) {
                count++;
            }
        }
            if(count == 2){
              System.out.println("Number is Prime");
            }else
                System.out.println("Number is not prime");
        }
    }

