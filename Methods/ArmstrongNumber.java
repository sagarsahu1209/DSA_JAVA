package Methods;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Arms(153);
    }
    static void Arms(int num){
        int original= num;
        double temp=0;
        while(num !=0){
        int rem= num % 10;
        temp=temp + Math.pow(rem,3);
        num=num/10;
        }
        if( temp == original){
            System.out.println("Armstrong Number");
        }else
            System.out.println("Not a Armstrong Number");

    }
}
