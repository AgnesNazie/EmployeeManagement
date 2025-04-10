package com.agnes.practice;


import java.time.LocalDate;

public class SalesPerson extends Employee {
    private String[] clients;
    private int acquiredClients;
    private int clientCount;

    //constructor


    public SalesPerson(String name, LocalDate dateHired,  int maxClients) {
        super(name, dateHired);
        this.clients = new String[maxClients];
        this.acquiredClients = 0;
        this.clientCount = 0;
        calculateSalary();
    }

    //Add a maintained  clients

    public void addMaintainedClients(String clientName) {
        if (clientCount < clients.length) {
            clients[clientCount++] = clientName;
            calculateSalary();
        } else {
            System.out.println("Max clients reached");

        }
    }
        //acquired a new client

        public void acquiredNewClients () {
            acquiredClients++;
            calculateSalary();
        }

        //@override method implemented
        @Override
        public void calculateSalary () {
            double newSalary = 25000 + (clientCount * 500) + (acquiredClients * 1000);
            setSalary(newSalary);
        }
        //implement to string

        @Override
        public String toString () {
            String clientList = String.join(",", clients);
            return super.toString() + ", Clients: " + clientList + ", Acquired Clients: " + acquiredClients;
        }

    }
