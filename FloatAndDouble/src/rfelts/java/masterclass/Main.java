package rfelts.java.masterclass;

public class Main {

    public static void main(String[] args) {
	    float myFloatMinValue = Float.MIN_VALUE;
	    float myFloatMaxValue = Float.MAX_VALUE;
        System.out.println("Float min value " + myFloatMinValue);
        System.out.println("Float max value " + myFloatMaxValue);

        double myDoubleMinValue = Double.MIN_VALUE;
        double myDoubleMaxValue = Double.MAX_VALUE;
        System.out.println("Double min value " + myDoubleMinValue);
        System.out.println("Double max value " + myDoubleMaxValue);

        int myInt = 5;
        float myFloat = 5;
        double myDouble = 5;

        System.out.println("My int " + myInt);
        System.out.println("My Float " + myFloat / 3 );
        System.out.println("My Double " + myDouble / 3);

        double numPounds = 3;
        double numKilograms  = numPounds * .45359237;
        System.out.println(numPounds + " lbs is " + numKilograms + "kg");
    }
}
