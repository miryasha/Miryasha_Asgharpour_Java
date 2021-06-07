package com.company.factory;

public class Main {
    public static void main(String[] args){
        ProductionLine productionLine1 = new ProductionLine(false,false,10, 1000, 1000);
        ProductionLine productionLine2 = new ProductionLine(false,false,10, 100, 1000);
        ProductionLine productionLine3 = new ProductionLine(false,false,10, 1000, 1000);

        productionLine1.adjustProductionSpeed();

        System.out.println("=========================");

        productionLine2.adjustProductionSpeed();

        System.out.println("=========================");

        productionLine3.setEmergencyStopLine(true);
        productionLine3.adjustProductionSpeed();

    }
}
