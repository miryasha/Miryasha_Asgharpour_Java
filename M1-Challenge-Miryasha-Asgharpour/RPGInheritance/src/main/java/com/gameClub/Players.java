package com.gameClub;

import java.util.Objects;

public class Players {

    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;

    public Players(String name, int strength, int health, int stamina, int speed, int attackPower) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
    }


    public void run(int speed){
        System.out.println("You are on <coordination>");
    }

    public int attack(){
        //decreaseStamina(int attackPower);
         return 0;
    }


    public int heal(){
        return 0;
    }

    public int decreaseHealth(){
        return 0;
    }
    public int increaseStamina(){
        return 0;
    }

    public int decreaseStamina(int attackPower){
        return 0;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Players that = (Players) o;
        return strength == that.strength && health == that.health && stamina == that.stamina && speed == that.speed && attackPower == that.attackPower && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, strength, health, stamina, speed, attackPower);
    }

    @Override
    public String toString() {
        return "Properties{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                '}';
    }
}
