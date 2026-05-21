package Arrays.LinearSearch;

public class LinearSearch2 {

        public static void main(String[] args) {
            int[] arr={23,45,1,2,8,19,-3,16,-11,28};
            int key= -1;
            Integer ans= Search(arr,key);// String ans = Search(arr,key)
            System.out.println(ans);

        }
        // Search the target and return the element itself
        static Integer Search(int[] a, int target){ //To use null as a valid return value for "not found",
            if(a.length==0){                       //you must change the method signature and variable type to use the Integer object wrapper class.

                return null; // return "Array is Empty"; OR return -1;
            }
            // check for element at every if it is = target
            for(int element: a){
                if(element== target){
                    return element;// Automatically wraps into an Integer object

                }

            }
            // this line will execute if none of the return statements above have executed
            return null;// return " Element is not Present"; OR return -1;
        }
    }
/*
In Java, the process of converting a primitive type to its corresponding object wrapper class is called Autoboxing.
 How Autoboxing Works on Line 21 When your code executes return element;,
 Java looks at two things:The variable element is a primitive int.
 The method return type is defined as an Integer object.
 Instead of crashing, the Java compiler automatically rewrites your code behind the scenes during compilation.
*/



