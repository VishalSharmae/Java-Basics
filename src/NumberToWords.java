public class NumberToWords {
    public static void numberToWords(int number){
        if(number< 0 ){
            System.out.println("Invalid Value");
        }
        int num = number;
        while (num > 0){
            int digit = num % 10;
            if (digit == 0){
                System.out.println("Zero");
            }
            else if (digit == 1){
                System.out.println("One");
            }
            else if (digit == 2){
                System.out.println("Two");
            }
            else if (digit == 3){
                System.out.println("Three");
            }
            else if (digit == 4){
                System.out.println("Four");
            }
            else if (digit == 5){
                System.out.println("Five");
            }
            else if (digit == 6){
                System.out.println("Six");
            }
            else if (digit == 7){
                System.out.println("Seven");
            }
            else if (digit == 8){
                System.out.println("Eight");
            }
            else if (digit == 9){
                System.out.println("Nine");
            }
            else {
                System.out.println("Invalid Number");
            }
            num /= 10;
        }
    }

    public static void reverse( int number){

        number = 45;

    }

    public static void main(String[] args) {
        numberToWords(1356);
    }
}
