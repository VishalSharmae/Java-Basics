package javaprojects.learning;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 4000 && score > 1000) {
//            System.out.println("Your score was less than 4000 and greater than 1000");
//            System.out.println("This is also executed.");
//
//        }
//        else if (score < 1000) {
//            System.out.println("Your score was less than 1000");
//        }
//        else {
//            System.out.println("Your score was more than 4000");
//        }


        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your Final Score is equals to " + finalScore);
        }
        else {
            System.out.println("Game is not over yet!");
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        gameOver = true;
        if (gameOver) {
            System.out.println("Final score of second player is equals to " +(score + (levelCompleted * bonus)) );
        }
        

    }
}
