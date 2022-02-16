public class SharedDigit {
//    public static boolean hasSharedDigit( int firstNumber, int secondNumber){
//
//        if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99){
//            return false;
//        }
//        int lastDigitInFirstNumber = firstNumber % 10;
//        int firstDigitInFirstNumber = firstNumber /10;
//
//        int lastDigitSecondNumber = secondNumber % 10;
//        int firstDigitInSecondNumber = secondNumber /10;
//
//        if ((lastDigitInFirstNumber == lastDigitSecondNumber || lastDigitInFirstNumber == firstDigitInSecondNumber)){
//            return true;
//        }
//        else if ((firstDigitInFirstNumber == lastDigitSecondNumber || firstDigitInFirstNumber == firstDigitInSecondNumber)){
//            return true;
//        }
//        else{
//            return false;
//        }
//
//    }
    public static boolean hasSharedDigit(int n1, int n2){
        if ((n1 < 10) || (n1 > 99) || (n2 < 10) || (n2 >99)){
            return false;
        }
        int num2= n2;
        int ln1 = 0;
        while (n1 > 0){
            ln1 = n1 % 10;
            while (num2 > 0){
                if (ln1 == num2 % 10){
                    return true;
                }
                num2 /= 10;
            }
            if (n1 == n2 % 10){
                return true;
            }
            n1 /= 10;
        }
        return false;
    }

    public static boolean hasSameLastDigit(int a, int b, int c){
        if ((a < 0) || (a >999) || (b < 0) || (b>999) || (c< 0) || (c>999)){
            return false;
        }
        int la = a % 10;
        int lb = b % 10;
        int lc = c % 10;

        if ((la == lb) || (la == lc) || (lb == lc)){
            return true;
        }
        return false;
    }

    public static int getGreatestCommonDivisor(int first, int second){

        if ((first < 10) || (second < 10)){
            return -1;
        }

        while (first != second) {
            if (first > second) {
                first -= second;
            } else {
                second -= first;
            }
        }
        return second;
        }

    public static int getGreatestCommonDivisor2(int first, int second){

        if ((first < 10) || (second < 10)){
            return -1;
        }
        int divisor = 0;
        int min = Math.min(first, second);
        while (min> 1){
            if ((first % min == 0) && (second % min == 0)){
                return divisor = min;
            }
            min--;
        }
        return 1;
    }


    public static boolean isValid(int number){
        if ((number < 0) || (number >999)){
            return false;
        }
        return true;
    }

    public static void printFactors(int number){
        if (number < 1){
            System.out.println("Invalid Value");
        }
        for (int i = 1; i <= number; i++){
            if (number % i == 0){
                System.out.println(i);
            }
        }
    }

    public static boolean isPerfectNumber(int number){
        if (number< 0){
            return false;
        }

        int sum = 0;
        for (int i = 1; i<number; i ++){
            if (number % i==0){
                sum+=i;
            }
        }
        return sum == number;
    }

    public static void main(String[] args) {
        int a = getGreatestCommonDivisor2(66,121);
        System.out.println(a);
        printFactors(10);
    }
}
