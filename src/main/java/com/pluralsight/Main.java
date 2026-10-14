package com.pluralsight;
import java.util.Arrays;
import java.util.Scanner;


//import java.*; ?

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter first number: ");
        int firstNum = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNum = scanner.nextInt();

        System.out.println("Possible calculations: ");
        System.out.println(" Enter '(A)dd', '(S)ubtract', '(M)ultiply', or '(D)ivide': ");
        System.out.print("Please select an option: ");
        String action = scanner.next();

        int multiplyNums = firstNum * secondNum;

        System.out.println(firstNum + " multiplied by " + secondNum + " = " + multiplyNums);

        scanner.close();


        //add "please select option "




//Practice

        /*
        System.out.print("What is your favorite movie?");
        String favMovie = scanner.nextLine();

        System.out.print(" ");

        System.out.print("How many hours a day do you watch movies?");
        int hoursWatched = scanner.nextInt();

        System.out.println("Thank you for answering!");

        //close scanner
        scanner.close();


         */




    }
}
