package Arrays.LinearSearch;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name="Sagar";
        char c='r';
      /*  System.out.println(Search(name,c));*/
        System.out.println(Arrays.toString(name.toCharArray()));

       /* name.toCharArray()Breaks down the string "Sagar" into individual characters.
          Creates a character array: {'S', 'a', 'g', 'a', 'r'}.
          Arrays.toString(...)Standard character arrays don't print nicely on their own in Java.
          This utility method converts that raw memory array into a clean text format.*/

    }
/*    static boolean Search(String Str,char target){
        if( Str.length()==0){
            return false;
        }
        for(int i=0 ;i < Str.length();i++){
            if(target == Str.charAt(i)){
                return true;
            }

        }
        return false;
    }*/

    static boolean Search1(String Str,char target){
        if( Str.length()==0){
            return false;
        }
      for( char ch : Str.toCharArray()){ //The loop iterates through this array,
          // extracting one character at a time and saving it into the temporary variable ch.
          if(ch == target){
              return true;
          }

        }
        return false;
    }
}
//Str.toCharArray() converts the string into an array of individual characters.