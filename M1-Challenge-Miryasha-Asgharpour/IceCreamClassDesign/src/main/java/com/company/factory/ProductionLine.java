package com.company.factory;

import java.util.ArrayList;

public class ProductionLine {

    private boolean emergencyStopLine;
    private boolean maintenance;
    private boolean productionLineIsOn;


    private int speedOfProduction;
    private int inputRowMaterialSpeed;
    private int outPutProductionSpeed;

    public ProductionLine(boolean emergencyStopLine, boolean maintenance, int speedOfProduction, int inputRowMaterialSpeed, int outPutProductionSpeed) {
        this.emergencyStopLine = emergencyStopLine;
        this.maintenance = maintenance;
        this.speedOfProduction = speedOfProduction;
        this.inputRowMaterialSpeed = inputRowMaterialSpeed;
        this.outPutProductionSpeed = outPutProductionSpeed;
    }

    ArrayList<String> listOfProduction;

    {
        listOfProduction = new ArrayList<>();
        listOfProduction.add("Ice Cream type two");
        listOfProduction.add("Ice Cream type four");
    }


    public void adjustProductionSpeed(){
        if (inputRowMaterialSpeed == outPutProductionSpeed){

            System.out.println("Line is working!!!!");
            productionLineIsOn = true;
        } else {
            System.out.println("change the speed of production");
        }
    }

    public boolean emergencyStop(){
        return emergencyStopLine = true;
    }



    public void setEmergencyStopLine(boolean emergencyStopLine) {
        this.emergencyStopLine = emergencyStopLine;
    }

    public boolean isMaintenance() {
        return maintenance = true;
    }

    public void setMaintenance(boolean maintenance) {
        this.maintenance = maintenance;
    }

    public int getSpeedOfProduction() {
        return speedOfProduction;
    }

    public void setSpeedOfProduction(int speedOfProduction) {
        this.speedOfProduction = speedOfProduction;
    }

    public int getInputRowMaterialSpeed() {
        return inputRowMaterialSpeed;
    }

    public void setInputRowMaterialSpeed(int inputRowMaterialSpeed) {
        this.inputRowMaterialSpeed = inputRowMaterialSpeed;
    }

    public int getOutPutProductionSpeed() {
        return outPutProductionSpeed;
    }

    public void setOutPutProductionSpeed(int outPutProductionSpeed) {
        this.outPutProductionSpeed = outPutProductionSpeed;
    }

    public ArrayList<String> getListOfProduction() {
        return listOfProduction;
    }

    public void setListOfProduction(ArrayList<String> listOfProduction) {
        this.listOfProduction = listOfProduction;
    }
}
