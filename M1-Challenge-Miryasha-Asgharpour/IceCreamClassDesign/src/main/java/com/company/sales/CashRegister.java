package com.company.sales;

public class CashRegister extends Inventory{

    boolean isOn;
    int cashInRegister;

    public CashRegister(int orderLevel, String listOfItems, boolean isOn, int cashInRegister) {
        super(orderLevel, listOfItems);
        this.isOn = isOn;
        this.cashInRegister = cashInRegister;
    }

    public CashRegister(int orderLevel, String listOfItems) {
        super(orderLevel, listOfItems);
    }


    public void turningOff(){
        System.out.println("Register is Off!");
        isOn = false;
    }

    public void sell(int paidPrice){

        cashInRegister = cashInRegister - paidPrice;
        System.out.println("you have " + cashInRegister + " $ in register");

    }


}
