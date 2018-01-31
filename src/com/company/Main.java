package com.company;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void menu(Gladiator player1, Gladiator player2){

        Gladiator attacker = player1;
        Gladiator defender = player2;
        int turn = 0;
        while(!player1.isDead() && !player2.isDead()){
            if (turn == 0){
                attacker = player1;
                defender = player2;
                turn = 1;
            } else {
                defender = player1;
                attacker = player2;
                turn = 0;
            }
            Scanner reader = new Scanner(System.in);  // Reading from System.in
            System.out.println("Gladiator 1 -Health: " + player1.health + " Rage:" + player1.rage);
            System.out.println("Gladiator 2 -Health: " + player2.health + " Rage:" + player2.rage);
            System.out.println("[A]ttack [H]eal [Q]uit");
            String action = reader.nextLine();
            if (action.equals("a")){
                attacker.attack(defender);
                System.out.println("Attacked!");
            } else if (action.equals("h")){
                attacker.heal();
            } else if (action.equals("q")){
                System.out.println("Quitting...");
                System.exit(0);
            } else {
                System.out.println("Cannot compute...");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Reading from System.in
        Gladiator player1 = new Gladiator(100, 5, 10, 20);
        Gladiator player2 = new Gladiator(100, 5, 5, 30);
        /* System.out.println("Enter Player 1's name: ");
           String player1Name = scan.nextLine();
           System.out.println("Enter Player 2's name: ");
           String player2Name = scan.nextLine();*/
        menu(player1, player2);
        scan.close();
    }
}