package com.gameClub;

public class Warrior extends Players{

    private int shieldStrength = 100;
    public Warrior(String name) {
        super(name, 75, 100, 100, 50, 10);
    }

    public int decreaseShieldStrength(){
        System.out.println("I'm under attack!");
        return shieldStrength - 3;

    }
}
