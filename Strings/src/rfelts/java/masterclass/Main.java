package rfelts.java.masterclass;

public class Main {

    public static void main(String[] args) {
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        String myString = "this is a string";
        System.out.println("My String is equal to " + myString);
        myString = myString + " and more";
        System.out.println("My String is equal to " + myString);
        myString = myString + " \u00A9 2020.";
        System.out.println("My String is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.45";
        System.out.println(numberString);

        String lastString = "10";
        int lastInt = 50;
        lastString = lastString + lastInt;
        System.out.println("Last string is " + lastString);

    }
}
