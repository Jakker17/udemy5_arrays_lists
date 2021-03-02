package com.company.BankingApp;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String name){

        if (findBranch(name)==null) {
            branches.add(new Branch(name));
            return true;
        }

    return false;
    }

    private Branch findBranch(String name){
        for (Branch branch:branches) {
            if (branch.getName().equals(name))return branch;
        }
        return null;
    }

    public boolean addCustomer(String nameOfBranch,String nameOfCustomer, double transaction){
        Branch branch = findBranch(nameOfBranch);
            if (branch!=null){
                return branch.newCustomer(nameOfCustomer,transaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String nameOfBranch,String nameOfCustomer, double transaction){
        Branch branch = findBranch(nameOfBranch);
        if (branch!=null) return branch.addCustomerTransaction(nameOfCustomer,transaction);
        return false;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            System.out.println("Customer details for branch " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(int i=0; i<branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");
                if(showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for(int j=0; j<transactions.size(); j++) {
                        System.out.println("[" + (j+1) + "]  Amount "  + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }


}
