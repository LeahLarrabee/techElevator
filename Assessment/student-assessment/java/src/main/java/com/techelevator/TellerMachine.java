package com.techelevator;

import java.math.BigDecimal;

public class TellerMachine {

    //Fields

    private String manufacturer;

    private BigDecimal deposits;

    private BigDecimal withdrawals;

    //Constructor

    public TellerMachine(String manufacturer, BigDecimal deposits, BigDecimal withdrawals) {
        this.manufacturer = manufacturer;
        this.deposits = deposits;
        this.withdrawals = withdrawals;
    }

    //Getters and Setters


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public BigDecimal getDeposits() {
        return deposits;
    }

    public void setDeposits(BigDecimal deposits) {
        this.deposits = deposits;
    }

    public BigDecimal getWithdrawals() {
        return withdrawals;
    }

    public void setWithdrawals(BigDecimal withdrawals) {
        this.withdrawals = withdrawals;
    }

    //Methods

    //returns balance after total deposit and total withdrawals
    public BigDecimal balance(){

        return getDeposits().subtract(getWithdrawals());
    }

    //checks to see if a string parameter, cardNumber, is a valid card -- returns true if so
    public boolean cardNumber(String cardNumber) {

        if ((cardNumber.startsWith("5")) && (cardNumber.length() == 16)) {
            return true;
        } else if ((cardNumber.startsWith("4")) && (cardNumber.length() == 13) || (cardNumber.length() == 16)) {
            return true;
        } else if ((cardNumber.startsWith("3")) && (cardNumber.substring(1).equals("4")) || (cardNumber.substring(1).equals("7"))) {
            return true;
        } else return false;
    }


    @Override
    public String toString() {
        return "ATM - " + "{" +manufacturer +"}" + " - " + "{" +"$"+ balance() +"}";
    }
}
