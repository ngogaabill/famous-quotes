package com.pluralsight;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String[] quotes = {
                "Success is not final, failure is not fatal: It is the courage to continue that counts. – Winston Churchill",
                "Do not wait to strike till the iron is hot; but make it hot by striking. – William Butler Yeats",
                "The only way to do great work is to love what you do. – Steve Jobs",
                "Discipline equals freedom. – Jocko Willink"};
        Scanner scnr = new Scanner(System.in);
        String repeat;
        do {

            System.out.println("Enter a number to print a quote(1-4)");
            try {
                int input = scnr.nextInt();
                System.out.println(quotes[input - 1]);
            } catch (InputMismatchException e) {
                System.err.println("Not a number");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Number is out of range");
            }
            System.out.println("Do you want to see another quote(Yes/No)");
            scnr.nextLine();
            repeat = scnr.nextLine();
            if(repeat.equalsIgnoreCase("No")){
                break;
            }
        } while (repeat.equalsIgnoreCase("Yes"));
    }
}
