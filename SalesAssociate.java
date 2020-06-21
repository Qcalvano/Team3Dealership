package edu.psu.abington.ist.ist242;

/*
Project: Car Dealership Class Creation
Purpose Details: SalesAssociate Class
Course: IST 242
Author: Michael Mandia
Date Developed: 6/13/20
Last Date Changed: 6/14/2020
Rev: 2
 */

import java.util.ArrayList;
public class SalesAssociate extends User {
    //class variable -Protect Data
    private int carId;
    private int salesmanId;
    private boolean carSold;
    private String carDescription;
    private int customerId;

    //Constructor
    public void salesAssociate(int _carId, int _salesmanId, boolean _carSold, String _carDescription, int _customerId) {
        this.carId = _carId;
        this.salesmanId = _salesmanId;
        this.carSold = _carSold;
        this.carDescription = _carDescription;
        this.customerId = _customerId;
    }

    //setter & getter
    public int getCarId() {
        return carId;
    }
    public void setCarId(int carId) {
        this.carId = carId;
    }
    public int getSalesmanId() {
        return salesmanId;
    }
    public void setSalesmanId(int salesmanId) {
        this.salesmanId = salesmanId;
    }
    public boolean getCarSold() {
        return carSold;
    }
    public void setCarSold(boolean carSold) {
        this.carSold = carSold;
    }
    public String getCarDescription() {
        return carDescription;
    }
    public void setCarDescription(String carDescription) {
        this.carDescription = carDescription;
    }
    public int getCustomerId(){
        return customerId;
    }
    public void setCustomerId(int customerId){
        this.customerId = customerId;
    }

    // Printing info
    public void viewRecordSales() {
        System.out.println("Car Id: " + getCarId());
        System.out.println("Salesman Id: " + getSalesmanId());
        System.out.println("Car sold: " + getCarSold());
        System.out.println("Car Description: " + getCarDescription());
    }
    public void updateCarEntries() {
        System.out.println("Car Id: " + getCarId());
        System.out.println("Car Description: " + getCarDescription());
    }
    public void viewCustomerContacts() {
        System.out.println("Car ID: " + getCarId());
        System.out.println("Customer Contact Id: " + getCustomerId());
    }

}