package com.example.csvhandler;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CSVHandler csvHandler = new CSVHandler();
        String filePath = "src/main/resources/data.csv";

        // Sample data to write to CSV
        List<String[]> dataToWrite = new ArrayList<>();
        dataToWrite.add(new String[] {"ID", "Name", "Age"});
        dataToWrite.add(new String[] {"1", "Alice", "23"});
        dataToWrite.add(new String[] {"2", "Bob", "34"});
        dataToWrite.add(new String[] {"3", "Charlie", "29"});

        // Write data to CSV file
        csvHandler.writeToCSV(filePath, dataToWrite);

        // Read and display data from CSV file
        csvHandler.readFromCSV(filePath);
    }
}
