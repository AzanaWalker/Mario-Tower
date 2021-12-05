package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);
        int max = 0;
        System.out.println("How tall would you like your mario tower? Pick a number between 1 and 8");
        max = keyboard.nextInt();

        if ( max  < 1 || max > 8){
            System.out.println("Value invalid. Please reenter a correct value");
            max = keyboard.nextInt();
        }

        for (int i = 0; i < max; i++)
        {
            for (int w = 0; w < max - i - 1; w++)  // starting from the bottom. 0-3 printing spaces
            {
                System.out.print(" ");             // helps the tower center and allows hashes on each side
            }

            for (int y = 0; y < i + 1; y++) // y is yellow/colored block --> STARTING A LOW POINT & GOING UP
            {
                System.out.print("#");     // no print ln cause you're printing blocks straight down
            }

            for (int y = 0; y < i + 1; y++) // same loop another time to print on other side
            {
                System.out.print("#");     //
            }

            System.out.println("");
        }
    }
}
