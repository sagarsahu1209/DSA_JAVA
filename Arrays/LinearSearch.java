package Arrays;
// using Function only
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={23,45,1,2,8,19,-3,16,-11,28};
        int key= -11;
        int ans= Search(arr,key);
        System.out.println(ans);

    }
     // Search in array: return index if found else return -1
     static int Search(int[] a, int target){
        if(a.length==0){
            return -1;
        }
        // check for element at every if it is = target
        for(int index=0;index<a.length;index++){
            int element=a[index];
            if(element== target){
                return index; // return Element;


            }

        }
        // this line will execute if none of the return statements above have executed
        return -1;
     }
}
