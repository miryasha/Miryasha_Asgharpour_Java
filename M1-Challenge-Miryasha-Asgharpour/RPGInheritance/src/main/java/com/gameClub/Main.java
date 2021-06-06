package com.gameClub;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        Farmer farmer1 = new Farmer("Yasha", 10);
        Constable constable1 = new Constable("Ben");
        Warrior warrior1 = new Warrior("Timur");


        System.out.println(farmer1.attack());

        System.out.println(warrior1.decreaseShieldStrength());
        System.out.println("============");
        System.out.println(constable1.arrest("Yahsa"));
        System.out.println("============");
        System.out.println(constable1.betray());





    }
}
