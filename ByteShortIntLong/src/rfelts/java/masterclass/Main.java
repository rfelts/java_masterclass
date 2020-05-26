package rfelts.java.masterclass;

public class Main {

    public static void main(String[] args) {

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Min value = " + myMinIntValue);
        System.out.println("Integer Max value = " + myMaxIntValue);
        System.out.println("Integer Max value = " + (myMaxIntValue + 1));
        System.out.println("Integer Min value = " + (myMinIntValue - 1));

        byte myByteMinValue = Byte.MIN_VALUE;
        byte myByteMaxValue = Byte.MAX_VALUE;
        System.out.println("Byte Min Value " + myByteMinValue);
        System.out.println("Byte Max Value " + myByteMaxValue);

        short myShortMinValue = Short.MIN_VALUE;
        short myShortMaxValue = Short.MAX_VALUE;
        System.out.println("Short Min Value " + myShortMinValue);
        System.out.println("Short Max Value " + myShortMaxValue);

    }
}
