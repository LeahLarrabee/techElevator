package com.techelevator;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

    //private static final String FILE_NAME = "./input.txt";
    private static final String OUTPUT_FILE_NAME = "./300 FizzBuzz.txt";

    public static void main(String[] args) {
        createFile();

    }

    public static void createFile() {
        File outPutFile = new File(OUTPUT_FILE_NAME);
        try (//Scanner scan = new Scanner(new File(FILE_NAME));
             PrintWriter pw = new PrintWriter(new FileWriter(OUTPUT_FILE_NAME))) {


            //while (scan.hasNextLine()) {
            //int num = Integer.parseInt(scan.nextLine());
            //String[] nums = line.split("");
            //for(String value : nums)
            //for(int i = 0; i<line.length(); i++){
            //String value = line.substring(i);
            for (int i = 1; i < 301; i++) {
                if (((i % 3) == 0) && ((i % 5) == 0)) {
                    pw.println(i + "FizzBuzz");
                } else if ((String.valueOf(i).contains("3")) || ((i % 3) == 0)) {
                    pw.println(i + "Fizz");
                } else if ((String.valueOf(i).contains("5")) || ((i % 5) == 0)) {
                    pw.println(i + "Buzz");
                } else {
                    pw.println(i);
                }
            }


        } catch (Exception ex) {
            System.out.println("ERROR " + ex.getMessage());
        }

    }
}
