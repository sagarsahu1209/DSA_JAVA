package Methods;
// pass by value since primitives not objects
public class Swap {
    public static void main(String[] args) {
    int a=10;
    int b=20;
    Swap(10,20);
    System.out.println(" a :" + a  + " b : " + b);
    // the value is not changed bcos the original value remains same

    }
    static void Swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;

    }
}
