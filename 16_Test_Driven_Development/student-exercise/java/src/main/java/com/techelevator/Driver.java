package com.techelevator;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        //New instances of Employees
        Employee emp1 = new Employee("Bob", new BigDecimal(15));

        Employee emp2 = new Employee("Lisa", new BigDecimal(20));

        Employee emp3 = new Employee("Ted", new BigDecimal(10));

        //check outprint
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);

        System.out.println(loadEmployees("./inputtest.txt"));
    }

    private static List<Employee> loadEmployees(String fileName){
        List<Employee> employeeList = new ArrayList<>();

        try(Scanner scan = new Scanner(new File(fileName))){
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                String [] emp = line.split(" ");
                Employee value = null;
                value = new Employee(emp[0],new BigDecimal(emp[1]));

                employeeList.add(value);
                }

        }catch (Exception ex){
            System.out.println("Error " + ex.getMessage());
        }
        return employeeList;
    }
}
