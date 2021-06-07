package com.freightCompany;

import java.util.ArrayList;

public class DataCenter extends DataSearch {

    ArrayList<Customer> customerArrayList = new ArrayList<>();
    ArrayList<ShippingAddress> shippingAddressList = new ArrayList<>();
    ArrayList<BillingAddress> billingAddressList = new ArrayList<>();


    public void addData(){



        Customer customer1 = new Customer("firstName1", "lastName1", "email1@aa.com", 1234, true);
        Customer customer2 = new Customer("firstName2", "lastName2", "email2@bb.com", 5678, true);
        Customer customer3 = new Customer("firstName3", "lastName3", "email3@cc.com", 9112, true);

        ShippingAddress shippingAddress1 = new ShippingAddress("ship1", "shipS1", "shipCity1", "shipState1", 98765);
        ShippingAddress shippingAddress2 = new ShippingAddress("ship2", "shipS2", "shipCity2", "shipState2", 54321);

        BillingAddress billingAddress1 = new BillingAddress("bill1", "billS1", "billCity1", "billState1", 98765);
        BillingAddress billingAddress2 = new BillingAddress("bill2", "billS2", "billCity2", "billState2", 54321);


        customerArrayList.add(customer1);
        customerArrayList.add(customer2);

        shippingAddressList.add(shippingAddress1);
        shippingAddressList.add(shippingAddress2);

        billingAddressList.add(billingAddress1);
        billingAddressList.add(billingAddress2);
    }


    @Override
    public void printAllTheData() {
        for(int i=0; i< customerArrayList.size(); i++) {
            System.out.println(customerArrayList.get(i));

        }

    }

    @Override
    public void printCustomerData(int searchItem) {

        System.out.println("Retrieve data for: " + customerArrayList.get(searchItem).getFirstName());
        System.out.println(customerArrayList.get(searchItem));


    }

    @Override
    public void onDocument(String searchItem) {
        for (int i=0; i< customerArrayList.size(); i++){
            if(customerArrayList.get(i).getFirstName().contains(searchItem))
            {
                printCustomerData(i);

            } else {
                System.out.println("There is no data to show");

            }
                break;
        }

    }
}
