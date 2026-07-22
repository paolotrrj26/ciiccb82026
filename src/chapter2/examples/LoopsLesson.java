package chapter2.examples;

import java.util.Scanner;

public class LoopsLesson {

    static boolean testBool() {
        return false;
    }

    public static void main(String[] args) {
        //byte a = 1;
        // while (a <= 10)
        //     System.out.println("a = " + a++);

        // do
        //     System.out.println("do while : a = " + a--);
        // while (a < 10);
        // System.out.println("end of program");

        //ForLoop

        int b = 0;
        // for( ;b<10; )
        //     System.out.println("a = " + b++);

        // for(System.out.println("Initialization");b<10; System.out.println("Increment/decrement"))
        //     System.out.println("a = " + b++);

        //objects
        // for(;testBool();)
        //     System.out.println("a = " + b++);

        //Scanner can be even used
        // for (Scanner sc = new Scanner(System.in); b <= 0 ; ) {
        //     System.out.print("Enter a number: ");
        //     sc.nextLine();
        //     System.out.println("a = " + b++);
        // }

        //Arrays Looping arrays | For each
        // String [] colors = {"black", "red", "pink", "yellow", "white", "blue"};
        // for(String color : colors)
        //         System.out.println("Color: " + color);

        //Optional Labels
        // ROW: for(int p = 1; p <= 10; p++) {
        // COL:    for(int l = 1; l <= 10; l++) {
        //             System.out.print(l*p + "\t");
        //             //can break specific label
        //             if(l == 5) break COL;
        //     }
        //     System.out.println();
        // }

        String [] students = {"JP", "Foldger", "Kobe", "Dwight"};
        String logIn = "Kobe";
        int a = 1;
        for(String name : students) {
            if(name.equalsIgnoreCase(logIn)){
                System.out.println(name + " " + logIn);
                break;
            }else System.out.println("iterration: " + a++);
        }
    }
}
