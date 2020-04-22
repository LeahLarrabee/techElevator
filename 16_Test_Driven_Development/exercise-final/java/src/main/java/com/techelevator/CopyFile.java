package com.techelevator;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(
                new File("./PastTeamPairings.txt"));
            PrintWriter pw = new PrintWriter(new FileWriter("./TeamCopy.txt"));
        ){
            while(scanner.hasNextLine()){
                pw.println(scanner.nextLine());
                System.out.println(scanner.nextLine());
            }
        }catch(Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
