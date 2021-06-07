package com.freightCompany;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        DataCenter dataCenter = new DataCenter();

        dataCenter.addData();

        //dataCenter.printAllTheData();
        System.out.println("============");

        dataCenter.onDocument("firstName1");
        System.out.println("============");

        dataCenter.onDocument("lastName4");
        System.out.println("============");

        dataCenter.onDocument("firstName1");

        System.out.println("============");
    }


}
