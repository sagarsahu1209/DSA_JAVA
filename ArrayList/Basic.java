package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
                                             // ADDING ELEMENT
        list.add(67);
        list.add(673);
        list.add(6733);
        list.add(63);
        list.add(631);
        System.out.println(list);

                                            //UPDATE ELEMENT

        list.set(2,45);

                                           //CHECK IF IT CONTAINS ELEMENT

        System.out.println(list.contains(63));

                                          //REMOVE ELEMENT

        list.remove(2);

                                          // TAKING INPUT
        for(int i=0;i< 5;i++){
            list.add(in.nextInt());
        }
                                         // GET ITEM AT ANY INDEX

        for(int i=0; i<5;i++){
            System.out.println(list.get(i));
        }

        System.out.print(list);
    }
    }
