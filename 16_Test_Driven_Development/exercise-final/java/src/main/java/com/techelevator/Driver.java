package com.techelevator;

import java.io.*;

public class Driver {

    private final String FILE_NAME = "./PastTeamPairings.txt";

    public static void main(String[] args) {
        Driver driver = new Driver();

        //Reader theFile = null;

 //       if(theFile == null){
//            System.exit(1);
//        }
        try(Reader theFile = driver.openTheFile()) {

            //theFile = driver.openTheFile();
            driver.readTheFile(theFile);


        } catch (FileNotFoundException ex){
            System.out.println ("File Not Found Error " + ex.getMessage());
            System.exit(1);

        } catch (IOException ex){
        System.out.println ("Error " + ex.getMessage());
        System.exit(1);

    }
    }



    public Reader openTheFile() throws FileNotFoundException{
        File ourFile = new File(FILE_NAME);

        if(ourFile == null || !ourFile.isFile()){
            System.out.println(FILE_NAME + " is not a file or null!");
           return null;
        }
            System.out.println(ourFile.getName());
//            Reader fileReader = null;
//            fileReader = new BufferedReader(new FileReader(ourFile));
//            try {
//                fileReader = new FileReader(ourFile);
//            } catch (FileNotFoundException ex){
//                System.out.println ("Error " + ex.getMessage());
//                return null;
//            }
            return (new BufferedReader(new FileReader(ourFile)));  //new Scanner(ourFile);  //scanner.hasNextLine()

    }

    public void readTheFile(Reader theFile) throws IOException{
        BufferedReader br =(BufferedReader)theFile;
        String line = null;
        while((line=br.readLine()) != null){
            System.out.println(line);
        }

    }
}
