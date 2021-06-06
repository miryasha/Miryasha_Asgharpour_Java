package com.gameClub;

public class Constable extends Players{

    private int jurisdiction = 100;

    public Constable(String name) {
        super(name, 60, 100, 60, 20, 5);
    }

    public String arrest(String name){

        return ("You're under arrest " + name);
    }

    public int betray(){
        System.out.println("Your jurisdiction dropt! Now yours is :" );
        return jurisdiction - 10;

    }

}
