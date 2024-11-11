package com.assignment3.spark;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.*;
import org.apache.spark.api.java.function.*;
import org.apache.spark.SparkFiles;
import java.util.List;
import java.util.ArrayList;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;

import scala.Tuple2;

import org.apache.spark.sql.Dataset;

public class Task2 {

    /*
     * This class implements the word count algorithm
     */

    static class Filter implements FlatMapFunction<String, String>
    {
        @Override
        public Iterator<String> call(String s) {
            /*
             * add your code to filter words
             */
            String[] subStrings = s.split("\\s+");
            return Arrays.asList(subStrings).iterator();
        }

    }

    public static void main(String[] args) {
        String textFilePath = "hdfs://namenode:9000/input/pigs.txt";
        SparkConf conf = new SparkConf().setAppName("WordCountWithSpark").setMaster("spark://spark-master:7077");
        JavaSparkContext sparkContext =  new JavaSparkContext(conf);
        JavaRDD<String> textFile = sparkContext.textFile(textFilePath);
        JavaRDD<String> words = textFile.flatMap(new Filter());

        /*
         * add your code for key value mapping
         *
         * add your code to perform reduce on the given key value pairs
         *
         * print the word count and save the output in the format, e.g.,(in:15) to an 'output' folder (on HDFS for task 2)
         * try to consolidate your output into single text file if you want to check your output against the given sample output
         */
        sparkContext.stop();
        sparkContext.close();
    }
}

