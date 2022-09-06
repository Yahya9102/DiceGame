package com.Yahya.Dicegame;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        Dice myGameDice = new Dice(6);

        System.out.println("Hello and welcome to the game of Dice");

        System.out.println("Please select two player names");
        Player.player1 = myScanner.next();
        Player.player2 = myScanner.next();
        System.out.println("Welcome players: " + Player.player1 + " " + "and" + " " + Player.player2);

        String diceAmount1 = "1";
        String diceAmount2 = "2";


        System.out.println("Please select amount of dice 1 or 2");
        String diceAmount = myScanner.next();

        if (diceAmount.equals(diceAmount1)) {

            System.out.println("You have chosen 1 dice");
            System.out.println("Each player gets 5 turns. Good luck!");
        }

        System.out.println(Player.player1 + " " + "is rolling the dice");

        if (diceAmount.equals(diceAmount1)) {

             int [] player1Score = new int[5];
             int totalScoreP1 = 0;

            for (int i = 0; i < player1Score.length; i++) {

                int temp = myGameDice.throwDice();

                player1Score[i] = temp;
                totalScoreP1 += temp;

                System.out.println(temp);

            }

            System.out.println("The total score of: " + Player.player1 + " is" + " " +  (totalScoreP1));
            System.out.println("Its time for " + Player.player2 + " " + "to roll the dice");


            int [] player2Score = new int[5];
            int totalScoreP2 = 0;

            for (int i = 0; i < player2Score.length; i++) {

                int temp = myGameDice.throwDice();

                player2Score[i] = temp;
                totalScoreP2 += temp;

                System.out.println(temp);

            }
                System.out.println("The total score for: "  + Player.player2 + " is " + (totalScoreP2));

                if (totalScoreP1 > totalScoreP2) {
                    System.out.println("Congratulations to our winner! " + " " + Player.player1);

                }
                else System.out.println("Congratulations to our winner! " + " " + Player.player2);

                } else if (diceAmount.equals(diceAmount2)) {

                     System.out.println("You have chosen 2 dices");
                     System.out.println("Each player gets 5 turns. Good luck!");

            int [] player1Score = new int[5];
            int totalScoreP1 = 0;


            for (int i = 0; i < player1Score.length; i++) {
                int temp1 = myGameDice.throwDice()*2;

                player1Score[i] = temp1;
                totalScoreP1 += temp1;

                System.out.println(temp1);

            }

            System.out.println("The total score of: " + Player.player1 + " is" + " " +  (totalScoreP1));
            System.out.println("Its time for " + Player.player2 + " " + "to roll the dice");


            int [] player2Score = new int[5];
            int totalScoreP2 = 0;


            for (int i = 0; i < player2Score.length; i++) {
                int temp2 = myGameDice.throwDice()*2;

                player2Score[i] = temp2;
                totalScoreP2 += temp2;
                System.out.println(temp2);
            }
            System.out.println("The total score for: "  + Player.player2 + " is " + (totalScoreP2));

            if (totalScoreP1 > totalScoreP2) {
                System.out.println("Congratulations to our winner! " + " " + Player.player1);

            }
            else System.out.println("Congratulations to our winner! " + " " + Player.player2);

        }

    }

}
