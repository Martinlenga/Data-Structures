public class recursion {
    public static void main(String[] args){
        System.out.println(factorial(7));
        System.out.println(power(2,8));

    }

    private static int power(int base, int exponent) {
        if (exponent < 1)
            return 1;
        return base * power(base, exponent - 1);
    }

    private static int factorial(int num) {
        if (num < 1)
            return 1; // base case
        return num * factorial(num -1); // recursive
    }
}
