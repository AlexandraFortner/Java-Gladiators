package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Gladiator player1 = new Gladiator(100, 5, 10, 20);
        Gladiator player2 = new Gladiator(100, 5, 5, 30);
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter Player 1's name: ");
        String player1Name = reader.next();
        System.out.println("Enter Player 2's name: ");
        String player2Name = reader.next();
        System.out.println("(" + player1Name + ")\nHealth:" + player1.health);
        System.out.println("(" + player2Name + ")\nHealth:" + player2.health);
        reader.close();
    }
}