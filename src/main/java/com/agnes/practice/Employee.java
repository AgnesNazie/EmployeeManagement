package com.agnes.practice;

import java.time.LocalDate;

public abstract class Employee {
    private static int sequencer = 0;
    private int id;
    private String name;
    private double salary;
    private LocalDate dateHired;

    //constructor

    public Employee( String name, double salary, LocalDate dateHired) {
        this.id = ++sequencer;
        setName(name);
        this.salary = 25000;
        this.dateHired = dateHired;
    }
    //getter for id

    public int getId() {
        return id;
    }
    //getter for name

    public String getName() {
        return name;
    }
    //setter for name


    public void setName(String name) {
        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("Name cannot be null or empty");
        this.name = name;
    }

    //getter for salary
    public double getSalary() {
        return salary;
    }
    //setter for salary

    public void setSalary(double salary) {

        this.salary = salary;
    }

    //getter for date hired
    public LocalDate getDateHired() {
        return dateHired;
    }

    public abstract void calculateSalary();

    @Override
    public String toString() {
        return "ID: " + id + " Name: " + name + ", Salary: " + salary + ", Hired: " + dateHired;
    }

}
