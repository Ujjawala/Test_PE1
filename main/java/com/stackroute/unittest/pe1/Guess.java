package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class Guess {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        int x = 18;
        do {
            System.out.println("Enter number between 1 - 50");
            int n = scanner.nextInt();
            if (n > x) System.out.println("Number guessed is more than original number");
            else if (n < x) System.out.println("Number guessed is less than original number");
            else {
                System.out.println("Number guessed matches the original number");
                break;
            }
        }while (true);
    }
}
