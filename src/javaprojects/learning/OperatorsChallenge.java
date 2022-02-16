package javaprojects.learning;

public class Main {

    public static void main(String[] args) {

    double myNumber1 = 20.00d;
    double myNumber2 = 80.00d;

    double result1 = (myNumber1 + myNumber2) * 100;
        System.out.println("My values total is " + result1);

    result1 = result1 % 40.00d;
        System.out.println("Remainder is equal to " + result1);

    boolean reminderValue = (result1 == 0) ? true : false;
        System.out.println(reminderValue);

    if (!reminderValue){
        System.out.println("Got some remainder");
    }

    }
}
