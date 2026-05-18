package Methods;

public class StringExample {
    public static void main(String[] args) {
      String personalised=myGreet(" Sagar ");
        System.out.println(personalised + " Sagar");
    }

    static String myGreet( String name) {
        String message = " Hello " + name;
        return message;
    }
    }
