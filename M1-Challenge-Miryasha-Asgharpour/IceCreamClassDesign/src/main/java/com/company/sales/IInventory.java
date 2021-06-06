package com.company.sales;

public interface IInventory {
    void putOrder();
    void defineOrderLevel(int orderDefault);
    void sendAlert();
    boolean stopOrdering(String item);
    boolean chekInItems();
    boolean chekOutItems();

}
