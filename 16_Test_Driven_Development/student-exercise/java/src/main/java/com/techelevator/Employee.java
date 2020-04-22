package com.techelevator;

import java.math.BigDecimal;

public class Employee {
    //Fields
    private String name;

    private BigDecimal salary = BigDecimal.ZERO;

    //Constructors
    public Employee(){}


    public Employee(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }

    //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    //Methods

    //method to raise salary
    public BigDecimal raiseSalary(BigDecimal raiseAmount){
        setSalary(getSalary().add(raiseAmount));
        BigDecimal raisedSalary = getSalary();
        return raisedSalary;
    }

    @Override
    public String toString() {
        return "Employee" +
                " name: " + name  +
                ", Hourly Salary : $" + salary;
    }
}
