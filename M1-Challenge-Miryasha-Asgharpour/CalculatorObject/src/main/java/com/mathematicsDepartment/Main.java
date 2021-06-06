package com.mathematicsDepartment;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the first number please ");
        double firstNumInput = userInput.nextDouble();

        System.out.println("Enter the second number please ");
        double secondNumInput = userInput.nextDouble();

        System.out.println("Select your arithmetic operator\n" +
                "It's not case sensitive\n" +
                "Type A for Addition ** D => Division ** M => Multiplication ** S => Subtraction ");
        String operatorInput = userInput.next().toLowerCase(Locale.ROOT);


        if( operatorInput.equals("a") ){
            Addition addition = new Addition(firstNumInput, secondNumInput);
            System.out.println(firstNumInput + "+" + secondNumInput + "=" + addition.Adder());
        }
        else if ( operatorInput.equals("d") ){
            Division division = new Division(firstNumInput,secondNumInput);
            System.out.println(firstNumInput + "/" + secondNumInput + "=" +division.divider());
        }
        else if ( operatorInput.equals("m")){
            Multiplication multiplication = new Multiplication(firstNumInput,secondNumInput);
            System.out.println(firstNumInput + "*" + secondNumInput + "=" +multiplication.multiplier());
        }
        else {
            Subtraction subtraction = new Subtraction(firstNumInput,secondNumInput);
            System.out.println(firstNumInput + "-" + secondNumInput + "=" +subtraction.subtractor());
        }
    }
}
