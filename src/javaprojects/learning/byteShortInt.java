package javaprojects.learning;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));
        System.out.println("Busted Min Value = " + (myMinIntValue - 1));
        System.out.println((myValue * myValue));

        byte myByteMinValue = Byte.MIN_VALUE;
        byte myByteMaxValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myByteMinValue);
        System.out.println("Byte Maximum Value = " + myByteMaxValue);

        short myShortMinValue = Short.MIN_VALUE;
        short myShortMaxValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myShortMinValue);
        System.out.println("Short Maximum Value = " + myShortMaxValue);
        
        long myLongValue = 100L;

        long myLongMinValue = Long.MIN_VALUE;
        long myLongMaxValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myLongMinValue);
        System.out.println("Long Maximum Value = " + myLongMaxValue);

        long myLongestNumber = 2147483647234L;
        System.out.println(myLongestNumber);

        int myTotal= (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myByteMinValue/2);

        short myNewShortValue = (short) (myShortMinValue / 2);

        byte myChallengeByteValue = 85;
        short myChallengeShortValue = 565;
        int myChallengeIntValue = 650025;
        long myChallengeLongValue =(long) (50000 + 10 * (myChallengeByteValue + myChallengeShortValue + myChallengeIntValue));
        System.out.println("Answer to my Challenge question is equals to " + myChallengeLongValue);


        













    }
}
