package com.company.BankingApp;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double transaction){
        customers.add(new Customer(name,transaction));
        for (Customer customer:customers) {
            if (customer.getName().equals(name))return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String name, double transaction){
        Customer customer = findCustomer(name);
        customer.addTransaction(transaction);
        ArrayList<Double> transactions = customer.getTransactions();
        for (Double customerTransaction:transactions) {
            if (customerTransaction.equals(transaction))return true;
        }
        return false;
    }

    private Customer findCustomer(String name){
        for (Customer customer:customers) {
            if (customer.getName().equals(name))return customer;
        }
        return null;
    }



}

