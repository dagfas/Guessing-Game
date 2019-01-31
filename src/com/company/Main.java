package com.company;

import java.util.Scanner;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int randNum = random.nextInt(10) + 1;
        //Min value is 1
        //Max value is 2

        System.out.println("I have chose a number between 1 to 10");
        System.out.println("Guess the number");
        int guessedNum = scanner.nextInt();


        while (guessedNum != randNum) {
            System.out.println("try again; the random number was: " + randNum);
            System.out.println("Enter another number");
            guessedNum = scanner.nextInt();
        }
        System.out.println("You are correct");
    }
}


