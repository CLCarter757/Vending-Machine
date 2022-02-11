package com.techelevator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;

public class Log {
    LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();

    public void writeLog(String transaction, double startBalance, double endBalance) {

        try(PrintWriter logWriter = new PrintWriter(new FileOutputStream("log.txt"), true)) {

            logWriter.println(date + " " + time + " " + transaction + " " + startBalance + " " + endBalance);

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");;
        }
    }

}
