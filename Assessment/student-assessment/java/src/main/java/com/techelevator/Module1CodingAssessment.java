package com.techelevator;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Module1CodingAssessment {
	//file name
	private static final String FILE_NAME = "./data-files./TellerInput.csv";

	public static void main(String[] args) {

		//Create instances of TellerMachine class and print to show toString()
		TellerMachine honda = new TellerMachine("Honda",new BigDecimal(10000.00),new BigDecimal(1000.00));

		TellerMachine toysRUs = new TellerMachine("ToysRUs",new BigDecimal(500.00),new BigDecimal(500.00));

		TellerMachine blockBusters = new TellerMachine("blockBusters",new BigDecimal(500.00),new BigDecimal(600.00));

		System.out.println(honda);
		System.out.println(toysRUs);
		System.out.println(blockBusters);

		//using instances of to test methods
		System.out.println("Honda's balance : $" + honda.balance());

		System.out.println("This should be Honda's card (true)? " + honda.cardNumber("5123456789123456"));


		//Add up the total balance for all of the teller machines in the list, and print it to the screen.
		List<TellerMachine> manu = Module1CodingAssessment.readFile(FILE_NAME);
		BigDecimal totalBal = BigDecimal.ZERO;
		for(TellerMachine value : manu){
			totalBal = totalBal.add(value.balance());
		}
		System.out.println("Total Balance of csv file: $" + totalBal);
	}


	//read in the provided csv file TellerInput.csv, and use it to populate a list of Teller Machine objects.
	private static List<TellerMachine> readFile(String fileName){
		List<TellerMachine> tmList = new ArrayList<>();

		try(Scanner scan = new Scanner(new File(fileName))){
			while(scan.hasNextLine()){
				String line = scan.nextLine();
				String [] manufacturers = line.split(",");
				TellerMachine value = null;
				value = new TellerMachine(manufacturers[0],new BigDecimal(manufacturers[1]), new BigDecimal(manufacturers[2]));

				tmList.add(value);
			}

		}catch (Exception ex){
			System.out.println("Error " + ex.getMessage());
		}
		return tmList;

	}

}
