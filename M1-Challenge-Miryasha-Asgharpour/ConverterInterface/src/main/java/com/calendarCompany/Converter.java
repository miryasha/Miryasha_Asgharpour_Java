package com.calendarCompany;

import java.util.Locale;
import java.util.Scanner;


public class Converter implements ConverterIf, ConverterSwitch {

    Scanner userInput = new Scanner(System.in);

   public void start(){

       boolean startingQuestion = false;

       System.out.println("Welcome!\n" +
               "Please Specify which implementation you would like to test \n" +
               "If statement or Switch statement\n" +
               "==> for If, type <if> and for Switch type <switch> \n" +
               "** It's not case sensitive!! **");
       Scanner userInput = new Scanner(System.in);
       while (!startingQuestion){
           String userAnswer = userInput.nextLine().toLowerCase(Locale.ROOT);

           if ( userAnswer.equals("if") ) {
               startingQuestion = true;
               convertMonth();
               convertDay();

           } else if ( userAnswer.equals("switch") ) {
               startingQuestion = true;
               convertMonthUsingSwitch();
               convertDayUsingSwitch();
           } else {
               System.out.println("==> for If, please type <if> and for Switch please type <switch>\n" +
                       " ** Try Again!! **");

           }
       }
   }


    @Override
    public void convertMonth() {

       boolean validAnswer = false;

       System.out.println("=======================\n" +
                "Please enter the number you wish to convert to a month\n" +
                " ==> Note that Numbers should be in between 1 and 12");

       while (!validAnswer){
           int monthNumInput = userInput.nextInt();


           if( checkMonthNum(monthNumInput) ){
               validAnswer = true;
               String monthName = generateMonthName(monthNumInput);
               System.out.println("Your Month name is : " + monthName);

           }
           else {
               System.out.println("Numbers should be in between 1 and 12");

           }
       }


    }

    @Override
    public void convertDay() {

        boolean validAnswer = false;

        System.out.println("=======================\n" +
                "Please enter the number you wish to convert to a Day\n" +
                " ==> Note that Numbers should be in between 1 and 7");

        while (!validAnswer){
            int dayNumInput = userInput.nextInt();

            if(checkDayNum(dayNumInput)){
                validAnswer = true;
                String dayName = generateDayName(dayNumInput);
                System.out.println("Your Day name is : " + dayName);


            }
            else {
                System.out.println("Numbers should be in between 1 and 7");

            }
        }

    }


    @Override
    public void convertMonthUsingSwitch(){

        boolean validAnswer = false;

        System.out.println("=======================\n" +
                "Please enter the number you wish to convert to a month\n" +
                " ==> Note that Numbers should be in between 1 and 12");

        while (!validAnswer){
            int monthNumInput = userInput.nextInt();

            if( checkMonthNum(monthNumInput) ){
                validAnswer = true;
                String monthName = generateMonthNameWithSwitch(monthNumInput);
                System.out.println("Your Month name is : " + monthName);

            }
            else {
                System.out.println("Numbers should be in between 1 and 12");

            }

        }

    }

    @Override
    public void convertDayUsingSwitch(){

        boolean validAnswer = false;

        System.out.println("=======================\n" +
                "Please enter the number you wish to convert to a Day\n" +
                " ==> Note that Numbers should be in between 1 and 7");

        while (!validAnswer) {
            int dayNumInput = userInput.nextInt();

            if(checkDayNum(dayNumInput)){
                validAnswer = true;
                String dayName = generateDayNameWithSwitch(dayNumInput);
                System.out.println("Your Day name is : " + dayName);


            }
            else {
                System.out.println("Numbers should be in between 1 and 7");

            }
        }


    }


    @Override
    public boolean checkMonthNum(int monthNum) {
        return 1 <= monthNum && monthNum <= 12;

    }

    @Override
    public boolean checkDayNum(int dayNum) {
        return 1 <= dayNum && dayNum <= 7;
    }


    public String generateMonthName(int monthNumInput){
        if(monthNumInput == 1){
            return "January";
        } else if (monthNumInput == 2){
            return "February";
        } else if (monthNumInput == 3){
            return "March";
        }else if (monthNumInput == 4){
            return "April";
        }else if (monthNumInput == 5){
            return "May";
        }else if (monthNumInput == 6){
            return "June";
        }else if (monthNumInput == 7){
            return "July";
        }else if (monthNumInput == 8){
            return "August";
        }else if (monthNumInput == 9){
            return "September";
        }else if (monthNumInput == 10){
            return "October";
        }else if (monthNumInput == 11){
            return "November";
        }
        else {
            return "December";
        }

    }

    private String generateMonthNameWithSwitch(int monthNumInput ){

        switch(monthNumInput)
        {
            case 1:return "January";

            case 2:return "February";

            case 3:return "March";

            case 4:return "April";

            case 5:return "May";

            case 6:return "June";

            case 7:return "July";

            case 8:return "August";

            case 9:return "September";

            case 10:return "October";

            case 11:return "November";

            case 12:return "December";

            default:throw new IllegalStateException("Unexpected value: " + monthNumInput);
        }
    }

    public String generateDayName(int dayNumInput){
        if(dayNumInput == 1){
            return "Sunday";
        } else if (dayNumInput == 2){
            return "Monday";
        } else if (dayNumInput == 3){
            return "Tuesday";
        }else if (dayNumInput == 4){
            return "Wednesday";
        }else if (dayNumInput == 5){
            return "Thursday";
        }else if (dayNumInput == 6){
            return "Friday";
        }
        else {
            return "Saturday";
        }

    }

    private String generateDayNameWithSwitch(int dayNumInput){
        switch(dayNumInput)
        {
            case 1:return "Sunday";

            case 2:return "Monday";

            case 3:return "Tuesday";

            case 4:return "Wednesday";

            case 5:return "Thursday";

            case 6:return "Friday";

            case 7:return "Saturday";

            default:throw new IllegalStateException("Unexpected value: " + dayNumInput);
        }
    }

}




