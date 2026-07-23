package chapter2.tasks;

public class Task2 {
    
    public static void main(String[] args) {
        
        byte byteVal = 0;
        short shortVal = 1;
        int intVal = 3110;
        float floatVal = 2.0f;
        boolean booleanVal = true;
        char charVal = 'H';

        //H3110 w0r1d 2.0 true
        String concatOut = charVal + "" + intVal + " " + "w" + byteVal + "r" + shortVal + "d" + " " + floatVal + " " + booleanVal;
        System.out.println(concatOut);
    }
}
