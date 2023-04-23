package com.coderscampus.assignment2;

import java.util.Random;
import java.util.Scanner;

public class assighment2 {
    public static void main(String[] args) {

        Random number = new Random();
        int maxAttempts = 5;
        int theirGuess;

        System.out.println("Please pick a number between 1 and 100");
        Scanner scanner = new Scanner(System.in);

        int randomNumber = number.nextInt(101);
        while (maxAttempts > 0) {
            theirGuess = scanner.nextInt();
            if (theirGuess > 100 || theirGuess < 1) {
                System.out.println("Your guess is not between 1 and 100, please try again");
                continue;
            }
            if (theirGuess == randomNumber) {
                System.out.println("You win!");
                break; // exit the loop if the user guessed correctly
            } else if (theirGuess > randomNumber) {
                System.out.println("Pick a lower number");
            } else if (theirGuess < randomNumber) {
                System.out.println("Pick a higher number");
            }
            maxAttempts--;
            if (maxAttempts == 0) {
                System.out.println("You lose");
                System.out.println("The number to guess was: " + randomNumber);
            }
        }
    }
}
