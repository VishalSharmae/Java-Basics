package javaprojects.learning;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2 ; // 1 + 3 = 3
        System.out.println( "1 + 2 = " + result );

        int previousResult = result;
        System.out.println("Previous Result is equals to " + previousResult);

        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("Previous Result is equals to " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println( "2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 5
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the reminder of (4 % 3) = 1
        System.out.println( "4 % 3 = " + result);

        // result = result + 1;
        result++; // 1+1 =2
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // result = result + 2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        result += 5; // result = 3 + 5 = 8
        System.out.println("3 + 5 = " + result);

        // result = result * 10;
        result *= 10; // 8 * 10 = 80
        System.out.println("8 * 10 = " + result);

        result -= 50;
        System.out.println(result);

        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        result -= 10;
        System.out.println("8 - 8 = " + result);

        System.out.println("This is the end of Program");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an Alien!");
            System.out.println("And I am scared of Aliens..");

        }
        int topScore = 80;
        if (topScore < 100){
            System.out.println("You got the Highest Score!");
        }
        int secondTopScore = 79;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than Second top score and less than 100");
        }
        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either of both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("There is no error");
        }
        boolean isCar = false;
        if (isCar){
            System.out.println("This is not supposed to happen");
        }
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar){
            System.out.println("wasCar is True");
        }

        int ageOfClient = 20;
        boolean isEighteenOrOver = (ageOfClient > 18) ? true : false;
        if (isEighteenOrOver){
            System.out.println("Age of Client is over 18");
        }
        












    }
}
