package chapter3.examples;

import java.util.Arrays;

public class ArrayLesson {
    public static void main(String[] args) {
        int [] i = new int[3];
        int[] numbers2 = new int[]{1,54,75};
        int[] numbers3 = {1,54,75};
        Student[] batch2 = {new Student(),new Student(),new Student(),new Student(),null};
        for(int j = 0; j<numbers3.length;j++)
            System.out.println(numbers3[j]);
        System.out.println("\n"+stringSearch+" search result: "+ Arrays.binarySearch(numbersString, stringSearch));
        int[][] diffsize = {
                {1,2},//[0][1,2]
                {3},//[1][3]
                {9,8,7}//[2][9,8,7]
        };
        System.out.println(diffsize[1][0]);
        int squarepants[][][][] = {
                {  //[0][x][x][x]
                        {
                                {1,2,3}
                        },
                        { //[0][1][x][x]
                                {//[0][1][0][x]
                                        2,
                                        4,
                                        6 //[0][1][0][2]
                                }
                        }
                },
                {
                        {
                                {2,4,5},{3,6,7}
                        }
                }
        };
        System.out.println(squarepants[1][0][1][2]);
    }
}

class Student{
    String fullname;
    int age;
    String address;
    String course;
    int yearLevel;
}