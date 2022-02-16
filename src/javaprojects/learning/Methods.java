package javaprojects.learning;

public class Main {

    public static void main(String[] args) {

       int highScore=  calculateScore(true, 800, 5, 100);

        System.out.println("The Final Score Was " + highScore);

        highScore= calculateScore(true, 10000, 8, 200);

        System.out.println("The Final Score was " + highScore);
    }

    public static int calculateScore( boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore = finalScore + 1000;
            // System.out.println("Your Score was " + finalScore);
            return finalScore;
        }
        else {
            return -1;
        }
    }
}
