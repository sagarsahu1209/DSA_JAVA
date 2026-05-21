package Arrays.LinearSearch;
// Using Enhanced for loop
public class LinearSearch1 {
    public static void main(String[] args) {
        int[] arr={23,45,1,2,8,19,-3,16,-11,28};
        int key= -1;
        boolean ans= Search(arr,key);// String ans = Search(arr,key)
        System.out.println(ans);

    }
    // Search the target and return the element itself
    static boolean Search(int[] a, int target){ // static String Search(int[] a, int target)
        if(a.length==0){
            return false; // return "Array is Empty"; OR return -1;
        }
        // check for element at every if it is = target
       for(int element: a){
            if(element== target){
                return true;// return " Element is present"; OR return Element;

            }

        }
        // this line will execute if none of the return statements above have executed
        return false;// return " Element is not Present"; OR return -1;
    }
}

