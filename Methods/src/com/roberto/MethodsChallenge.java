package com.roberto;

/**
 * @author Roberto Affonso, created on 12/03/18
 **/
// Create a method called displayHighScorePosition
// it should a players name as a parameter, and a 2nd parameter as a position in the high score table
// You should display the players name along with a message like " managed to get into position " and the
// position they got and a further message " on the high score table".
//
// Create a 2nd method called calculateHighScorePosition
// it should be sent one argument only, the player score
// it should return an int
// the return data should be
// 1 if the score is >=1000
// 2 if the score is >=500 and < 1000
// 3 if the score is >=100 and < 500
// 4 in all other cases
// call both methods and display the results of the following
// a score of 1500, 900, 400 and 50
//
public class MethodsChallenge
{
    public static void main(String[] args)
    {
//        int highScore = calculateScore(true, 800, 5, 100);
//        System.out.println("Your high score is: " + highScore);
//
//        highScore = calculateScore(true, 10000, 8, 200);
//        System.out.println("Your high score is: " + highScore);

        displayHighScorePosition("john", calculateHighScore(1500));
        displayHighScorePosition("jane", calculateHighScore(900));
        displayHighScorePosition("jim", calculateHighScore(400));
        displayHighScorePosition("jack", calculateHighScore(50));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus)
    {
        if (gameOver)
        {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;
    }

    public static int calculateHighScore(int highScore)
    {
        if(highScore >= 1000)
        {
            return 1;
        }
        else if(1000 > highScore && highScore >= 500)
        {
            return 2;
        }
        else if(500 > highScore && highScore >= 100)
        {
            return 3;
        }
        else
        {
            return 4;
        }
    }

    public static void displayHighScorePosition(String name, int position)
    {
        if(position == 1)
        {
            System.out.println("Congratulations " + name + "! You have reached the top score!");
        }
        System.out.println(name + " managed to get into position " + position);
    }
}
