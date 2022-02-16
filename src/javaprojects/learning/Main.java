package javaprojects.learning;

public class Main {

    public static void main(String[] args) {


      boolean isnom =  isPalindrome(11);
        System.out.println(isnom);
    }
    public static boolean isPalindrome(int number){

        if (number < 0){

            number *= -1;

        }

        int reverse = 0;
        int sorted = number;

        while (sorted>0){

            int lastDigit = sorted % 10;
            reverse *= 10 ;
            reverse += lastDigit;
            sorted /=10;

        }
        if(number == reverse){
            return true;
        }
        else {
            return false;
        }

    }
}
