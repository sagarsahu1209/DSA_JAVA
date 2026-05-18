package SwitchS;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int empID = in.nextInt();
        String Department = in.next();

        switch(empID){
            case 1 :
                System.out.println("Employee ID is 1");
                break;
            case 2 :
                System.out.println("Employee ID is 2");
                break;
            case 3 :
                System.out.println("Employee ID is 3");
                switch(Department){
                    case "IT":
                        System.out.println(" IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                }
                break;
            default:
                System.out.println(" Invalid Employee ID");
        }


        // Enhanced Switch
        switch (empID) {
            case 1 -> System.out.println("Employee ID is 1");
            case 2 -> System.out.println("Employee ID is 2");
            case 3 -> {
                System.out.println("Employee ID is 3");
                switch (Department) {
                    case "IT" -> System.out.println(" IT Department");
                    case "Management" -> System.out.println("Management Department");
                }
            }
            default -> System.out.println(" Invalid Employee ID");
        }

    }
}
