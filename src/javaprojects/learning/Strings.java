package javaprojects.learning;

public class Main {

    public static void main(String[] args) {

        // byte
        // short
        //int
        // long
        //float
        //double
        //char
        //boolean

        String myString = "This is a string";

        System.out.println("myString is equal to " + myString);

        myString= myString + ", and this is more.";

        System.out.println("myString is equal to " + myString);

        myString = myString + " \u00A9 2021";

        System.out.println("myString is equal to " + myString);

        String numberstring = "2015.55";

        numberstring = numberstring + " 49.95";

        System.out.println(numberstring);

        String lastString = "120";
        int myInt = 56;
        lastString = lastString + myInt ;
        System.out.println("LastString is equals to " + lastString);

        double myDouble = 120.56d;
        lastString = lastString + myDouble;
        System.out.println("LastString is equals to " + lastString);






    }
}
