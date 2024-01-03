import java.util.*;

class NegativeValueException extends Exception {
    public String getMessage() {
        return "Negative Value not allowed";
    }
}

public class UDEDemo {
    public static void main(String[] args) throws NegativeValueException
    // This code is used to data from user
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number");
        int n = s.nextInt();
        try {
            if (n < 0)
                throw new NegativeValueException();
            System.out.println("accepted value");
        } catch (NegativeValueException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("finished");
    }

}
