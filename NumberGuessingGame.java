package Oasis_InfoByte;

import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int randomNum = rand.nextInt(100) + 1;
        // System.out.println(randomNum);
        int noOfAttempt = 5;
        int attemptDone = 1;
        int number = 0;
        System.out.println("-----Welcome to Number Guessing Game----");
        System.out.println("Guess the correct number and win the game!");
        System.out.println("You have 5 Attempts to Guess the Number");
        System.out.println();
        System.out.print("Enter number between 1 and 100 : ");
        while (number != randomNum) 
        {
            number = scan.nextInt();

            if (number <= 100 && number >= 1) 
            {
                if (number == randomNum) 
                {
                    System.out.println("You Got the Correct Number");
                    System.out.println("Congratulations You WIN in " + (attemptDone) + " Attempts!!");
                    break;
                } 
                else if (number > randomNum)
                    {
                        System.out.println("Think for a Smaller Number!!");
                        System.out.println("Attempts Left : " + (noOfAttempt-attemptDone));
                    }
                else if (number < randomNum)
                {
                    System.out.println("Think for a Greater Number");
                    System.out.println("Attempts Left : " + (noOfAttempt-attemptDone));
                }
                attemptDone++;
                if (attemptDone > noOfAttempt) 
                {
                    System.out.println("You Reached the Max Limit of Guessing Allowed!!");
                    System.out.println("You LOSE");
                    System.out.println("Correct answer was : " + randomNum);
                }
            }

            System.out.print("Again Enter number between 1 and 100 : ");
        }

        scan.close();
    }
}
