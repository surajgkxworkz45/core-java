 class Factorial {
    public static int factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5;
        int result = factorialRecursive(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
O







