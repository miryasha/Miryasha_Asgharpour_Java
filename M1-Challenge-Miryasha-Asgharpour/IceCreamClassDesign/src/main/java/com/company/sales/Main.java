package com.company.sales;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        Inventory inventory = new Inventory(2, "Ice Cream type one");
        CashRegister cashRegister = new CashRegister(5,"Ice Cream Type two", true,100);

        System.out.println("How many sell would you like to have?");
        int sellRound = userInput.nextInt();


        while (sellRound > -1 ){
            System.out.println("Amount has paid");

            cashRegister.sell(userInput.nextInt());

            sellRound -= 1;
        }
        cashRegister.putOrder();
        cashRegister.turningOff();
    }
}
