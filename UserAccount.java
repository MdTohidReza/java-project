// NotSufficientBalanceException.java
class NotSufficientBalanceException extends Exception {
    public String getMessage() {
        return "Not enough balance in account";
    }
}

// UserAccount.java
public class UserAccount {
    private double balance;

    public void deposit(double value) {
        balance = balance + value;
        System.out.println("Balance" + balance);
    }

    public void withdraw(double value) throws NotSufficientBalanceException {
        if (balance >= value) {
            balance = balance - value;
            System.out.println("Remaining balance" + balance);
        } else {
            throw new NotSufficientBalanceException();
        }
    }

    public static void main(String[] args) {
        UserAccount userAccount = new UserAccount();
        userAccount.deposit(2000);
        try {
            userAccount.withdraw(1000);
            userAccount.withdraw(500);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
