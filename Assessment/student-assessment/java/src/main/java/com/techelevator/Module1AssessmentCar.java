package com.techelevator;

import com.techelevator.log.Logger;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Module1AssessmentCar {
    private static final String FILE_NAME = "./data-files/CarInput.csv";

    public static void main(String[] args) {

        try{
            Logger.openFile("./log.txt");
        }catch (Exception ex){
            Logger.closeFile();

        }

        Car car1 = new Car(2015, "Buick", false);

        System.out.println(car1);

        //calling below modulized methods
        printCars(readFile(FILE_NAME));
        Logger.closeFile();

        System.out.println("Epoch " + LocalDate.ofEpochDay(3000));


    }
    private static void printCars(List<Car> list){
        for(Car value : list){
            System.out.println(value);
            Logger.writeLog(value.toString());
        }
    }


    private static List<Car> readFile(String fileName) {
        List<Car> listCar = new ArrayList<>();

        try (Scanner scan = new Scanner(new File(fileName))) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] car = line.split(",");
                //refactor
                //String [] token = scan.nextLine().split(",");
                Car instanceCar = new Car(Integer.parseInt(car[0]), car[1], Boolean.parseBoolean(car[2]));
                listCar.add(instanceCar);
            }

        } catch (Exception ex) {
            Logger.writeLog("Error " + ex.getMessage());
            Logger.closeFile();
            System.exit(1);

        }
        return listCar;
    }


}
