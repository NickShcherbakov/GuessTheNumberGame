package org.example;

import java.util.Random;
import java.util.Scanner;

public class TryGame {

    public void game(){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(10) + 1;
        int attemps = 0;
        int maxAttemps =3;
        int guess=0;

        System.out.println("Welcome! This game is called 'Guess the Number'!");
        System.out.println("I picked a number from 1 to 10. Try to guess it!");

        while (attemps<maxAttemps && guess != numberToGuess){
            System.out.println("Enter your number:");
            try {
                guess = scanner.nextInt();
                attemps++;

                if(numberToGuess < guess){
                    System.out.println("Your number is bigger!");

                }else if(numberToGuess > guess){
                    System.out.println("Your number is less!");
                } else {
                    System.out.println("Congratulations! You guessed the number for "+ attemps + " attemps");
                }


            }catch (Exception e){
                System.out.println("Please enter a valid integer!");
                scanner.next();
            }

        }
        if (numberToGuess != guess){
            System.out.println("You lost. The correct number was "+numberToGuess + ".");
        }




    }

}
