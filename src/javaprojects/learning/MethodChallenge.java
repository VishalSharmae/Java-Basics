package javaprojects.learning;

public class Main {

    public static void main(String[] args) {


        int returnedvalue = calculateHighScorePosition(1500);
        displayHighScorePosition("Vishal Sharma", returnedvalue);


        returnedvalue = calculateHighScorePosition(900);
        displayHighScorePosition("Vikas Sharma", returnedvalue);


        returnedvalue = calculateHighScorePosition(400);
        displayHighScorePosition("Ashish Sharma", returnedvalue);


        returnedvalue = calculateHighScorePosition(40);
        displayHighScorePosition("Manoj Sharma", returnedvalue);




    }

    public static void displayHighScorePosition(String playerName, int position){

        System.out.println(playerName + " " + "managed to get into position " + position + " on the high score table");

    }

    public static int calculateHighScorePosition(int playerScore) {

//        if (playerScore > 1000) {
//            return 1;
//        }
//        else if (playerScore > 500 && playerScore < 1000) {
//            return 2;
//        }
//
//        else if ( playerScore > 100 && playerScore < 500) {
//            return 3;
//        }
//        else {
//            return 4;
//        }
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        }else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}
