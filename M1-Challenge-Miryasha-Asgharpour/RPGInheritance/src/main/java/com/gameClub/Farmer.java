package com.gameClub;

public class Farmer extends Players {
    private int foodProductionSpeed;


    public Farmer(String name,int foodProductionSpeed ) {
        super(name, 75, 100, 75, 10, 1);
        this.foodProductionSpeed = foodProductionSpeed;

    }

    public void plow(){
        System.out.println("increased foodResource to ??<foodResource>" );
    }






}
