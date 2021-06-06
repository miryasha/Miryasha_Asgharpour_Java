package com.gameClub;

import java.util.Scanner;

public class Enemy extends Players{
    Scanner userInput = new Scanner(System.in);

    public Enemy(String name, int strength, int health, int stamina, int speed, int attackPower) {
        super("Computer", strength, health, stamina, speed, attackPower);
    }

    public void start(){


       // Players computer = new Players();

    }
}
