package chapter3.tasks;
import java.util.Scanner;

public class Task5 {

    public static void main() {
        int[] inputNum = new int[3];
        boolean flag = true;
        Scanner scan = new Scanner(System.in);

        //input
        System.out.println("Enter 3 numbers");
        for(int x = 0; x < inputNum.length; x++) {
            System.out.print( (x+1) + ") : ");
            inputNum[x] = scan.nextInt();
        }

        //sorting
        int reference = inputNum[0];
        int largest = inputNum[0];
        for(int num : inputNum) {
            if(reference != num) {
                flag = false;
            }
            if(num > largest) {
                largest = num;
            }
        }

        //output
        if(flag) {
            System.out.println("All numbers are equal");
        }else
            System.out.println("Largest number: " + largest);
    }
}