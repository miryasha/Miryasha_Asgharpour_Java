package com.company.factory;

public class Main {
    public static void main(String[] args){
        ProductionLine productionLine = new ProductionLine(false,false,10, 1000, 1000);

        productionLine.adjustProductionSpeed();

    }
}
