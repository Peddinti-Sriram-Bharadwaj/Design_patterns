package com.project.templatemethod;

public class CsvDataMiner extends DataMiner{
  @Override
  protected void extractData(){
    System.out.println("Extracting data from CSV file...");
  }

  @Override
  protected void parseData(){
    System.out.println("Parsing data from CSV file (splitting by commas)...");
  }
}
