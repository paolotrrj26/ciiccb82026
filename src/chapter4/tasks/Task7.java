package chapter4.tasks;

import java.util.Scanner;

class Arithmetic {
    int num1, num2;
    public Arithmetic(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    int sum() {
        System.out.println("Addition: " + (num1 + num2));
        return (num1 + num2);
    }

    int subtract() {
        System.out.println("Subtraction: " + (num1 - num2));
        return (num1 - num2);
    }

    int multiply() {
        System.out.println("Multiplication: " + (num1 * num2));
        return (num1 * num2);
    }

    double divide() {
        if(num2 == 0) {
            System.out.println("Division: Cannot divide by zero");
            return 0.0;
        }else{
            System.out.println("Division: " + (double)num1 / num2);
            return (double)num1 / num2;
        }
    }
}
public class Task7 {

    public static void main() {
        Scanner sc = new Scanner(System.in);
        //change array size if requirement changes
        int num[] = new int[2];
        int index = 0;
        System.out.println("[Enter 2 whole numbers]");

        while(index < 2) {
            System.out.print((index+1) + "]: ");
            if (sc.hasNextInt()) {
                num[index] = sc.nextInt();
                index++;
            }else {
                System.out.println("Invalid input, try again");
                sc.next();
            }
        }
        Arithmetic art = new Arithmetic(num[0], num[1]);
        art.sum();
        art.subtract();
        art.multiply();
        art.divide();
    }
}