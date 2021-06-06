package com.company.sales;

public class Inventory implements IInventory{

    private int orderLevel;
    String listOfItems;

    public Inventory(int orderLevel,  String listOfItems) {
        this.orderLevel = orderLevel;
        this.listOfItems = listOfItems;
    }


    @Override
    public void putOrder() {
        System.out.println("You put Order");
    }

    @Override
    public void defineOrderLevel(int orderDefault) {
        orderDefault = 5;
        if(orderDefault == orderLevel){
            sendAlert();
        }

    }

    @Override
    public void sendAlert() {
        System.out.println("Alert!! Order level");

    }

    @Override
    public boolean stopOrdering(String item){
        return true;
    }

    @Override
    public boolean chekInItems(){
        return true;
    }
    @Override
    public boolean chekOutItems(){
        return true;
    }
}
