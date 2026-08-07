package chapter4.tasks;

public class Task8 {

    public static int sumOfAll(int... numbers) {
        int total = 0;
        for(int num : numbers) {
            int sum = 0;
            for(int x = 1; x <= num; x++) {
                sum += x;
            }
            total += sum;
            System.out.println("Parameter " + num + ": sum = "+ sum + ", cumulative sum = "+ total);
        }
        return total;
    }

    public static void main(String[] args) {
        sumOfAll(4,5,10);
    }
}