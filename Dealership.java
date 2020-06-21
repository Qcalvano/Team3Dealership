package edu.psu.abington.ist.ist242;

/*
Project: Car Dealership Class Creation
Purpose Details: Dealership Class
Course: IST 242
Author: Quenten Calvano
Date Developed: 6/13/20
Last Date Changed: 6/21/2020
Rev: 2
 */

import java.util.ArrayList;

public class Dealership {

    //Class level variables - Protect the data...
    private int dealershipId;
    private Car car;
    private ArrayList<SalesAssociate> employees;
    private User manager;

    public static void createSampleDealerships(ArrayList<Dealership> dList, ArrayList<Car> carList, ArrayList<SalesAssociate> saList) {
        User manager1 = new User();//FIXME: create dealership managers from manager class and format the output.
        Dealership dealer1 = new Dealership();
        dealer1.setDealershipId(1);
        dealer1.setCar(carList.get(0));
        dealer1.setEmployees(saList);
        dealer1.setManager(manager1);
        dList.add(dealer1);


        User manager2 = new User();
        Dealership dealer2 = new Dealership();
        dealer2.setDealershipId(1);
        dealer2.setCar(carList.get(0));
        dealer2.setEmployees(saList);
        dealer2.setManager(manager2);
        dList.add(dealer2);


    }

    //Constructor method...
    public void Transaction(int _dealershipId, Car _car
            , ArrayList<SalesAssociate> _employee, User _manager){
        this.dealershipId = _dealershipId;
        this.car = _car;
        this.employees = _employee;
        this.manager = _manager;
    }

    //Setters and Getters...

    public int getDealershipId() {
        return dealershipId;
    }
    public void setDealershipId(int dealershipId) {
        this.dealershipId = dealershipId;
    }
    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    }
    public ArrayList<SalesAssociate> getEmployees() {
        return employees;
    }
    public void setEmployees(ArrayList<SalesAssociate> employees) {
        this.employees = employees;
    }
    public User getManager() {
        return manager;
    }
    public void setManager(User manager) {
        this.manager = manager;
    }

    public static void viewDealerInfo(ArrayList<Dealership> dList){
        for (Dealership dealership : dList) {
            System.out.println("DealerShip ID: " + dealership.getDealershipId());
            System.out.printf("Car(s): \n\t%s\n\t$%.2f\n", dealership.getCar().getCarDescription(), dealership.getCar().getCarPrice());
            System.out.println("Manager: " + dealership.getManager());
            System.out.println("Sales Members: \n\t" + dealership.getEmployees());
        }
    }
}
