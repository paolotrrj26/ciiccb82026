package chapter4.tasks;

import static java.lang.Math.*;

public class Task9 {

    public static int add(int a, int b) {
        int sum = addExact(a, b);
        System.out.println("Sum: " + sum);
        return sum;
    }

    public static int subtract(int a, int b) {
        int difference = subtractExact(a,b);
        System.out.println("Difference: " + difference);
        return difference;
    }

    public static int multiply(int a, int b) {
        int product = multiplyExact(a,b);
        System.out.println("Product: " + product);
        return product;
    }

    public static float divide(int a, int b) {
        float quotient = (float) (floorDiv(a,b));
        System.out.println("Quotient: " + quotient);
        return quotient;
    }

    public static void main(String[] args) {
        add(10, 5);
        subtract(10, 5);
        multiply(10, 5);
        divide(10, 5);
    }
}