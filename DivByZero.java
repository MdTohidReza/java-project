class DivByZero {
    public static void main(String[] args) {
        try {
            System.out.println(3 / 0);
            System.out.println("please print me");
        } catch (ArithmeticException e) {
            // char[] exc;
            System.out.println(e);
        }
        System.out.println("after Exception");
    }
}
