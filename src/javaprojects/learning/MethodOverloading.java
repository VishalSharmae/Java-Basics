package javaprojects.learning;

public class Main {

    public static void main(String[] args) {

    calcFeetAndInchesToCentimeter(157);

    }
    public static double calcFeetAndInchesToCentimeter(double feet, double inches){
        double centimeter;
        if (feet >= 0 && (inches >= 0 && inches <= 12)){
            centimeter = ((feet *12) *2.54) + (inches *2.54);
            System.out.println(feet + " feet " + inches + " inches = " + centimeter + "cm");
            return centimeter;
        }
        else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeter(double inches){

        if (inches < 0){

            return -1;
        }
        double feet = (int) inches/12;
        double remainingInches= (int) inches %12;
        System.out.println(inches + "inches = " + feet + "fts and " + remainingInches + " in.");
        return calcFeetAndInchesToCentimeter(feet, remainingInches);
    }

}
