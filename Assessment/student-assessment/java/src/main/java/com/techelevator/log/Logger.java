package com.techelevator.log;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Logger {


private static PrintWriter pw;



    public static void openFile (String fileName) throws Exception {
        pw = new PrintWriter(new FileWriter(fileName));

    }

    public static void writeLog(String message){
    pw.println(LocalDateTime.now() + "-" + message);
    }

    public static void closeFile(){
    pw.close();
    }

}
