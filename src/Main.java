import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String playA = "";
        String playB = "";

        System.out.print("Enter move for Player A [RPS]: ");
        playA = in.nextLine();
        playA = playA.toUpperCase();

        System.out.print("Enter move for Player B [RPS]: ");
        playB = in.nextLine();
        playB = playB.toUpperCase();

        System.out.println("\nPlayer A: " + playA + "   Player B: " + playB + "\n");

        if(!playA.matches("[RPS]") || !playB.matches("[RPS]"))  // If either player make an illegal move
        {
            System.out.println("\nIllegal Move:\nPlayer A: " + playA + "\nPlayer B: " + playB);
        }
        else  // play the game! use a cross product to determine the resuls
        {
           if(playA.equals("R"))
           {
               if(playB.equals("R"))
               {
                   System.out.println("Rock vs Rock! It's a Tie!");
               }
               else if (playB.equals("P"))
               {
                   System.out.println("Paper covers Rock! Player B Wins!");
               }
               else // PlayB is Scissors
               {
                   System.out.println("Rock breaks Scissors! Player A Wins");
               }
           }
           else if (playA.equals("P"))
           {
               if(playB.equals("R"))
               {
                   System.out.println("Paper covers Rock! Player A Wins!");
               }
               else if (playB.equals("P"))
               {
                   System.out.println("Paper vs Paper! It's a Tie!");
               }
               else // PlayB is Scissors
               {
                   System.out.println("Scissors cuts Paper! Player B Wins");
               }
           }
           else // PlayA is Scissors
           {
               if(playB.equals("R"))
               {
                   System.out.println("Rock breaks Scissors! Player B Wins!");
               }
               else if (playB.equals("P"))
               {
                   System.out.println("Scissors cuts Paper! Player A Wins!");
               }
               else // PlayB is Scissors
               {
                   System.out.println("Scissors vs Scissors! It's a Tie");
               }
           }
        }

    }
}