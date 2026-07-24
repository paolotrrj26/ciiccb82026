package chapter3.examples;

public class StringBuilder {
    public static void main(String[] args) {
        String name = "fluffy";
        String name2 = "fluffy";
        String name3 = "fluffy";
        name2 = null;
        name2 = "fluffy";

        String a = "1";
        a = "0";
        a += "2";
        a += "3";
        String b = "1";
        name2 = "fluffy";
        name = null;
        name2 = null;

        name3 = new String("fluffy");
        System.out.println(a);
        String word1 = "Stand alone";
        System.out.println(word1.toUpperCase());
        word1 = word1.toUpperCase();
        System.out.println(word1.toLowerCase());
        System.out.println(word1);
        String trimSample = "       \t \n \t Marc Yim          \t \n";
        System.out.println(trimSample.trim());
        //String builder
        String limitString = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        //String limit for max charseq. integer.maxvalue
        System.out.println(limitString);
        String sample1 = "abcd";
        String sample2 = "abcd";
        String sample3 = "abcd ";
        //compile time
        System.out.println("sample1==sample2 = " + (sample1 == sample2));
        System.out.println("sample1==sample3 = " + (sample1 == sample3));
        System.out.println("sample2==sample3 = " + (sample2 == sample3.trim()));

        System.out.println("Sample3 = " + sample3.trim());
        //runtime
        System.out.println("sample1.equals(sample2) = " + sample1.equals(sample2));
        System.out.println("sample1.equals(sample3) = " + sample1.equals(sample3));
        System.out.println("sample2.equals(sample3) = " + sample2.equals(sample3));

        System.out.println("sample1.equals(sample3.trim()) = " + sample1.equals(sample3.trim()));
        System.out.println("sample2.equals(sample3.trim()) = " + sample2.equals(sample3.trim()));


    }
}