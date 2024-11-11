package com.assignment3.spark;

import java.util.Map;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.RuntimeConfig;
import org.apache.spark.sql.functions;
import scala.Tuple2;

public class Task3 {
    public static void main(String[] args) {

        /*
         * This class aggregates emission data by IPCC Code
         */   

        // Initialize Spark session
        SparkSession spark = SparkSession.builder()
                .appName("Task3")
                .getOrCreate();

        // Specify the HDFS path to the CSV file
        String hdfsPath = "hdfs://namenode:9000/input/EDGAR_AR4_GHG_1970_2022.csv";

        // Select the columns representing the years and the grouping column
        String[] yearColumns = new String[53];  // Array for columns from 1970 to 2022
        for (int i = 0; i < 53; i++) {
            yearColumns[i] = "Y_" + (1970 + i);  // "1970", "1971", ..., "2022"
        }

        // Load the emissions data from HDFS (CSV file)
                
        // Sum all the year columns for each `ipcc_code_1996_for_standard_report`

        // Show the results (this will print the top 20 by default)

        // Save the aggregated results back to HDFS (optional)

        // Stop the Spark session
        spark.stop();
    }
}
