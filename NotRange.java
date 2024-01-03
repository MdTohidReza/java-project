import java.util.*;

class NumberNotInRangeException extends Exception {
    public String getMessage() {
        return "Entered Number Not in Range";
    }
}

public class NotRange {
    public static void main(String[] args) throws NumberNotInRangeException
    // This code is used to data from user
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number");
        int n = s.nextInt();
        try {
            if (n > 10 && n < 20) {
                System.out.println("Number in Range");
            } else {
                throw new NumberNotInRangeException();
            }

        } catch (NumberNotInRangeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("finished");
    }

}