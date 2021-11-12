package com.example.guess;

import java.util.Random;
import java.util.Scanner;
   
class Main {
    private static final Random r = new Random();
    private static final int NUMBER = r.nextInt(100) + 1;
    private static int guess = 0;

    public static void main(String[] args) {  
        Scanner player = new Scanner(System.in);
            System.out.println("the number is " + String.valueOf(NUMBER)); //  This is a debug string
            while ( guess != NUMBER ) {
            // Here we can prompt user to pick a number
            System.out.println("Please pick a number between 1 and 100");
            guess = player.nextInt();
            if ( guess > NUMBER ) {
                System.out.println("Way up there :)");
            } else if ( guess < NUMBER ) {
                System.out.println("Number is higher :)");
            } else {
                System.out.println("Correct!");
                System.exit(0);
            }
        }
  }
}