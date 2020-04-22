package com.techelevator;

import java.util.Objects;

public class Car {
    //Fields
    private int year;

    private String make;

    private boolean isClassicCar;

    //Constructor

    public Car(int year, String make, boolean isClassicCar) {
        this.year = year;
        this.make = make;
        this.isClassicCar = isClassicCar;
    }

    //Getters and setters

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public boolean isClassicCar() {
        return isClassicCar;
    }

    public void setClassicCar(boolean classicCar) {
        isClassicCar = classicCar;
    }


    // methods

    //indicates the age in years of the car from the current year
    public int getAge(){
        int currentYear = 2020;
        return currentYear - this.year;
    }

    //check if eCheck light is on
    public boolean isECheck(int yearToCheck){
        if (isClassicCar){
            return false;
        }
        if((getAge() <4) || (getAge()>25))

        if((year % 2 == 0) && (yearToCheck%2 == 0)){
            return true;
        }
        if ((year % 2 != 0) && (yearToCheck%2 != 0)){

        }
        return false;
    }


    @Override
    public String toString() {
        return "Car - " + year + "-" + make + "isClassic: " + isClassicCar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return year == car.year &&
                isClassicCar == car.isClassicCar &&
                Objects.equals(make, car.make);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, make, isClassicCar);
    }
}
