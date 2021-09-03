/*
 *  UCF COP3330 Fall 2021 Assignment 04 Solution
 *  Copyright 2021 Michael Andrich
 */

/*
    prompt user for a noun, verb, adjective and an adverb
    store all of the inputs and put into a string that creates a little story
 */

import java.util.Scanner;

public class solution04 {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a noun: ");

        String fnoun = sc.nextLine();



        System.out.println("Enter a verb: ");

        String fverb = sc.nextLine();

        System.out.println("Enter an adjective: ");

        String fadjective = sc.nextLine();

        System.out.println("Enter an adverb: ");

        String fadverb = sc.nextLine();



        System.out.println("Do you "+fverb+" your "+fadjective+ " "+fnoun+" " +fadverb+"? That's hilarious! ");
    }
}
