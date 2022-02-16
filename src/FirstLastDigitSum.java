public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){

        if (number < 0){
            return -1;
        }

        int sum;
        int lastDigit ;
        int firstDigit = 0;
        lastDigit = number % 10;

        while (number > 0){
            firstDigit = number % 10;
            number /= 10;
        }
        sum = lastDigit +firstDigit;
        return sum;

    }
}
