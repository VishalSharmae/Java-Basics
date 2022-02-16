package javaprojects.learning;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 1% interest = " + calculateInterest(10000d,1d));
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000d,2d));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000d,3d));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000d,4d));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000d,7d));

        for (int i =0; i<5 ; i++){
            System.out.println("Loop " + i + " hello!");
        }
        for (int value = 2; value<9; value++ ){
            System.out.println("10,000 at " + value + "% interest = " + String.format("%.2f",calculateInterest(10000 , value)));
        }
        System.out.println("**************************************");
        for (int value = 8; value>1; value-- ){
            System.out.println("10,000 at " + value + "% interest = " + String.format("%.2f",calculateInterest(10000 , value)));
        }
        int count = 0;
        for ( int i = 10; i< 100; i++){
         if(prime(i) == true){
             count++;
             System.out.println(i + " is a Prime Number");
             if (count == 10){
                 System.out.println("Exiting the Loop");
                 break;
             }
         }

        }

    }
        public static double calculateInterest(double amount, double interestRate){
            return(amount * (interestRate/100));
        }

        public static boolean prime(int n){
        if (n==1){
            return false;
        }
        for (int i=2; i<= n/2; i++){
            if(n%i == 0){
                return false;
            }

        }
        return true;
        }

}
